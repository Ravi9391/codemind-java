import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner ab=new Scanner(System.in);
        int a=ab.nextInt(),odd=0;
        int x[]=new int[a];
        for(int i=0;i<a;i++)
        {
            x[i]=ab.nextInt();
            if(x[i]%2!=0)
            {
                odd++;
            }
        }
        if(odd>2)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}