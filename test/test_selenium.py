import time
from selenium import webdriver

# 파이썬 selenium webdriver 테스트 - 구글 html 가져오기
wd = webdriver.Chrome('/Applications/gachon2020/chromedriver')
wd.get('http://www.google.com')

time.sleep(2)
html = wd.page_source
print(html)

wd.quit()