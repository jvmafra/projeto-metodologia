def main():

    import random

    print('Iniciando processo...')

    outfile = open('input_random.txt', 'a+')
    
    # numero de interacoes
    n = 1000000

    # range dos numeros
    maximo = 1000000

    for count in range(n):    
	    num = random.randint(1, maximo)
	    outfile.write(str(num) + ' ')

    outfile.close()
    print('Dados escritos em input_random.txt')

#Call main
main()
