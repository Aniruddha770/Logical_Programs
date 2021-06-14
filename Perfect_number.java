import java.util.Scanner;
public class Perfect_number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n , sum =0;
		System.out.println("Enter a number:: ");
		n = s.nextInt();
		int i =1;
		while(i <= n/2) {
		if(n % i ==0) {
			sum = sum + i;
		}
		i++;
	}
       if (sum == n) {
    	   System.out.println(n+ "is a perfect number");
       }
       else {
    	   System.out.println(n+ "is not a perfect number");
       }
    	   
}
}