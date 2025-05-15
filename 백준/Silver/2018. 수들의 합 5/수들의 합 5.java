import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1; // 자기자신
        if(!(N % 2 == 0) && N != 1) count++;
        int[] sum = new int[N/2+1];
        for(int i = 1; i < N/2+1; i++)
            sum[i] = i + sum[i-1];

        int i = 0, j = 0;
        while(i < N/2+1){
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