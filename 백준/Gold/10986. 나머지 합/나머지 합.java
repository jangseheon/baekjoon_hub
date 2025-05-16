import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long count = 0;
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long sum = 0;
        long[] mod = new long[M];
        mod[0] = 1;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum = (sum + num) % M;
            count += mod[(int)sum]++;
        }

        System.out.println(count);
    }
}