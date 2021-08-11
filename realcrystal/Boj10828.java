import java.io.*;

class Boj10828{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCommand = Integer.parseInt(br.readLine());
        int[] stack = new int[numOfCommand];
        int size = 0;
        for (int i = 0; i < numOfCommand; i++){
            String command = br.readLine();
            String[] parsed = command.split(" ");
            int value = -1;
            if(parsed.length == 2){
                command = parsed[0];
                value = Integer.parseInt(parsed[1]);
            }
            switch(command){
                case "push":
                    stack[size++] = value;
                    break;
                case "pop":
                    if(size <= 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack[--size]);
                    }
                    break;
                case "size":
                    System.out.println(size);
                    break;
                case "empty":
                    if(size == 0) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "top":
                    if(size <= 0){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack[size-1]);
                    }
                    break;
            }
        }
        
    }
}
