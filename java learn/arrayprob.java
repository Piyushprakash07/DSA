import java.util.Scanner;

class arrayprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[12];
        for (int i = 0; i < 12; i++)
            a[i] = sc.nextInt();
        int b[][] = new int[3][4];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = a[k];
                k++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
