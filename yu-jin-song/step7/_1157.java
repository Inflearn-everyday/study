import java.util.Scanner;

public class _1157 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int[] use = new int[26];
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine().toLowerCase();
		
		for(int i=0; i<word.length(); i++) {
			for(int j=0; j<26; j++) {
				if(word.charAt(i) == alphabet.charAt(j))
					use[j]++;
			}
		}
		
		int many = 0, same = 0, place = 0;
		
		for(int i=0; i<26; i++) {
			if(use[i] == many)
				same++;
			
			if(use[i] > many) {
				same = 0;
				place = i;
				many = use[i];
			}
		}
		
		if(same != 0)
			System.out.println("?");
		else
			System.out.println(Character.toUpperCase(alphabet.charAt(place)));
	}
}
