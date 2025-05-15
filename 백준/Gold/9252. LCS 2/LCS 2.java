import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] X = sc.nextLine().toCharArray();
        char[] Y = sc.nextLine().toCharArray();

        getLCS(X,Y);

    }

    private static void getLCS(char[] X, char[] Y){
        if(X.length == 0 || Y.length == 0){
            System.out.println("0");
            return;
        }
        int[][] LCS = new int[X.length + 1][Y.length + 1];

        for(int i = 1; i < X.length + 1; i++){
            for(int j = 1; j < Y.length + 1; j++){
                if(X[i-1] == Y[j-1]) LCS[i][j] = 1 + LCS[i-1][j-1];
                else LCS[i][j] = Math.max(LCS[i-1][j],LCS[i][j-1]);
            }
        }

        ArrayList<Character> String_LCS = new ArrayList<>();
        int i = X.length, j = Y.length;
        while(i > 0 && j > 0){
            if(X[i-1] == Y[j-1]){
                String_LCS.add(X[i-1]);
                i--;
                j--;
            }
            else if(LCS[i-1][j] > LCS[i][j-1]) i--;
            else j--;
        }
        System.out.println(LCS[X.length][Y.length]);

        for(int k = String_LCS.size()-1; k >= 0 ; k--){
            System.out.print(String_LCS.get(k));
        }
        System.out.println();
    }

}
