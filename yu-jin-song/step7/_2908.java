import java.util.Scanner;

public class _2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1 = Integer.toString(sc.nextInt());
		String n2 = Integer.toString(sc.nextInt());
		
		String num1="", num2="";
		
		for(int i=2; i>=0; i--) {
			num1 += n1.charAt(i);
			num2 += n2.charAt(i);
		}
		
		if(Integer.parseInt(num1) > Integer.parseInt(num2))
			System.out.println(num1);
		else
			System.out.println(num2);
	}
}
