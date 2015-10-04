/**
 * Created by IT_School on 20.09.2015.
 */

import java.util.Arrays;

public class Lesson_5_SCH {
    /*public static void main(String args[]){
        String strInt = "123"; String strDouble = "123.456";
        int x; double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        strInt = String.valueOf(x+1);
        strDouble = String.valueOf(y+1);
        System.out.println("strInt=" + strInt);
        System.out.println("strDouble=" + strDouble);
        String str;
        str = "num=" +345;
        System.out.println(str);
    }*/

    /*public static void main(String args[]){
        System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));
    }*/


    /*public static void main(String[] args) {
        for (String x : args) {
            System.out.println(x);
        }
    }*/


    /*public static void main(String[] args) {
        int[] array1D = {0,1,2,3};
        int[][] array2D = {{0,1}, {2,3}};

        //demo: array1D -> String;
        System.out.println(array1D);
        System.out.println(Arrays.toString(array1D));

        //demo: array2D -> String;
        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));
    }*/

   /* public static void main(String[] args) {
        int[] masiv = {1,2,3,4,5,20};
        int counter = 0;
        for (int x: masiv) {
            counter++;
        }
    System.out.println(counter);
    }*/


    /*public static void sort(int[] data) {
    //bubble sorter
        for(int barrier = data.length - 1; barrier>=0; barrier--){
            for(int index = 0; index < barrier ; index++){
                if (data[index] > data[index + 1]){
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }*/

    public static void sort(int[] arr) {
        // selection sorter
        for (int barrier = 0; barrier < arr.length - 1; barrier++)
        {
            for(int index = barrier + 1; index < arr.length; index++){
                if (arr[barrier] > arr[index]){
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

}



