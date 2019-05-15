# 패키지 설치
install.packages("rJava")
install.packages("memoise")
install.packages("KoNLP")

#패키지 로드
library(KoNLP)
library(dplyr)

#사전 설정하기
useNIADic()

#데이터 불러오기
txt <- readLines("hiphop.txt")
head(txt)

install.packages("stringr")
library(stringr)

#특수문자 제거
txt <- str_replace_all(txt, "\\W", " ")

extractNoun("대한민구의 영토는 한반도와 그 부속도서로 한다")

#가사에서 명사 추출
nouns <- extractNoun(txt)

#추출한 명사 list를 문자열 벡터로 변환, 단어별 빈도표 생성
wordcount <- table(unlist(nouns))

#데이터 프레임으로 변환
df_word <- as.data.frame(wordcount, stringsAsFactors = F)



#변수명 수정
df_word <- rename(df_word,
                  freq = Freq)

#두 글자 이상 단어 추출
df_word <- filter(df_Word, nchar(word) >= 2)
head(df_word)
top_20 <- df_word %>%
  arrange(desc(freq)) %>% 
  head(20)
top_20

#패키지 설치
install.packages("wordcloud")

#패키지 로드
library(wordcloud)
library(RColorBrewer)

#Dark2 색상 목록에서 8개 색상 추출
pal <- brewer.pal(8,"Dark2")

set.seed(1234)

wordcloud(words = df_word$word,
          freq = df_word$freq,
          min.freq = 2,
          max.words = 200,
          random.order = F,
          rot.per = .1,
          scale = c(4, 0.3),
          colors = pal)
pal <- brewer.pal(8,"Blues")[5:9]
set.seed(1234)
wordcloud(words = df_word$word,
          freq = df_word$freq,
          min.freq = 2,
          max.words = 200,
          random.order = F,
          rot.per = .1,
          scale = c(4, 0.3),
          colors = pal)
