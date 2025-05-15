import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        char[] num = sc.nextLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += num[i] - '0';
        }
        System.out.println(sum);
    }
}