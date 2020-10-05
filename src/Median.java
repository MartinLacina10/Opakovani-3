import java.util.Scanner;

public class Median{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Napis cislo: ");

        int a=sc.nextInt();
        double[] next=new double[a];

        System.out.println("vloz "+a+" cisla: ");
        for(int x=0;x<a;x++) {
            next[x]=sc.nextDouble();

        }

        double b = Median1(a,next);
        System.out.println("Median :"+b);

    }
    static double Median1(int i,double in[]){

        double c=0;

        if(i%2==1) {
            c=in[((i+1)/2)-1];
        }
        else {
            c=(in[i/2-1]+in[i/2])/2;

        }
        return c;

    }
}