import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] num = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            num[i] = str.charAt(i);
        }
        Arrays.sort(num);
        for(int i = str.length(); i > 0; i--){
            System.out.print(num[i-1]);
        }

    }
}
