import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num[] = new int[n];
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(num[i]+" ");
        }
        System.out.println(sb);
    }
}