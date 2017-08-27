def main():

    import random

    print('Iniciando processo...')

    outfile = open('almOrd_r1000000.txt', 'a+')

    # numero de interacoes
    n = 1000000

    # range dos numeros
    maximo = 1000000

    list_numbers = []

    for count in range(n):
        list_numbers.append(random.randint(0, maximo))

    list_numbers.sort()

    for i in range(int(n * 0.025)):
        a = random.randint(1, n)
        b = a - 1
        list_numbers[b], list_numbers[a] = list_numbers[a], list_numbers[b]

    for i in range(n):
        num = list_numbers[i]
        outfile.write(str(num) + ' ')

    outfile.close()
    print('Dados escritos em almOrd_r1000000.txt')

#Call main
main()
