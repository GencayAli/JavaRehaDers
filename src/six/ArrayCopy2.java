package six;

import java.util.Arrays;

public class ArrayCopy2 {
    public static void main(String[] args) {

        // copyOf example

        String[] soruce = {"Ali ", "ata ", "bak"};

       String[] destination = Arrays.copyOf(soruce, 4);

        System.out.println("destination array copy ;"+ Arrays.toString(destination));

        // copyOfRange

        String[] source1 = {"Assembly", "Cobal", "C", "c++","Java", "Python"};
        String[] destination1 = Arrays.copyOfRange(source1, 1, 5);

        System.out.println("destination array copy ;" + Arrays.toString(destination1));
    }
}
