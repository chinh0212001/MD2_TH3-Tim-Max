import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.print("Size should not exceed 20");
        }while (size > 20);
            array = new int[size];
            int i = 0;
            while (i < array.length){
                System.out.print("Enter element"+(i +1) + " : ");
                array[i] = scanner.nextInt();
                i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}