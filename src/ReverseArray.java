import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+"\t");
        }
    }
}
