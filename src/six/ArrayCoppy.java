package six;

import java.util.Arrays;

public class ArrayCoppy {
    public static void main(String[] args) {

        String[] soruce = {"Ali ", "ata ", "bak"};
        String[] destinatton = new String[3];

        System.out.println("destrination array copy befor : " +Arrays.toString(destinatton));

        System.arraycopy(soruce, 0, destinatton, 0, 3);
        System.out.println("destrination array copy : " +Arrays.toString(destinatton));
    }
}
