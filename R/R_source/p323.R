# 내장함수를 dplyr 함수로 바꾸기(P 323)
# 수학 점수 50이상, 영어 점수 80이상인 학생들을 대상으로
# 각 반의 전 과목 총평균을 구하라


# 내장함수
# exam$tot <- (exam$math + exam$english + exam$science)/3
# aggregate(date=exam[exam$math >= 50 & exam$english >= 80,] tot~class, mean)

#dplyr함수
exam %>% 
  filter(math >= 50 & english >= 80) %>% 
  mutate(tot = (math + english + science)/3) %>% 
  group_by(class) %>% 
  summarise(tot_mean = mean(tot))