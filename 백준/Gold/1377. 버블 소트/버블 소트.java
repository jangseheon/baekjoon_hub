import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static class arr{
        int value;
        int index;
        arr(int value, int index){
            this.value = value;
            this.index = index;
        }
    }

    static class arr_Comparator implements Comparator<arr> {
        @Override
        public int compare(arr a, arr b){
            return a.value - b.value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<arr> num = new ArrayList<>();
        for(int i = 0; i < N; i++){
            num.add(new arr(Integer.parseInt(br.readLine()),i));
        }
        ArrayList<arr> sort_num = new ArrayList<>(num);
        sort_num.sort(new arr_Comparator());
        
        int max = 0;
        for(int i = 0; i < N; i++){
            if(max < sort_num.get(i).index - i)
                max = sort_num.get(i).index - i;
        }

        System.out.println(max + 1);
    }
}
