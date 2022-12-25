public class Leetcode345 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        reverse(s,start,end);

    }
    public char[] reverse(char[] a,int start,int end){
        if (start>=end){
            return a;
        }
        char temp;
        temp = a[start];
        a[start] = a[end];
        a[end]=temp;
        reverse(a,start+1,end-1);
        return a;
    }
}
