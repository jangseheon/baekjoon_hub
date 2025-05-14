import java.util.Arrays;

class Solution {
    public static int solution(int[][] triangle) {
        int answer = comparison(triangle);
        return answer;
    }

    public static int comparison(int[][]arr){
        for(int i = 1; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(j == 0){arr[i][j] = arr[i][j] + arr[i-1][j];}
                else if (j == arr[i].length - 1) {
                    arr[i][j] = arr[i][j] + arr[i-1][j-1];
                }
                else {
                    arr[i][j] = (arr[i-1][j-1] > arr[i-1][j]) ? arr[i][j]+arr[i-1][j-1] : arr[i][j]+arr[i-1][j];
                }
            }
        }
        int max = Arrays.stream(arr[arr.length - 1]).max().getAsInt();
        return max;
    }
}