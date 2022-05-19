import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int height, weight, rank;
        int[][] info = new int[n][2];
        StringBuilder sb = new StringBuilder();
        //정보 배열에 저장
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            info[i][0] = Integer.parseInt(s[0]);
            info[i][1] = Integer.parseInt(s[1]);
        }
        for(int i=0; i<n; i++){
            rank = 1;
            for(int j=0; j<n; j++){
                if(j == i){continue;}
                if(info[i][0] < info[j][0] && info[i][1] < info[j][1]){
                    rank += 1;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}