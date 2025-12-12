import java.util.Scanner;

class JaggedArrayDemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows in jaggedArray:");
        int numRows = sc.nextInt();

        int[][] jaggedArray = new int[numRows][];

        // Input for jagged array
        for (int i = 0; i < numRows; i++) {

            System.out.println("Enter number of columns in row " + i + ":");
            int numCols = sc.nextInt();

            jaggedArray[i] = new int[numCols];

            for (int j = 0; j < numCols; j++) {
                System.out.println("Enter element at position [" + i + "][" + j + "]:");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Output the jagged array
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
