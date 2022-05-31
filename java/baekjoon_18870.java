import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int sorted[] = new int[n];
        int i;
        for(i=0; i<n; i++){
            sorted[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int rank = 0;
        for(i=0; i<n; i++){
            if( ! map.containsKey(sorted[i])){
                map.put(sorted[i], rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(i=0; i<n; i++){
            sb.append(map.get(Integer.parseInt(s[i]))).append(" ");
        }
        System.out.println(sb);
    }
}