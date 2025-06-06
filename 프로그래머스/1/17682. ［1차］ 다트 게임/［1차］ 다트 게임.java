import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        String regex = "(10|[0-9])(S|D|T)(\\*|#)?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(dartResult);
        int[] sum = new int[3];
        int count = 0;
        while(m.find()){
            int score = Integer.parseInt(m.group(1));
            if(m.group(2).equals("D")) score = (int)Math.pow(score,2);
            else if(m.group(2).equals("T")) score = (int)Math.pow(score,3);
            
            if("*".equals(m.group(3))){
                score *= 2;
                if(count > 0) sum[count - 1] *= 2;
            }
            else if("#".equals(m.group(3))){
                score *= -1;
            }
            sum[count++] = score;
        }
        
        return sum[0] + sum[1] + sum[2];
    }
}