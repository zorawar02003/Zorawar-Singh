public class transpose {
    public static void te(int arr[][]) {
        // Get the number of rows and columns of the original matrix
        int row = arr.length;
        int col = arr[0].length;

        // Create a new matrix to store the transposed elements
        int transposedArr[][] = new int[col][row];
        
        // Iterate through each element of the original matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Swap the row and column indices to transpose the element
                transposedArr[j][i] = arr[i][j];
            }
        }

        // Print the transposed matrix
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposedArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int arr[][] = {{11, 12, 13}, {21, 22, 23}};
        
        // Call the transpose function and print the result
        te(arr);
    }
}
