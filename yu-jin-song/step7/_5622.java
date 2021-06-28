import java.util.Scanner;

public class _5622 {
	public static void main(String[] args) {
		String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		int time = 0;
		
		for(int i=0; i<num.length(); i++) {
			for(int j=2; j<dial.length; j++) {
				if(dial[j].contains(Character.toString(num.charAt(i)))) {
					time += 1+j;
					break;
				}
			}
		}
		
		System.out.println(time);
	}
}
