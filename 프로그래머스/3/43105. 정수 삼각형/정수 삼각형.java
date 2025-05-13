//22112047 장세헌

class Solution{
    public int solution(int[][] triangle){
        for(int i = 1; i < triangle.length ; i++){
            triangle[i][0] += triangle[i-1][0];
            triangle[i][i] += triangle[i-1][i-1];
            for(int j = 1; j < triangle[i].length-1; j++)
                triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
        }
        int answer = triangle[triangle.length-1][0];
        for(int i = 1; i < triangle[triangle.length-1].length; i++){
            if(triangle[triangle.length-1][i] > answer) answer = triangle[triangle.length-1][i];
        }

        return answer;
    }
}
