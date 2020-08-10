from bs4 import BeautifulSoup

html = '''
<td class="title">
    <div class="tit3">
        <a href="/movie/bi/mi/basic.nhn?code=189069" title="다만 악에서 구하소서">다만 악에서 구하소서</a>
    </div>
</td>
'''


# 1. tag 조회
def ex01():
    bs = BeautifulSoup(html, 'html.parser')
    # print(bs)
    tag_td = bs.td
    # print(tag_td)
    tag_a = tag_td.a
    # print(tag_a)

    tag_h4 = bs.td.n4
    # print(tag_h4) # None


# 2. attribute(속성) 값 가져오기
def ex02():
    bs = BeautifulSoup(html,'html.parser')
    tag_td = bs.td
    print(tag_td['class']) # 출력결과는 리스트로 나옴. 클래스를 여러개 줄 수 있기 때문에.

    tag_div = bs.div
    # print(tag_div['id']) # id는 딱 하나만 넣을 수 있기 때문에 리스트로 안나옴. # 에러출력
    print(tag_div.attrs) # 모든 속성 가져오기

# 3. attribute로 조회하기
def ex03():
    bs = BeautifulSoup(html, 'html.parser')
    tag_td = bs.find('td',attrs={'class':'title'})
    print(tag_td)

    tag_div = bs.find(attrs={'class':'tit3'})
    print(tag_div)


if __name__ == '__main__':
    # ex01()
    # ex02()
    ex03()