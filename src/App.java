import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // tcs advanced coding question 15/01/2024
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double sqrt = Math.sqrt(str.length());
        int r = (int) Math.floor(sqrt);
        int c = (int) Math.ceil(sqrt);
        
        char[][] matrix = new char[r][c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (k < str.length()) {
                    matrix[i][j] = str.charAt(k++);
                }
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
}