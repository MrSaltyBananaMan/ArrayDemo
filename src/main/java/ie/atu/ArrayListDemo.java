package ie.atu;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void assignLoop(ArrayList<Integer> x){
        for(int i = 0; i<10;i++){
            x.add(100 + i * 100);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assignLoop(arrayList);
        for(int number : arrayList){
            System.out.println(number);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a new number:");
        arrayList.add(scanner.nextInt());
        for(int number : arrayList){
            System.out.println(number);
        }
    }
}
