import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N+1][N+1];
        int[] result = new int[M];
        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < N+1; j++){
                int num = sc.nextInt();
                arr[i][j] += num + arr[i][j-1];
            }
        }
        for(int i = 0; i < M; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int j = x1; j <= x2; j++) result[i] += arr[j][y2] - arr[j][y1-1];
        }

        for(int i = 0; i < M; i++){
            System.out.println(result[i]);
        }
    }
}