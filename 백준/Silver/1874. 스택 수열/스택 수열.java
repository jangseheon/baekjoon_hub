import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            int number = sc.nextInt();
            num[i] = number;
        }
        int last = 0,count = 0,index = 0,push = 1;
        while(count != N){
            if(last < num[index]){
                st.push(push);
                last = push++;
                sb.append("+").append("\n");

            }
            else{
                int pop = st.pop();
                if(pop != num[index]){
                    System.out.println("NO");
                    break;
                }
                sb.append("-").append("\n");
                last = pop;
                index++;
                count++;
            }
        }
        if(count == N) System.out.println(sb);
    }
}
