class Solution {
        public String solution(String number, int k) {
            StringBuilder sb = new StringBuilder();
            char[] a = number.toCharArray();
            for(int i = 0; i < number.length(); i++){
                while(k > 0 && sb.length() > 0 && sb.charAt(sb.length()-1) < a[i]){
                    sb.deleteCharAt(sb.length() - 1);
                    k--;
                }
                sb.append(a[i]);
            }
            while(sb.length() > number.length() - k){
                sb.deleteCharAt(sb.length()-1);
            }
            return sb.toString();
        }
    }