import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long count = 0;
    static int[] a;
    static int[] aux;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = new int[N];
        aux = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        sort(0, N-1);

        System.out.println(count);
    }

    public static void merge(int lo, int mid, int hi){
        for(int i = lo; i <= hi; i++){
            aux[i] = a[i];
        }
        int j = lo, k = mid + 1;
        for(int i = lo; i <= hi ; i++){
            if(j > mid) a[i] = aux[k++];
            else if(k > hi) a[i] = aux[j++];
            else if(aux[k] < aux[j]) {
                a[i] = aux[k++];
                count += mid + 1 - j;
            }
            else a[i] = aux[j++];
        }
    }


    public static void sort(int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(lo,mid);
        sort(mid + 1,hi);
        merge(lo,mid,hi);
    }
}
