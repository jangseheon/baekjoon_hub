import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum[] = new int[N+1];
        int result[] = new int[M];
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            sum[i+1] += sum[i] + num;
        }

        for(int k = 0; k < M; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            result[k] = sum[j] - sum[i-1];
        }

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}