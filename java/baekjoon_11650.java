import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static int tmp[][];
    public static void merge(int array[][], int p, int q, int r){
        int i = p; int j = q+1;
        int t = p; int k;
        while(i<=q && j<=r) {
        	if(array[i][0] < array[j][0]) {
        		tmp[t][0] = array[i][0];
        		tmp[t++][1] = array[i++][1];
        	}
        	else if(array[i][0] == array[j][0]) {
        		if(array[i][1] < array[j][1]) {
        			tmp[t][0] = array[i][0];
            		tmp[t++][1] = array[i++][1];
        		}
        		else {
        			tmp[t][0] = array[j][0];
            		tmp[t++][1] = array[j++][1];
        		}
        	}
        	else {
        		tmp[t][0] = array[j][0];
        		tmp[t++][1] = array[j++][1];
        	}
        }
        if(i>q) {
        	for(k=j; k<=r; k++) {
        		tmp[t][0] = array[k][0];
        		tmp[t++][1] = array[k][1];
        	}
        }
        else {
        	for(k=i; k<=q; k++) {
        		tmp[t][0] = array[k][0];
        		tmp[t++][1] = array[k][1];
        	}
        }
        for(k=p; k<=r; k++) {
        	array[k][0] = tmp[k][0]; 
        	array[k][1] = tmp[k][1]; 
        }
    }
    public static void mergeSort(int array[][], int p, int r){
    	if(p<r) {
    		int q = (p+r)/2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);
    	}
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[][] = new int[n][2];
        tmp = new int[n][2];
        String s[];
        for(int i=0; i<n; i++){
            s = br.readLine().split(" ");
            array[i][0] = Integer.parseInt(s[0]);
            array[i][1] = Integer.parseInt(s[1]);
        }
        mergeSort(array, 0, n-1);
        for(int j=0; j<n; j++){
            System.out.println(array[j][0]+" "+array[j][1]);
        }
    }
}