package six;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Arrays;

public class ArrayFinden {
    public static void main(String[] args) {

        String[] programlamaDilleri = {"Assembly", "Cobal", "C", "c++","Java", "Python"};

        Arrays.sort(programlamaDilleri);
        System.out.println("Sirali Dizi :" + Arrays.toString(programlamaDilleri));
        System.out.println(Arrays.binarySearch(programlamaDilleri, "Cobol"));


        System.out.println("********************************************************");
        // Kednimz yaparsak

        String[] programlamaDilleri2 = {"Assembly", "Cobal", "C", "c++","Java", "Python"};

         Boolean varMi = false;
        for (String string: programlamaDilleri2) {
            if (string.equals("java"));
            System.out.println("Java var");
            varMi = true;
            break;
        }
        if (!varMi){
            System.out.println("java yok");
        }
    }
}
