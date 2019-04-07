#혼자서해보기(p156)
mpg_fl <- data.frame(fl = c("c", "d", "e", "p", "r"),
                     type = c(2.35, 2.38, 2.11, 2.76, 2.22),
                     stringsAsFactors = F)
View(mpg_fl)
mpg_all <- left_join(mpg, mpg_fl, by = "fl")
View(mpg_all)
mpg_all

mpg_all %>% select(model,fl, type) %>% 
  head(5)