from itertools import count

from bs4 import BeautifulSoup

from collection import crawler

import pandas as pd

def crawling_pelicana():
    results = []
    for page in count(start=1, step=1):
        url = 'https://pelicana.co.kr/store/stroe_search.html?branch_name=&gu=&si=&page=%d' % page
        html = crawler.crawling(url)

        bs = BeautifulSoup(html, 'html.parser')
        tag_table = bs.find('table',attrs={'class':['table','mt20']})
        tag_tbody = tag_table.find('tbody')
        tags_tr = tag_tbody.findAll('tr')

        # 끝 검출
        if len(tags_tr) == 0:
            break

        for tag_tr in tags_tr:
            strings = list(tag_tr.strings)
            name = strings[1]
            address = strings[3]

            sidogu = address.split()[0:2]

            t = (name, address) + tuple(sidogu)
            results.append(t)

    # store
    table = pd.DataFrame(results,columns=['name','address','sido','gugun'])
    table.to_csv('results/pelicana.csv', encoding='utf-8',mode='w', index=True)

        # print(name,address, sep=':')

def crawling_kyochon():
    pass

def crawling_goobne():
    pass

if __name__ == '__main__':
    # pelicana
    crawling_pelicana()

    # nene
    # crawling_nene()


    # kyochon

    # goobne