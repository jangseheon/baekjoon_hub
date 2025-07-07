import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> st = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] tokens = br.readLine().split(" ");
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(tokens[i]);
        }
        int[] oken = new int[N];
        for(int i = N - 1; i >= 0; i--){
            if(st.isEmpty()){
                oken[i] = -1;
                st.push(num[i]);
            }
            else{
                while(!st.isEmpty() && num[i] >= st.peek()) st.pop();
                if(st.isEmpty()){
                    oken[i] = -1;
                    st.push(num[i]);
                }
                else{
                   oken[i] = st.peek();
                   st.push(num[i]);
                }
            }
        }

        for(int i = 0; i < N; i++){
            sb.append(oken[i]).append(" ");
        }

        System.out.print(sb);
    }
}
