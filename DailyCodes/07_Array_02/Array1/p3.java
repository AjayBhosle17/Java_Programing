import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the character array: ");
        int size = Integer.parseInt(reader.readLine());

        char[] charArray = new char[size];
        System.out.printf("Enter %d characters of the array:%n", size);

        for (int i = 0; i < size; i++) {
            charArray[i] = (char) reader.read();
         //   reader.readLine(); // to consume the newline character
        }

        System.out.println("The character array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(charArray[i] + " ");
        }
    }
}

