import java.util.*;
import java.math.BigInteger;
class Sumit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            BigInteger n=sc.nextBigInteger();
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger k=sc.nextBigInteger();
            BigInteger A=new BigInteger("2");
            BigInteger s,s1,s2,s3,s4;
            s=n.divide(a);
            s1=n.divide(b);
            s4=(a.multiply(b)).divide(a.gcd(b));
            s3=(s.add(s1)).subtract(A.multiply(n.divide(s4)));
            int c=s3.compareTo(k);
            
            if(c==0||c==1)
            System.out.println("Win");
            else
            System.out.println("Lose");
            t--;
        }
    }
}