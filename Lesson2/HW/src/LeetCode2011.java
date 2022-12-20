public class LeetCode2011 {

    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for (int i = 0; i < operations.length ; i++) {
            if (operations[i].equals("++X")){
                count+=1;
            }
            else if (operations[i].equals("X++")){
                count+=1;
            }
            else if (operations[i].equals("X--")){
                count-=1;
            }
            else if (operations[i].equals("--X")){
                count-=1;
            }
        }
        return count;
    }
}
