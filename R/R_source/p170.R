# 혼자서해보기 (P 363)
mpg_new <- as.data.frame(ggplot2::mpg)
mpg_new[c(65, 124, 131, 153, 212), "hwy"] <- NA
mpg_new[c(65,124,131,153,212),]
table(is.na(mpg_new$drv))
table(is.na(mpg_new$hwy))
mpg_new %>% 
  filter(!is.na(hwy)) %>% 
  group_by(drv) %>% 
  summarise(mean_hwy = mean(hwy)) %>% 
  arrange(desc(mean_hwy)) %>% 
  head()