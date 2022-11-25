import java.util.*;
class DisplayVowels
{
    public static boolean pal(String s)
    {
        int n=s.length();
        for(int i=0;i<=n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
            return false;
        }
        return true;
    }
    public static String check(String s)
    {
        int min=1000,max=-1;
        String vowels="aeiouAEIOU";
        for(int i=0;i<s.length();i++)
        {
            if(vowels.contains(s.charAt(i)+""))
            {
                if(min>s.charAt(i))
                min=s.charAt(i);
                if(max<s.charAt(i))
                max=s.charAt(i);
            }
        }
        if(max==-1)
        return "-1 -1";
        return (char)min+" "+(char)max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String s[]=line.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(pal(s[i]))
            {
                String res=check(s[i]);
                System.out.println(res);
            }
        }
    }
}