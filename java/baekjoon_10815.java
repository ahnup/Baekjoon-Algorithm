import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // N의 개수
        HashSet<Integer> set = new HashSet<>();
        String s[] = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            set.add(Integer.parseInt(s[i]));
        }
        int m = Integer.parseInt(br.readLine());//M의 개수
        s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            if(set.contains(Integer.parseInt(s[i]))){
                sb.append("1 ");
            }
            else{sb.append("0 ");}
        }
        System.out.println(sb);
    }
}