import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num[] = new int[10001];
        for(int i=0; i<n; i++){
            num[Integer.parseInt(br.readLine())] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10001; i++){
            if(num[i] != 0){
                for(int j=0; j<num[i]; j++){
                    sb.append(i+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}