#혼자서해보기 p144
mpg_hc <- mpg_hc %>% mutate(sum_hc = hwy + cty)
head(mpg_hc)
mpg_hc <- mpg_hc %>% mutate(avg_hc = (hwy + cty)/2)
head(mpg_hc)
mpg_hc %>% arrange(desc(avg_hc)) %>% 
  head(3)
mpg_hc %>% 
  mutate(sum_hc = hwy + cty,
         avg_hc = (hwy + cty)/2) %>%
  arrange(desc(avg_hc)) %>% 
  head(3)