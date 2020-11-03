#혼자서해보기(p 112)
ex_mpg <- as.data.frame(ggplot2::mpg)
new_mpg <-ex_mpg
head(new_mpg)
new_mpg <- rename(new_mpg, city = cty, highway = hwy)
head(new_mpg)