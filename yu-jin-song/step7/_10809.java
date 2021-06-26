import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _10809 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = sc.nextLine();
		
		int[] idx = new int[26];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<26; i++)
			idx[i] = -1;
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<alphabet.length(); j++) {
				if(alphabet.charAt(j) == s.charAt(i) && idx[j] == -1) {
					idx[j] = i;
					break;
				}
			}
		}
		
		for(int i=0; i<idx.length; i++)
			bw.write(idx[i] + " ");
		
		bw.newLine();
		bw.flush();
		bw.close();
	}
}
