import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        sc.nextLine();
        char[] DNA = sc.nextLine().toCharArray();
        int A_many = sc.nextInt();
        int C_many = sc.nextInt();
        int G_many = sc.nextInt();
        int T_many = sc.nextInt();
        int count = 0;
        int[] many = new int[4];
        for(int i = 0; i < P; i++){
            switch (DNA[i]) {
                case 'A': many[0]++; break;
                case 'C': many[1]++; break;
                case 'G': many[2]++; break;
                case 'T': many[3]++; break;
            }
        }
        if (many[0] >= A_many && many[1] >= C_many && many[2] >= G_many && many[3] >= T_many) count++;
        int j = P, i = 0;
        while(j < S){
            switch (DNA[i]) {
                case 'A': many[0]--; break;
                case 'C': many[1]--; break;
                case 'G': many[2]--; break;
                case 'T': many[3]--; break;
            }
            i++;
            switch (DNA[j]) {
                case 'A': many[0]++; break;
                case 'C': many[1]++; break;
                case 'G': many[2]++; break;
                case 'T': many[3]++; break;
            }
            j++;
            if (many[0] >= A_many && many[1] >= C_many && many[2] >= G_many && many[3] >= T_many) count++;
        }

        System.out.println(count);
    }

}
