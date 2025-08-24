import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] find;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            num[i] = a;
        }
        Arrays.sort(num);
        int M = Integer.parseInt(br.readLine());
        find = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int a = Integer.parseInt(st.nextToken());
            find[i] = a;
        }
        int i = 0;
        while(i < M){
            int low = 0;
            int high = N - 1;
            int mid = (low + high) / 2;
            while(low <= high){
                mid = (low + high) / 2;
                if(find[i] < num[mid])
                    high = mid - 1;
                else if(find[i] > num[mid])
                    low = mid + 1;
                else
                    break;
            }
            if(find[i] == num[mid])
                find[i] = 1;
            else
                find[i] = 0;
            i++;
        }

        for(int a : find){
            System.out.println(a);
        }

    }

}
