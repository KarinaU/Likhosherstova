import java.util.Arrays;

/**
 * Created by IT_School on 04.10.2015.
 */
public class Lesson_6_SCH {
    /*public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i,j,k = 0;

        for (i=0; i<4; i++)
            for(j=0; j<i+1; j++){
                twoD[i][j] = k;
                k++;
            }

        for(i=0; i<4; i++){
            for(j=0; j<i+1; j++)
                System.out.println(twoD[i][j] + " ");
            System.out.println();
        }
    }*/

    /*public static void main(String[] args) {
        int[]arr = {10,20,30,40};
        int pos = Arrays.binarySearch(arr, 20);
        System.out.println(pos);
    }*/

    /*public static void main(String[] args) {
        int[] arr0 = {1,2,3,4,5,6};
        int[] arr1 = {0,0,0,0,0,0,0,0,};

        System.out.println("arr0: " + Arrays.toString(arr0));
        System.out.println("arr1: " + Arrays.toString(arr1));

        System.arraycopy(arr0, 1, arr1, 2, 3);
        System.out.println("arr0: " + Arrays.toString(arr1));
    }*/


    Class Box {
        double weidth;
        double height;
        double depth;
    }
    //Этот класс объявляет объект типа Box
    class BoxDemo (
            public static void main (String args[]) {
                Box mybox = new Box();
                double vol;
                mybox.weight = 10;
                mybox.height = 20;
                mybox.depth = 30;



            }

            )

}
