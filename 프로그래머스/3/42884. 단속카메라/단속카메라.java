import java.util.Arrays;
import java.util.Comparator;

class Solution{
    public int solution(int[][] routes){
        int answer = 1;
        Arrays.sort(routes,new Routecomparator());
        int min = routes[0][1];
        for(int i = 1; i < routes.length; i++){
            if(routes[i][0] > min){
                answer++;
                min = routes[i][1];
            }
        }

        return answer;
    }
}


class Routecomparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a,int[] b){
        return a[1] - b[1];
    }
}

