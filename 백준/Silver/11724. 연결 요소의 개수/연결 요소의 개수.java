import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new ArrayList[size];
        visited = new boolean[size];
        int count = 0;

        for(int i = 0; i < size; i++){
            arr[i] = new ArrayList<>();
            visited[i] = false;
        }

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            arr[u].add(v);
            arr[v].add(u);
        }

        for(int i = 0; i < size; i++){
            if(!visited[i]) {
                DFS(i);
                count++;
            }
        }

        System.out.println(count);
    }

    static void DFS(int v) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            for (int a : arr[vertex]) {
                if (!visited[a]) {
                    stack.push(a);
                    visited[a] = true;
                }
            }
        }
    }
}
