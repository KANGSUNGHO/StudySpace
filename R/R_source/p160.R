#분석도전(p 160)
library(ggplot2)
ex_midwest <- as.data.frame(ggplot2::midwest)
ex_midwest <- ex_midwest %>% mutate(young_tot = ((poptotal-popadults)/poptotal)*100)
ex_midwest <- ex_midwest %>% mutate(young_tot = ((poptotal-popadults)/poptotal)*100) %>% 
  select(young_tot, county) %>%
  arrange(desc(young_tot)) %>% 
  head(5)

ex_midwest <- ex_midwest %>% mutate(grade = ifelse(young_tot >= 40, "large",
                                                   ifelse(young_tot >= 30, "middle", "small")))
table(ex_midwest$grade)
ex_midwest <- ex_midwest %>% 
  mutate(asian = (popasian / poptotal) * 100)
ex_midwest %>% select(state, county, asian) %>% 
  arrange(asian) %>% 
  head(10)
