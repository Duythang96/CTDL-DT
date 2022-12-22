public class Sort {

    public static void main(String[] args) {
        int[] a ={8,3,6,4,1,7,9,2};

        bubbleSort(a);
        selectionSort(a);
        insertionSort(a);
    }

    private static void selectionSort(int[] a) {
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            for (int j = 0; j < a.length; j++) {
                if (min < a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Selection Sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println(" ");
    }

    private static void bubbleSort(int[] a) {
        int temp = 0;
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Bubble Sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(+a[i]+",");
        }
        System.out.println(" ");
    }
    private static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i-1;

            while (j>=0&&a[j]>key){
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1] = key;
        }
        System.out.println("insertion Sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println(" ");
    }
}
