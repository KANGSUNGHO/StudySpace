# 혼자서해보기(p 324)
library(ggplot2)
mpg <- as.data.frame(ggplot2::mpg)
mpg$hw_ct <- (mpg$hwy + mpg$cty)/2
df_com <- mpg[mpg$class == "compact",]
df_suv <- mpg[mpg$class == "suv",]
mean(df_com$hw_ct)
mean(df_suv$hw_ct)