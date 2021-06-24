
public class Boj4673 {

	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		int ret;
		for(int i = 1; i <= 10000; i++) {
			ret = d(i);
			if(ret <= 10000) arr[ret] = true;
		}
		
		for(int i = 1; i <= 10000; i++) {
			if(!arr[i]) System.out.println(i);
		}

	}
	
	public static int d(int n) {
		int d = n;
		while(n != 0) {
			d += n % 10;
			n /= 10;
		}
		return d;
	}

}
