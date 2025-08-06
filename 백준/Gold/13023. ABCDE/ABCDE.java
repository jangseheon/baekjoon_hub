import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++){
            arr[i] = new ArrayList<>();
            visited[i] = false;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }

        for(int i = 0; i < N; i++){
            if(DFS(i,1)){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }

    public static boolean DFS(int v,int depth){
        if(depth == 5){
            return true;
        }
        visited[v] = true;
        for(int a : arr[v]){
            if(!visited[a]){
                if(DFS(a,depth + 1))
                    return true;
            }
        }
        visited[v] = false;
        return false;
    }
}
