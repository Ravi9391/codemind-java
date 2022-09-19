import java.util.Scanner;
import java.lang.*;
class file
{
    public static void main(String[] args)
    {
        double a,b,c,s,area;
        Scanner k=new Scanner(System.in);
        a=k.nextInt();
        b=k.nextInt();
        c=k.nextInt();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",area);
        k.close();
    }
}