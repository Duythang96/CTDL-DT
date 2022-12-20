public class LeetCode557 {

    public String reverseWords(String s) {

        String[] temp = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            for (int j = temp[i].length()-1; j >=0; j--) {
                stringBuilder.append(temp[i].charAt(j));
            }
            if (i<= temp.length-2){
                stringBuilder.append(" ");
            }
        }
        String a = stringBuilder.toString();
        return a;
    }
}
