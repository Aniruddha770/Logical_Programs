import java.util.Scanner;
public class ReverseNumber {


public static void main(String args[])
{
    int num, rev=0, rem;
    Scanner scan = new Scanner(System.in);
	
    System.out.print("Enter a Number : ");
    num = scan.nextInt();
	
    while(num != 0)
    {
        rem = num%10;// calculate the reminder
        rev = rev*10 + rem;//multiply by 10 and add reminder
        num = num/10;// divide the number by 10 and repeat steps until the number becomes 0.
    }
	
    System.out.print("Reverse = " +rev);
}


}
