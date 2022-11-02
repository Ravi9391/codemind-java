import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++)
        {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=0;
                for(int i=a;i<b+1;i++)
                {
                    if(i%10==2 || i%10==3 || i%10==9)
                    {
                        c+=1;
                    }
                }
                System.out.println(c);
            }
    }
}