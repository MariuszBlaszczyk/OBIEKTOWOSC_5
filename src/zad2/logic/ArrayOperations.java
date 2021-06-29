package zad2.logic;

public class ArrayOperations {

    public static int[][] concatArray(int[][] array1, int[][] array2) {
        if (array1 == null || array1.length == 0) {
            throw new IllegalArgumentException("Array1 is null or empty");
        }
        if (array2 == null || array2.length == 0) {
            throw new IllegalArgumentException("Array2 is null or empty");
        }
        int[][] array3 = new int[array1.length + array2.length][];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        return array3;
    }

    public static void showArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }


//    boolean[] liczby = new boolean[n+1]; // tworzymy tablice skladajacej się z n elementów
//		for(int i = 2; i <= n; i++) {
//        liczby[i] = true; // kazdemu z nich nastepnie przypisujemy wartosc true
//    }
//		for (int i = 2; i < Math.sqrt(n); i++) {
//        if(liczby[i] == true) // nastepnie, zaczynajac od dwojki,
//        eliminujemy wielokrotnosci liczb pierwszych przypisujac im wartosc false
//            for(int k = i*i; k <= n; k+=i)
//                liczby[k] = false;
//    }
//		System.out.println("Liczby pierwsze z przedzialu <2," + n + "> : ");
//		for(int i = 0; i <= n; i++)
//    {
//        if(liczby[i] == true)
//            System.out.print(i + " | "); // wypisujemy znalezione liczby
//    }


}
