//22112047 장세헌

class Solution{
    int answer = 0;
    public int solution(int[][] trangle){
        for(int i = 1; i < trangle.length ; i++){
            for(int j = 0; j < trangle[i].length; j++){
                if(j == 0) trangle[i][j] += trangle[i-1][j];
                else if(j == trangle[i].length-1) trangle[i][j] += trangle[i-1][j-1];
                else trangle[i][j] += Math.max(trangle[i - 1][j - 1], trangle[i - 1][j]);
            }
        }
        for(int i = 0; i < trangle[trangle.length-1].length; i++){
            if(trangle[trangle.length-1][i] > answer) answer = trangle[trangle.length-1][i];
        }
        return answer;
    }
}

