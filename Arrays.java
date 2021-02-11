public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[4];
        int[] array2 = { 1, 2, 3, 4 };

        array[0] = 1; // Insert value 1 in array position 0

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int v : array2) {
            System.out.println(v);
        }

        array = new int[5]; // recreates the array with five spaces

        //
        // Array Multidimensional
        //

        int[][] array4 = new int[2][2]; // array multidimensional

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; i < array4[i].length; j++) {
                System.out.println(array4[i][j]);
            }
        }

        for (int[] i : array4) {
            for (int v : i) {
                System.out.println(v);
            }
        }
    }
}

/*
Dictionary
char \u0000 -> ' ' boolean -> false reference -> null
*/