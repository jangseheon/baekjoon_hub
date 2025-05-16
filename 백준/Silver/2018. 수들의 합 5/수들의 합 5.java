import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1; // 자기자신
        if(!(N % 2 == 0) && N != 1) count++; // 1을 뺀 홀수는 중간값 + (중간값+1)으로 무조건 하나가 더 나온다
        int[] sum = new int[N/2+1]; // 중간 숫자 전까지만 배열을 만든다.
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
