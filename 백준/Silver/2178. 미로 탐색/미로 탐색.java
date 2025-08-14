import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static boolean visited[][];
    static int num[][];
    static int route[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        num = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];
        route = new int[N+1][M+1];
        for(int i = 1; i <= N; i++){
            String c = br.readLine();
            for(int j = 1; j <= M; j++){
                num[i][j] = c.charAt(j - 1) - '0';
                visited[i][j] = false;
            }
        }
        BFS(1,1);

        System.out.println(route[N][M]);
    }

    public static void BFS(int start_x, int start_y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_x, start_y});
        visited[1][1] = true;
        route[1][1] = 1;
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            for(int i = 0; i < 4; i++){
                int new_x = now[0] + dx[i];
                int new_y = now[1] + dy[i];
                if(new_x == num.length - 1 && new_y == num[1].length - 1){
                    route[new_x][new_y] = route[now[0]][now[1]] + 1;
                    return;
                }
                if( new_x >= 1 && new_y >= 1 && new_x <= num.length - 1 && new_y <= num[new_x].length - 1
                        && num[new_x][new_y] == 1 && !visited[new_x][new_y]){
                    visited[new_x][new_y] = true;
                    route[new_x][new_y] = route[now[0]][now[1]] + 1;
                    queue.add(new int[]{new_x, new_y});
                }
            }
        }
    }
}
