import java.util.Arrays;

/**
 * Created by Yuriy on 10.02.2016.
 */
public class Arri1 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int min = m[0];
        int max = m[0];
        int num = m.length;
        for (int arrayElement : m) {
            if (arrayElement < min) {
                min = arrayElement;
            }
        }
        for (int arrayElement : m) {
            if (arrayElement > max) {
                max = arrayElement;
            }
        }
        int sum = 0;
        for (int arrayElement : m) {
            sum += arrayElement;
        }
        Arrays.sort(m);
        int med = num/2;

        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        System.out.println("Average: "+sum / num);
        System.out.println("Mediana: "+m[med]);
    }
}
