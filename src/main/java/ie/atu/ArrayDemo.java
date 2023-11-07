package ie.atu;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array;
        int i;

        array = new int[10];

        for(i=0;i<10;i++){
            array[i] = 100 + i * 100;
            System.out.println("Element at index " + i + ": " + array[i]);
        }

    }
}