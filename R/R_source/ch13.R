mpg <- as.data.frame(ggplot2::mpg)

library(dplyr)
summary(mpg)


mpg_diff <- mpg %>% 
  select(class,cty) %>% 
  filter(class %in% c("compact", "suv"))

head(mpg_diff)

table(mpg_diff$class)

t.test(data = mpg_diff, cty ~ class, var.equal = T)
#일반 휘발유와 고급 휘발유의 도시연비 t 검정

mpg_diff2 <- mpg %>%
  select(fl, cty) %>% 
  filter(fl %in% c("r", "p"))

table(mpg_diff2$fl)

t.test(data = mpg_diff2, cty ~ fl, var.equal = T)

economics <- as.data.frame(ggplot2::economics)
cor.test(economics$unemploy, economics$pce)
rm(ecnonmics)

#상관행렬 히트맵 만들기
head(mtcars)

car_cor <- cor(mtcars)
round(car_cor,2)

install.packages("corrplot")
library(corrplot)
corrplot(car_cor)
corrplot(car_cor, method = "number")

col <- colorRampPalette(c("#BB4444", "#EE9988", "#FFFFFF", "#77AADD", "#4477AA"))
corrplot(car_cor,
         method = "color",
         col = col(200),
         type = "lower",
         order = "hclust",
         addCoef.col = "black",
         tl.col = "black",
         tl.srt = 45,
         diag = F)        

