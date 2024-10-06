import java.util.Random;
import java.util.Arrays;
/**
 * @author Zagumennov Ivan 3311
 *
 */
public class Main {

    /**
     * Main method the application. Generates an array of 10 random integers,
     * sorts them.
     * @param args arguments from a command line
     *
     */
    public static void main(String[] args){
        int[] Mas = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            Mas[i] = rand.nextInt(100);
        }

        System.out.println("Original Array: " + Arrays.toString(Mas));

        sort_array(Mas, true); // Сортировка по возрастанию
        System.out.println("Array sorted in ascending order: " + Arrays.toString(Mas));

        sort_array(Mas, false); // Сортировка по убыванию
        System.out.println("The array is sorted in descending order: " + Arrays.toString(Mas));
    }

    public static void sort_array(int[] mas, boolean flag){
        int n = mas.length;
        boolean swaper;
        for (int i = 0; i < n - 1; i++){
            swaper = false;
            for (int j = 0; j < n - 1 - i; j++){
                if ((mas[j] > mas[j+1] && flag) || (mas[j] < mas[j+1] && !flag)) {
                    int t;
                    t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                    swaper = true;
                }
            }
            if (!swaper){
                break;
            }
        }
    }
}