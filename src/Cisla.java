import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Cisla{
    public static void main(String[] args){
        Scanner mySc = new Scanner(System.in);

        System.out.println("Napis kolik chces cisel:");

        int amount = mySc.nextInt();
        String a = "";

        mySc.nextLine();
        String[] b = new String[amount + 1];
        System.out.println("");
        for (int i = 1; i <= amount; i++) {
            b[i] = mySc.nextLine();
        }
        System.out.println("");

        List list1 = Arrays.asList(b);

        while (!a.equals("quit")) {
            System.out.println("Input (Ukoncit ?):");
            a = mySc.nextLine();
            if (!a.equals("konec")) {
                System.out.println("Output:");
                System.out.println(list1.indexOf(a));
            }
        }
    }
}
