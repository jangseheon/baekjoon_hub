import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int[] sum = new int[N+1];
        for(int i = 1; i < N+1; i++)
            sum[i] = i + sum[i-1];

        int i = 0, j = 0;
        while(i < N){
            if(sum[i] - sum[j] < N) i++;
            else if(sum[i] - sum[j] == N){
                count++;
                i++;
                j++;
            }
            else j++;
        }

        System.out.println(count);
    }
}