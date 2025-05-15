import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int max = 0;
        double sum = 0;
        for(int i = 0; i < M; i++){
            int score = sc.nextInt();
            if(score > max) max = score;
            sum += score;
        }
        System.out.println(((sum / max) * 100) / M);
    }
}