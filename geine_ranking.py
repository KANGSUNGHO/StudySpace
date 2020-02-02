import requests
from bs4 import BeautifulSoup

from pymongo import MongoClient           # pymongo를 임포트
client = MongoClient('localhost', 27017)  # mongoDB는 27017 포트
db = client.dbgenie                      # 'dbgenie'라는 이름의 db를 만듦

# URL을 읽어서 HTML를 받아오고,
headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'
}

data = requests.get('https://www.genie.co.kr/chart/top200?ditc=D&rtm=N&ymd=20190908',headers=headers)

# HTML을 BeautifulSoup이라는 라이브러리를 활용해 검색하기 용이한 상태로 만듦
soup = BeautifulSoup(data.text,'html.parser')

# select를 이용해서, tr들을 불러오기
musics = soup.select('#body-content > div.newest-list> div.music-list-wrap > table > tbody > tr')
# musics (tr들)의 반복문을 돌리기
rank = 1
for music in musics:

    a_title = music.select_one('td.info > a')
    a_singer = music.select_one('td.info > a + a')

    if a_title is not None:
        if a_singer is not None:
            title = a_title.text.strip()
            singer = a_singer.text.strip()
            doc = {
                'rank': rank,
                'title': title,
                'singer': singer
            }
            db.musics.insert_one(doc) # dbgenie에 1위부터 50위까지 제목, 가수 이름 저장
            print(rank,title,singer)
            rank += 1

