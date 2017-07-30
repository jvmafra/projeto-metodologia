import java.io.*;
import java.util.Arrays;

public class Main {

    private static File inFile = null;
    private static String sortMethod;
    private static File outFile = null;

    public static void main(String[] args) {

        int[] arrayToSort = null;
        Sorting mSorting = null;

        if (args.length == 3) {
            sortMethod = args[0];
            inFile = new File(args[1]);
            outFile = new File(args[2]);
        } else {
            System.err.println("Invalid arguments count:" + args.length);
            System.exit(0);
        }

        BufferedReader br = null;

        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader(inFile));

            while ((sCurrentLine = br.readLine()) != null) {
                String[] lista = sCurrentLine.split(" ");

                arrayToSort = new int[lista.length];

                int i = 0;
                for (String s: lista){
                    arrayToSort[i] = Integer.parseInt(s.trim());
                    i++;
                }
            }

        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


        if (sortMethod.equals("quick")){
            mSorting = new Quicksort();
            System.out.println("Metodo escolhido: QuickSort");
        } else if (sortMethod.equals("merge")){
            mSorting = new MergeSort();
            System.out.println("Metodo escolhido: MergeSort");
        } else if (sortMethod.equals("insertion")){
            mSorting = new InsertionSort();
            System.out.println("Metodo escolhido: InsertionSort");
        } else {
            throw new IllegalArgumentException("Metodo de ordenacao invalido");
        }

        System.out.println("Iniciando ordenacao...");
        long inicio = System.currentTimeMillis();
        mSorting.sort(arrayToSort);
        long fim = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("Finalizando ordenacao...");
        long duracao = fim - inicio;
        System.out.println("Tempo decorrido: " + duracao + "ms");


        try(FileWriter fw = new FileWriter(outFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.write(sortMethod + "," + duracao + "," + inFile.toString());
            out.println();

        } catch (IOException e) {
            throw new IllegalArgumentException("Erro na escrita do arquivo");
        }

    }
}
