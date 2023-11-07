package ie.atu;


public class ArrayDemo {
    public static void outputElements(int[] x){
        for(int i=0;i<10;i++){
            x[i] = 100 + i * 100;
            System.out.println("Element at index " + i + ": " + x[i]);
        }
    }
    public static void main(String[] args) {
        int[] array;

        array = new int[10];

        outputElements(array);

    }
}
