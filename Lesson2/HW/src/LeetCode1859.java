public class LeetCode1859 {
    public String sortSentence(String s) {
        String[] sp = s.split(" ");
        String temp;
        for (int i = 0; i < sp.length; i++) {
            for (int j = i+1; j < sp.length; j++) {
                if (sp[i].charAt(sp[i].length()-1)>sp[j].charAt(sp[j].length()-1)){
                    temp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = temp;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sp.length ; i++) {
            for (int j = 0; j < sp[i].length()-1; j++) {
                stringBuilder.append(sp[i].charAt(j));
            }
            if (i<=sp.length-2){
                stringBuilder.append(" ");
            }
        }
        String a = stringBuilder.toString();
        return a;
    }
}
