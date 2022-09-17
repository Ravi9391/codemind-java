import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k = new Scanner(System.in);
        double a,b,c;
        a=k.nextDouble();
        b=k.nextDouble();
        c=k.nextDouble();
        double s=(a+b+c)/2;
        double t=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",t);
    }
}