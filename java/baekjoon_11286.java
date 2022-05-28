import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                int abs1 = Math.abs(i1);
                int abs2 = Math.abs(i2);
                if(abs1 > abs2){
                    return 1;
                }
                if(abs1 == abs2){
                    if(i1 > i2){
                        return 1;
                    }
                    else{return -1;}
                }
                else{
                    return -1;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            int n = Integer.parseInt(br.readLine());
            if(n != 0){
                queue.add(n);
            }
            else{
                if(!queue.isEmpty()){
                    sb.append(queue.poll()+"\n");    
                }
                else{
                    sb.append("0\n");
                }
            }
        }
        System.out.println(sb);
    }
}