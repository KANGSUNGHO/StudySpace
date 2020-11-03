#패키지 준비하기

install.packages("ggiraphExtra")
library(ggiraphExtra)

str(USArrests)

head(USArrests)

library(tibble)
crime <- rownames_to_column(USArrests, var = "state")
crime$state <- tolower(crime$state)

str(crime)
library(ggplot2)
states_map <- map_data("state")
install.packages("maps")
str(states_map)
ggChoropleth(data = crime,
             aes(fill = Murder,
                 map_id = state),
             map = states_map)
install.packages("mapproj")

ggChoropleth(data = crime,
             aes(fill = Murder,
                 map_id = state),
             map = states_map,
             interactive = T)
