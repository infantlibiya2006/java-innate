import java.util.Scanner;
public class MatrixWithDefaults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter 5 elements for 3x3 matrix:");
        int count = 0;
for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (count < 5) {
                    matrix[i][j] = sc.nextInt();
                    count++;
                } else {
                    matrix[i][j] = 0; // default value
                }
            }
        }
        System.out.println("\nFinal 3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
