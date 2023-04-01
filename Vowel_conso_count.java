           /*COUNT VOWELS AND CONSONANTS IN A STRING*/
import java.util.*;
class Vowel_conso_count 
{
   public static void main(String args[])
 {

   int i,n,x=0,y=0;
    Scanner in = new Scanner(System.in);
    System.out.println("enter a sting ");
    String s=in.next();
    n=s.length();
    char c[] =s.toCharArray();
    for(i=0;i<n;i++)
    {
      if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| 
                c[i]=='u'|| c[i]=='A'|| c[i]=='E'|| c[i]=='I' || c[i]== 'O' ||c[i]=='U')
          x=x+1;
       else 
      y=y+1;
   }
   System.out.println("vowel count =" +x);
   System.out.println("consonant count =" +y);
  }
}    