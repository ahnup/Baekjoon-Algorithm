import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }
        int count =0;
        for(int i=0; i<m; i++){
            if(set.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}