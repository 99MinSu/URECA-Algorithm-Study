import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n,k;
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
	    n = Integer.parseInt(st.nextToken());
	    k = Integer.parseInt(st.nextToken());
	    boolean[] check = new boolean[n+1];
	    	
	    int cnt = 0;
	    for(int i = 2; i<=n; i++) {
	    	for(int j = i; j<=n; j+=i) {
	    		if(check[j] == false) {
	        		cnt++;
	        		check[j] = true;
	    		}
	    		if(cnt == k) {
	    			System.out.println(j);
	    			return;
	    		}
	    	}
	    }
	}
}

// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14192 KB , 시간 : 100 ms
