import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        sort(num);

        System.out.println(count);
    }

    public static void merge(int[] a, int[] aux, int lo, int mid, int hi){
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

    public static void sort(int[] a){
        int[] aux = new int[a.length];
        sort(a,aux,0,a.length-1);
    }

    public static void sort(int[] a,int[] aux, int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid + 1,hi);
        merge(a,aux,lo,mid,hi);
    }
}
