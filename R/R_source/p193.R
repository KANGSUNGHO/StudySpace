# 혼자서해보기 p193
library(ggplot2)
library(dplyr)
mpg <- as.data.frame(ggplot2::mpg)
df <- mpg %>% 
  filter(class == "suv") %>% 
  group_by(manufacturer) %>% 
  summarise(mean_cty = mean(cty)) %>% 
  arrange(desc(mean_cty)) %>% 
  head(5)

ggplot(data = df, aes(x = reorder(manufacturer,-mean_cty), y = mean_cty)) + geom_col()

df_class <- mpg %>%
  select(class)
df_class
table(df_class)
ggplot(data = df_class, aes(x = class)) + geom_bar()

