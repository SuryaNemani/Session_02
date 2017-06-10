
import java.util.Scanner;
	public class compare {
		public static void main(String[] args) {
			int a,b,c;
			Scanner Input=new Scanner(System.in);
			System.out.println("Enter a");
			a=Input.nextInt();
			System.out.println("Enter b");
			b=Input.nextInt();
			System.out.println("Enter c");
			c=Input.nextInt();
			if(a>b && b>c)
				System.out.println("a is greater than b and c");
			else if(b<c)
				System.out.println("c is greater than a and b");
			else
				System.out.println("b is greater than a and c");
			
}
	}
		


