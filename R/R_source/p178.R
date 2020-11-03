# 혼자서해보기(P 178)
mpg_new <- as.data.frame(ggplot2::mpg)
mpg_new[c(10, 14, 58, 93), "drv"] <- "k"
mpg_new[c(29, 43, 129, 203), "cty"] <- c(3,4,39,42)
mpg_new %>% 
  select(drv)
mpg_new$drv <- ifelse(mpg_new$drv == "k", NA, mpg_new$drv)
mpg_new %>% 
  select(drv)
table(mpg_new$drv)
boxplot(mpg_new$cty)$stats
mpg_new$cty <- ifelse(mpg_new$cty > 26 | mpg_new$cty < 9 , NA, mpg_new$cty)
boxplot(mpg_new$cty)

mpg_new %>% 
  filter(!is.na(drv) & !is.na(cty)) %>% 
  group_by(drv) %>% 
  summarise(mean_cty = mean(cty))