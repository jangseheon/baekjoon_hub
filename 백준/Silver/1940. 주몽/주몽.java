import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);

        int i = 0, j = N-1;
        while(i < j){
            if(arr[i] + arr[j] == M){
                count++;
                i++;
                j--;
            }
            else if(arr[i] + arr[j] < M){
                i++;
            }
            else j--;
        }
        System.out.println(count);
    }
}
