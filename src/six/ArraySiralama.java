package six;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySiralama {
    public static void main(String[] args) {

        Integer[] nummer = {100, 25, -5, 16, 87, 15};

        System.out.println("nummer befor sort ;" + Arrays.toString(nummer));

        Arrays.sort(nummer);
        System.out.println("destination nachdem sort ;" + Arrays.toString(nummer));

        Arrays.sort(nummer, Collections.reverseOrder());
        System.out.println("destination nachdem sort ;" + Arrays.toString(nummer));

    }
}
