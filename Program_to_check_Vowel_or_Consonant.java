import java.util.*;
class file
{
    public static void main(String divya[])
    {
        Scanner k=new Scanner(System.in);
        char vaw;
        vaw=k.nextLine().charAt(0);
        if(vaw=='A'||vaw=='e'||vaw=='I'||vaw=='O'||vaw=='U'||vaw=='a'||vaw=='i'||vaw=='e'||vaw=='o'||vaw=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}