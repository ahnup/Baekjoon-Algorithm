import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        StringTokenizer st = new StringTokenizer(scn.nextLine(), " ");
        ArrayList<Integer> arr = new ArrayList<>();
        while(st.hasMoreTokens()){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        int total = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                total += arr.get(j);
            }
        }
        System.out.println(total);
    }
}