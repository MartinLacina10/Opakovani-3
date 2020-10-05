import java.util.Scanner;

public class Prumer{
    public static void main(String arg[]){

        int b;
        double d=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Napis z kolika cisel chces prumer:");

        b=sc.nextInt();

        int a[]=new int[b];

        System.out.println("Napis "+b+" cisla");

        for(int i=0;i<b;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<b;i++)
            d=d+a[i];

        System.out.println("prumer="+d/b);

    }

}
