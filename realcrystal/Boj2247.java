import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Boj2247 {
    private static boolean[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        matrix = new boolean[n + 1][n + 1];
        square(n, 1, 1);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(matrix[i][j]){
                    sb.append("*");
                    //System.out.print("*");
                }else{
                    sb.append(" ");
                    //System.out.print(" ");
                }
            }
            sb.append("\n");
            //System.out.println("");
        }
        
        System.out.print(sb);
    }
    
    public static void square(int size, int m, int n){
        if(size == 3){
            for(int i = m; i < m + size; i++){
                for(int j = n; j < n + size; j++){
                    if (i % size == 2 && j % size == 2){
                        matrix[i][j] = false;
                    }else{
                        matrix[i][j] = true;
                    }
                }
            }
        }else{
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(i == 1 && j == 1){
                        fillFalse(size/3, size/3 * i + m, size/3 * j + n);
                    }else{
                        square(size/3, size/3 * i + m, size/3 * j + n);
                    }
                }
            }
        }
    }
    
    public static void fillFalse(int size, int m, int n){
        for(int i = m; i < m + size; i++){
            for(int j = n; j < n + size; j++){
                matrix[i][j] = false;
            }
        }
    }
}
