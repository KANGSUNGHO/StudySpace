import ssl
import sys
from datetime import datetime
from urllib.request import Request, urlopen

# def error_default(e):
#     print(f'{e} : {datetime.now()}', file=sys.stderr)

# err = lambda e: print(f'{e} : {datetime.now()}', file=sys.stderr)


def crawling(url='',encoding='utf-8', err=lambda e: print(f'{e} : {datetime.now()}', file=sys.stderr)):
    try:
        context = ssl._create_unverified_context()
        request = Request(url)
        response = urlopen(request,context=context)
        print(f'{datetime.now()} : success for request[{url}]')

        receive = response.read()
        return receive.decode(encoding, errors='replace')

    except Exception as e:
        if err is not None:
            err(e)


