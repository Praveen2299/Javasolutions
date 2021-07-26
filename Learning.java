import java.util.Scanner;

public class Learning {
	
	public static void main(String[] args) {
		
		
		
		Learning solution = new Learning();
		solution.ten();
		
	}
		private void one() {
		
			Scanner sc = new Scanner(System.in);
			
		    System.out.println("Please enter the Principle value :");
		    long P = sc.nextLong();
		    System.out.println("Principle value is :" + P);
		
		    System.out.println("Please enter the Rate of Interest: ");
		    double R = sc.nextDouble();
		    System.out.println("Rate of Interest is :" + R);
		
		    System.out.println("Please enter the Time required ");
		    int T = sc.nextInt();
		    System.out.println("Time required is " + T);
		
		    double SI = P*R*T;
		    System.out.println("The Simple interest will be " + SI);
	   }
		
		private void two() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the first number ");
			int a = sc.nextInt();
			System.out.println("The first number is :" + a);
			
			System.out.println("Please enter the second number ");
			int b = sc.nextInt();
			System.out.println("The second number is :" + b);
			
			int temp;
			
			temp = a;
			a = b;
			b = temp;
			
			System.out.println("The swapped a is " + a);
            System.out.println("The swapped b is " + b);
		}
		

		private void three() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the number");
			int n = sc.nextInt();
			String res = (n%2==0)? "even" : "odd";
			System.out.println("The number is " + res);
					
		}
		
		private void four() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the number")
			double n = sc.nextDouble();
			
			}
		
		private void five() {
			int a=2,b=2,c=1,d=3,e=10;
			int n = (a+b-c*d)/e;
			System.out.println(n);
		}
		
		private void six() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the number");
            double n = sc.nextDouble();
			System.out.println("The Decimal number is " + n);
		}
		
		private void ten() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the letter");
			String str = sc.next();
			System.out.println("The letter is " + str);
			boolean flag = true;
			int i = 0;
			int j = str.length()-1;
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
			}
			i++;
			j--;
			System.out.println((flag==true)?"It is a palindrome ":"It is not a palindrome");
		}

}
