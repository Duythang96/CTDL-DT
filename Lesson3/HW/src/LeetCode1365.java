public class LeetCode1365 {

    public static void main(String[] args) {
        int[] num = {8,1,2,2,3};
        smallerNumbersThanCurrent(num);
    }

    private static void smallerNumbersThanCurrent(int[] num) {
        int[] a = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int temp = num[i];
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j]<temp){
                    count+=1;
                }
            }
            a[i]=count;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
