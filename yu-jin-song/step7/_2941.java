import java.util.Scanner;

public class _2941 {
	public static void main(String[] args) {
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for(int i=0; i<croatia.length; i++) {
			if(word.contains(croatia[i]))
				word = word.replace(croatia[i], "0");
		}
		
		int cnt = word.length();
		
		System.out.println(cnt);
	}
}
