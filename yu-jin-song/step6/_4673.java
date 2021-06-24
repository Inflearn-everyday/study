import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _4673 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] idx = new boolean[100000];
		
		for(int i=1; i<=10000; i++) {
			idx[d(i)] = true;
		}
		
		for(int i=1; i<=10000; i++) {
			if(idx[i] == false)
				bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static int d(int n) {
		String num = Integer.toString(n);
		int result = n;
		
		for(int i=0; i<num.length(); i++)
			result += Character.getNumericValue(num.charAt(i));
		
		return result;
	}

}
