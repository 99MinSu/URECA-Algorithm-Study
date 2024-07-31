import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] dp = new int[k+1];
        
        int[] cost = new int[n];
        
        for (int i = 0; i < n; i++) {
			cost[i] = Integer.parseInt(br.readLine());
		}
        
        for (int i = 0; i <= k; i++) {
			dp[i] = Integer.MAX_VALUE - 1;
		}
        
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
			for (int j = cost[i]; j <= k; j++) {
				dp[j] = Math.min(dp[j],dp[j-cost[i]]+1);
			}
		}
        // 초기화 했던 값이면 -1을 출력해준다
        if(dp[k] == Integer.MAX_VALUE - 1) {
        	System.out.println(-1);
        }else
            System.out.println(dp[k]);
      }
}
// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14336 KB , 시간 : 144 ms
