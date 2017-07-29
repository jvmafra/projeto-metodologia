
public class InsertionSort implements Sorting {

    public void sort(int values[]){

        for (int i = 1; i < values.length; i++){
            int j = i;
            int current = values[i];
            while ((j > 0) && (values[j-1] > current)){
                values[j] = values[j-1];
                j--;
            }
            values[j] = current;
        }
    }
}
