package zad2.logic;

public class ArrayOperations {

    private final int[][] concatArr;
    private int rowNumberWithHighestNeighbours;
    private int colNumberWithHighestNeighbours;
    private int rowNumberWithHighestNumber;
    private int colNumberWithHighestNumber;

    public ArrayOperations(int[][] arr1, int[][] arr2) {
        concatArr = concatArrays(arr1, arr2);
        findElementWithHighestNeighbours();
        findHighestNumber();
    }

    public int[][] getConcatArr() {
        return concatArr;
    }

    public int getRowNumberWithHighestNeighbours() {
        return rowNumberWithHighestNeighbours;
    }

    public int getColNumberWithHighestNeighbours() {
        return colNumberWithHighestNeighbours;
    }

    public int getRowNumberWithHighestNumber() {
        return rowNumberWithHighestNumber;
    }

    public int getColNumberWithHighestNumber() {
        return colNumberWithHighestNumber;
    }

    private int[][] concatArrays(int[][] arr1, int[][] arr2) {
        int rows = arr1.length + arr2.length;
        int cols = Math.max(arr1[0].length, arr2[0].length);
        int[][] result = new int[rows][cols];

        for (int i = 0; i < arr1.length; i++) {
            System.arraycopy(arr1[i], 0, result[i], 0, arr1[i].length);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.arraycopy(arr2[i], 0, result[i + arr1.length], 0, arr2[i].length);
        }

        return result;
    }

    // a. w tej metodzie nie chcaiło mi się robić tego sita, tu mamy tylko do 9 więc wiem że pierwsze to 2,3,5,7
    public int getPrimeNumbersQuantity() {
        int sum = 0;
        for (int[] row : concatArr) {
            for (int el : row) {
                if (el == 2 || el == 3 || el == 5 || el == 7) {
                    sum++;
                }
            }
        }
        return sum;
    }

    // b. do tego podpunktu są te dwa gettery do zwracania highestNeighbour
    private void findElementWithHighestNeighbours() {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < concatArr.length - 1; i++) {
            for (int j = 1; j < concatArr[i].length - 1; j++) {
                int neighboursSum = -concatArr[i][j];

                for (int k = i - 1; k <= i + 1; k++) {
                    for (int m = j - 1; m <= j + 1; m++) {
                        neighboursSum += concatArr[k][m];
                    }
                }

                if (neighboursSum > maxSum) {
                    rowNumberWithHighestNeighbours = i;
                    colNumberWithHighestNeighbours = j;
                    maxSum = neighboursSum;
                }
            }
        }
    }

    // c. do tego podpunktu są te dwa gettery do zwracania highestNumber
    private void findHighestNumber() {
        int maxEl = Integer.MIN_VALUE;
        int maxElLineNumber = Integer.MAX_VALUE;

        for (int i = 0; i < concatArr.length; i++) {
            for (int j = 0; j < concatArr[i].length; j++) {
                int lineNumber = i + j;
                if (concatArr[i][j] > maxEl || (concatArr[i][j] == maxEl && lineNumber < maxElLineNumber)) {
                    maxEl = concatArr[i][j];
                    maxElLineNumber = lineNumber;
                    rowNumberWithHighestNumber = i;
                    colNumberWithHighestNumber = j;
                }
            }
        }
    }

    // d.
    public int getSum() {
        int maxNumber = concatArr[rowNumberWithHighestNumber][colNumberWithHighestNumber];
        int sum = 0;

        for (int[] row : concatArr) {
            for (int el : row) {
                sum += (maxNumber - el);
            }
        }
        return sum;
    }
}
