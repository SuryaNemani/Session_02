
import java.util.Scanner;
	public class compare {
		public static void main(String[] args) {
			int a,b,c;
			Scanner Input=new Scanner(System.in);  //using scanner class to take input from keyboard
			System.out.println("Enter a"); 
			a=Input.nextInt();      // taking value from Keyboard and assigning it to a
			System.out.println("Enter b");
			b=Input.nextInt();    // taking value from Keyboard and assigning it to b
			System.out.println("Enter c");
			c=Input.nextInt();      // taking value from Keyboard and assigning it to c
			if(a>b && b>c)    // comparing 
				System.out.println("a is greater than b and c");
			else if(b<c)    //if a<b and b<c
				System.out.println("c is greater than a and b");
			else            //all other conditions
				System.out.println("b is greater than a and c");
			
}
	}
		


