datasets=( "almOrd_r1000000.txt" "inv_r1000000.txt" "random_r1000000.txt")

algo=( "quick" "merge" "insertion")

echo -e "Iniciando experimento...\n"
echo "###########################"

for i in `seq 1 10`
do
    echo -e "Execução número $i\n"
    for i in `seq 0 2` # numero de algoritmos - 1
    do
        echo -e Algoritmo: "${algo[$i]}" "\n"

        for j in `seq 0 2` # numero de datasets - 1
        do
            echo "--------------------------"
            echo Dataset: "${datasets[$j]}"
            ./ordenar.sh "${algo[$i]}" "datasets/${datasets[$j]}" output.txt
            echo
        done
        echo "###########################"

    done

done

echo -e "Fim do experimento"
