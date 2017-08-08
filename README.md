# projeto-metodologia

## Instruções de uso

Antes da primeira execução é preciso dar permissão de executar o arquivo:

$ chmod +x ordenar.sh

Para executar o script:

$ ./ordenar.sh <metodo_de_ordenacao> <arquivo_de_entrada> <arquivo_de_saida>


- MÉTODO DE ORDENAÇÃO:
  - Parâmetro obrigatório
  - Possíveis valores: merge, quick, insertion
  - Qualquer outro valor lançará um erro


- ARQUIVO DE ENTRADA
  - Parâmetro não obrigatório
  - Arquivo de entrada: conjunto de dados a ser ordenado
  - Valor default: input.txt (Conjunto de 10 números inteiros que está no diretorio raiz)

- ARQUIVO DE SAÍDA
  - Parâmetro não obrigatório
  - Arquivo de saída: onde será escrito o resultado do experimento.
  - Valor default: output.txt
  - Formato de saída: <algoritmo_ordenacao>, <tempo_decorrido>, <arquivo_de_entrada>


Exemplos de execução:

$ ./ordenar.sh merge input.txt output.txt

$ ./ordenar.sh merge
(O workload usado será o input.txt e o output.txt guardará a saída)

