import java.util.Scanner;

class Demo {

    	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the character array: ");
        int size = scanner.nextInt();

        char[] charArray = new char[size];
        System.out.printf("Enter %d characters of the array:%n", size);

        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.next().charAt(0);
        }

        System.out.println("The character array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}

