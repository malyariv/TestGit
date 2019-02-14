import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run(){
        int[] array={2,9,4,1,3,8,7,5,6,1,9,5,3,7,2,6,8,4};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    private void swap(int[] a, int i){
        int q=a[i];
        a[i]=a[i+1];
        a[i+1]=q;
    }
    private void bubbleSort(int[] a){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]) {
                    swap(a,j);
                }
            }
        }
    }
    private void buildHeap(int[] a){
        
    }
}
