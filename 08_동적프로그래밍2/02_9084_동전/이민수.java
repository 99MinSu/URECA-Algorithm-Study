import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int tc = 0; tc < T; tc++) {
        	
        	int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cost = new int[N];
            for (int i = 0; i < N; i++) {
				cost[i] = Integer.parseInt(st.nextToken());
			}
            
            int M = Integer.parseInt(br.readLine());
            
            int[] dp = new int[M+1];
           
            dp[0] = 1;
           
            for (int i = 0; i < N; i++) {
    			for (int j = cost[i]; j <= M; j++) {
    				dp[j] += dp[j-cost[i]];
    			}
    		}
            
            System.out.println(dp[M]);
        }
    }
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14140 KB , 시간 : 124 ms
