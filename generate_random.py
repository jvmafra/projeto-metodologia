def main():

    import random

    print('Iniciando processo...')

    outfile = open('random_r100.txt', 'a+')
    
    # numero de interacoes
    n = 1000000

    # range dos numeros
    maximo = 100

    for count in range(n):    
	    num = random.randint(0, maximo)
	    outfile.write(str(num) + ' ')

    outfile.close()
    print('Dados escritos em random_r100.txt')

#Call main
main()



