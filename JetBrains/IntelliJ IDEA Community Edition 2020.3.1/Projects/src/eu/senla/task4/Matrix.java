package eu.senla.task4;

import com.sun.xml.internal.fastinfoset.util.StringArray;
public class Matrix {

    // public void Matrix() {
    public static String[][] Matrix() {

        String matrix[][] = new String[10][10];
        String s = "ABCDEFGHOPR";
        String a = null;
        String b = null;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 3 == 0) {
                    matrix[i][j] = String.valueOf(Math.random() * 10 + 1).substring(0, 6);
                } else {
                    matrix[i][j] = "";
                    for (int t = 0; t < 6; t++) {
                        int c = (int) (Math.random() * s.length());
                        matrix[i][j] += String.valueOf(s.charAt(c));
                        //   matrix[i][j] = matrix[i][j] + a;
                        //           System.out.print(matrix[i][j]);
                    }
                }

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        return matrix;
    }

    // String[][] matrix = Matrix();
// diagonali

   /* public String[] mainDiagonal() {
        String[][] matrix = Matrix();

        int i = matrix.length + 1;
        int j;
        String arrayMainDiagonal[] = new String[i];
        //     for (i = 0, j = 0; i < matrix.length; i++, j++) {
        //         arrayMainDiagonal[i] = matrix[i][j];
        //     }
        //     System.out.print(arrayMainDiagonal[i] + " ");

     /*   for (int i1 = 0; i1 < 1; i1++) {
            if (i == j) {
                arrayMainDiagonal[i1] = matrix[i][j];
            }
            System.out.print("diagonal main:" + arrayMainDiagonal[i1] + " ");
            // }*/

      //      return arrayMainDiagonal;

        // }

              /*      else {
                        if (i == i-1)
                       for (i = 0, j = 0; i != 0; i--) {
                           array[i1] = matrix[i][j];
                           System.out.print("diagonal minor:" + array[i1] + " ");*/
        //    System.out.print(array[i1] + " ");



}




      //  public void Array() {





