import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input[] = br.readLine().split(" ");
        int fn = Integer.parseInt(input[0]);
        int ln = Integer.parseInt(input[1]);
        boolean prime[] = new boolean[ln+1];
        prime[1] = true;
        for(int i=2; i<=Math.sqrt(ln); i++){
            for(int j=i*i; j<=ln; j+=i){
                prime[j] = true;
            }
        }
        for(int i=fn; i<=ln; i++){
            if(prime[i] == false){
                System.out.println(i);
            }
        }
    }
}