import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String[] X = input1.split("");
        String[] Y = input2.split("");

        getLCS(X,Y);

    }

    private static void getLCS(String[] X, String[] Y){
        ArrayList<String> String_LCS = new ArrayList<>();
        if(X.length == 0 || Y.length == 0){
            System.out.println("0");
            return;
        }
        int[][] LCS = new int[X.length + 1][Y.length + 1];

        for(int i = 1; i < X.length + 1; i++){
            for(int j = 1; j < Y.length + 1; j++){
                if(X[i-1].equals(Y[j-1])){
                    LCS[i][j] = 1 + LCS[i-1][j-1];
                }
                else{
                    LCS[i][j] = Math.max(LCS[i-1][j],LCS[i][j-1]);
                }
            }
        }


        System.out.println(LCS[X.length][Y.length]);
    }
}
