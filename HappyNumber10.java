// Check if a number is a happy number
// Happy number - if the sum of the cube of each digit equals to it


package happynumber10;
import java.util.*;
public class HappyNumber10 {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
 
int hap = 0;
int temp;
System.out.println("Enter a number: ");
int num = sc.nextInt();
int num2 = num;

for(int i = 0;; i++){
   temp = num2/10;
   temp = temp*temp*temp;
   hap = hap + temp;
   num2 = num2/10;
   if(num2 == 0)
     break;
   }

if(hap == num)
    System.out.println("It is a happy number");
else
    System.out.println("It is not a happy number");
    }
    
}
