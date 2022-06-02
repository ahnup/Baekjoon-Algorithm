import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int nums[] = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(nums);
        System.out.println(nums[0]*nums[N-1]+"");
    }
}