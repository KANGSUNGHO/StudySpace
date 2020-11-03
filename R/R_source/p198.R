# 혼자서 해보기 p198

library(ggplot2)
library(dplyr)
mpg <- as.data.frame(ggplot2::mpg)
cl_mpg <- mpg %>%
  filter(class %in% c("compact", "subcompact", "suv")) 
cl_mpg
ggplot(data = cl_mpg, aes(x = class, y = cty)) + geom_boxplot()
