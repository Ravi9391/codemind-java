import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        double a,b;
        Scanner k = new Scanner(System.in);
        a=k.nextInt();
        b=(32+(a*9/5));
        System.out.format("%.2f",b);
        k.close();
    }
}