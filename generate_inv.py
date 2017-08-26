def main():

    import random

    print('Iniciando processo...')

    outfile = open('inv_r1000000.txt', 'a+')

    # numero de interacoes
    n = 1000000

    # range dos numeros
    maximo = 1000000

    list_numbers = []

    for count in range(n):
        list_numbers.append(random.randint(0, maximo))

    list_numbers.sort(reverse = True)

    for i in range(n):
	    num = list_numbers[i]
	    outfile.write(str(num) + ' ')

    outfile.close()
    print('Dados escritos em inv_r1000000.txt')

#Call main
main()
