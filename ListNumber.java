import java.util.Scanner;

public class ListNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of list number: ");
        int size = input.nextInt();

        int[] listNumber = new int[10];
        enterElementListNumber(listNumber,size);

        System.out.println("List number: ");
        displayListNumber(listNumber,size);
        insertNumberToListNumber(listNumber, size);
    }

    public static void enterElementListNumber(int[] listNumber, int size){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element in index " + i);
            listNumber[i] = input.nextInt();
        }
    }

    public static void displayListNumber(int[] listNumber, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(listNumber[i] + "\t");
        }
    }

    public static void insertNumberToListNumber(int[] listNumber, int size){
        Scanner input = new Scanner(System.in);

        System.out.println("\nNumber need insert to list: ");
        int numberInsert = input.nextInt();
        System.out.println("Enter index insert: ");
        int index = input.nextInt();

        if (index >= 0 && index < size){
            for (int i = size; i > index; i--) {
                listNumber[i] = listNumber[i - 1];
            }
            listNumber[index] = numberInsert;
            size++;
        } else {
            throw new IndexOutOfBoundsException();
        }
        System.out.println("List number after insert: ");
        displayListNumber(listNumber, size);
    }
}
