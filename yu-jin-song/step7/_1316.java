import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String addAlpha = "";
		char pre = '0';
		int group = 0;
		boolean duplication = false;
		
		for(int i=0; i<n; i++) {
			String word = br.readLine();
			
			for(int j=0; j<word.length(); j++) {
				char now = word.charAt(j);
				
				if(pre != now) {
					if(addAlpha.contains(String.valueOf(now))) {
						duplication = true;
						break;
					}
					
					pre = now;
					addAlpha += now;
				}
				
			}
			
			if(!duplication)
				group++;
			
			duplication = false;
			pre = '0';
			addAlpha = "";
		}
		
		System.out.println(group);
	}
}
