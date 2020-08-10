import sys
from datetime import datetime
from urllib.request import Request, urlopen

def error_default(e):
    print(f'{e} : {datetime.now()}', file=sys.stderr)

# err = lambda e: print(f'{e} : {datetime.now()}', file=sys.stderr)
def crawlling(url='',encoding='utf-8', err=error_default):
    try:
        request = Request(url)
        response = urlopen(request)
        print(f'{datetime.now()} success for request[{url}]')

        receive = response.read()
        return receive.decode(encoding)

    except Exception as e:
        if err is not None:
            err(e)


