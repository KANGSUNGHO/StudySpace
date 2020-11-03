#혼자서해보기 p138
cc_mpg <- mpg %>% select(class, cty)
head(cc_mpg,3)

suv_mpg <- cc_mpg %>% filter(class == "suv")
head(suv_mpg)
mean(suv_mpg$cty)
com_mpg <- mpg %>% filter(class == "compact") %>% 
  select(cty)
head(com_mpg)
mean(com_mpg$cty)