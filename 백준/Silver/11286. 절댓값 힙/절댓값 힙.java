import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static class QueueComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b){
            if(Math.abs(a) == Math.abs(b)) return a - b;
            else return (int)Math.abs(a) - (int)Math.abs(b);
        }
    }


    public static void main(String[] args){
        PriorityQueue<Integer> q = new PriorityQueue<>(new QueueComparator());
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            if(num == 0){
                if(q.isEmpty()){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(q.poll()).append("\n");
                }
            }
            else{
                q.add(num);
            }
        }

        System.out.println(sb);
    }
}
