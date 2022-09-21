import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        double a,b,c;
        Scanner k=new Scanner(System.in);
        a=k.nextFloat();
        b=k.nextFloat();
        c=a*b;
        System.out.format("%.2f",c);
        k.close();
    }
}