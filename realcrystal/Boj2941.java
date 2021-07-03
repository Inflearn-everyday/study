import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Boj2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TreeMap<String, Boolean> dict = new TreeMap<String, Boolean>();
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		for (int i = 0; i < arr.length; i++) {
			dict.put(arr[i], true);
		}
		int count = 0;
		String word = br.readLine();
		int beginindex = 0;
		int endindex = 0;
		String subString = null;
		while (endindex < word.length()) {
			beginindex = endindex;
			if (beginindex + 1 == word.length()) { // 마지막 한 글자가 남은 경우
				endindex++;
				count++;
				continue;
			}
			if (beginindex + 2 <= word.length()) {
				endindex = beginindex + 2; // 길이 2인 문자열 검사
				subString = word.substring(beginindex, endindex);
				if (dict.containsKey(subString)) {
					count++;
					continue;
				}
				endindex--;
			}
			if (beginindex + 3 <= word.length()) {
				endindex += 2; // 길이 3인 문자열 검사
				subString = word.substring(beginindex, endindex);
				if (dict.containsKey(subString)) {
					count++;
					continue;
				}
				endindex -= 2;
			}
			count++; // 길이 2, 3인 substring과 일치하는 크로아티아 알파벳이 없기 때문에 단일 알파벳 한 글자를 센다
		}
		System.out.print(count);
	}
}
