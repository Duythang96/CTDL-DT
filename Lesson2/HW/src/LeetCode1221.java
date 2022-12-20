public class LeetCode1221 {
    public int balancedStringSplit(String s) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L'){
                temp++;
            }
            else {
                temp--;
            }
            if (temp==0){
                count++;
            }
        }
        return count;
    }
}
