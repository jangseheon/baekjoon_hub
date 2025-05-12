class Solution{
        int[] answer = new int[2];

        public int[] solution(int[][] arr){
            compress(arr,0,0,arr.length);
            return answer;
        }

        private void compress(int[][] arr,int x_start,int y_start,int size){
            if(size == 1) {
                answer[arr[x_start][y_start]]++;
                return;
            }
            if(isCompress(arr,x_start,y_start,size)) {
                answer[arr[x_start][y_start]]++;
            }
            else{
                compress(arr, x_start, y_start, size/2);
                compress(arr, x_start + size/2, y_start, size/2);
                compress(arr, x_start, y_start + size/2, size/2);
                compress(arr, x_start + size/2, y_start + size/2, size/2);
            }
        }

        private boolean isCompress(int[][] arr,int x_start,int y_start,int size){
            for(int i = x_start; i < x_start + size; i++){
                for(int j = y_start ; j < y_start + size; j++){
                    if(!(arr[i][j] == arr[x_start][y_start])) return false;
                }
            }
            return true;
        }
    }