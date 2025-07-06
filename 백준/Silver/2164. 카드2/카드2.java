import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            q.add(i);
        }

        while(q.size() != 1){
            int num = q.poll();
            int change = q.poll();
            q.add(change);
        }

        System.out.println(q.poll());
    }
}
