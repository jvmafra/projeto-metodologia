experimento <- read_csv("output.txt", col_names = FALSE) %>%
  rename("algoritmo" = X1, "tempo" = X2, "dataset" = X3) %>%
  mutate(dataset = str_sub(dataset, 10)) %>%
  mutate(range = as.numeric(str_extract(dataset, "[0-9]+"))) %>%
  mutate(dataset = str_extract(dataset, "[aA-zZ]+")) %>%
  mutate(dataset = gsub("_r","", dataset)) %>%
  select(algoritmo, dataset, range, tempo)


experimento <- experimento %>% select(1,2,4)

experimento <- experimento %>%
  mutate(algoritmo = as.factor(algoritmo)) %>%
  mutate(dataset = as.factor(dataset))


fit <- aov(tempo ~ algoritmo * dataset, data=experimento)

anova(fit)

coef(fit)
residuos <- residuals(fit)

hist(residuos,main="Histograma dos resíduos")
qqnorm(residuos, main="Q-Q Plot dos resíduos")
boxplot(residuos, main="Boxplot dos resíduos")
lag.plot(residuos, main="Lag plot dos resíduos")