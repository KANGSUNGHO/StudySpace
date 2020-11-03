from urllib.parse import urlencode
from urllib.request import urlopen, Request


# GET
httpresponse = urlopen('http://www.example.com?a=10&b=20')
body = httpresponse.read()
print(body)


# POST
data = {
    'email':'sungho@gmail.com',
    'password':'1234',
    'name':'강성호'
}
data = urlencode(data).encode('utf-8')

request = Request('http://example.com',data)
request.add_header('content-type','text/html')

httpresponse=  urlopen(request)
print(httpresponse.read())