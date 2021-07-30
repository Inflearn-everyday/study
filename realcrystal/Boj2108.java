import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Boj2108{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputArr = new int[n];
        int[] outputArr = new int[n];
        int[] count = new int[8001];
        int maxFreqIdx = 0;
        for(int i = 0; i < inputArr.length; i++){
            inputArr[i] = Integer.parseInt(br.readLine());
            count[inputArr[i]+4000]++;
            if(count[inputArr[i]+4000] > count[maxFreqIdx]){
                maxFreqIdx = i;
            }
        }
        int sum = 0;
        for(int i = 1; i < count.length; i++){
            sum += count[i];
            count[i] = sum;
        }
        for(int i = n - 1; i >= 0; i--){
            outputArr[--count[inputArr[i]]] = inputArr[i];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(outputArr[i]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
