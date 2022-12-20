public class LeetCode2114 {

    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=0;
        for (int i = 0; i < sentences.length; i++) {
            count=0;  //reset count
            // đếm xem có bao nhiêu ' '
            for (int j = 0; j <sentences[i].length(); j++) {
                if (sentences[i].charAt(j)==' '){
                    count+=1;
                }
            }
            // max = count lớn nhất
            if (max<count){
                max=count;
            }
        }
        //count+1
        return max+1;
    }
}
