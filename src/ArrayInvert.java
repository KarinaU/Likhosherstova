/**
 * Created by IT_School on 03.10.2015.
 */
public class ArrayInvert {
    public static void invert (int[] arr) {
        // метод инвертирующий элементы массива
        for(int k = 0; k < arr.length / 2; k++){
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
    }
}
