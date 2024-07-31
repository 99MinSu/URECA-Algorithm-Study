// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14208	 KB , 시간 : 128 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()); // 동전의 가지 수
            int[] cost = new int[N]; // 각 동전의 금액 저장
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < cost.length; j++) {
                cost[j] = Integer.parseInt(st.nextToken());
            }
            
            int M = Integer.parseInt(br.readLine()); // 만들어야 할 금액
            int[] dp = new int[M + 1]; // dp 배열 생성, dp[i]는 금액 i를 만드는 방법의 수
            
            dp[0] = 1; // 금액 0을 만드는 방법은 1가지
            
            for (int j = 0; j < N; j++) { // 각 동전에 대해
                for (int k = cost[j]; k <= M; k++) { // 금액 cost[j]부터 M까지
                    dp[k] += dp[k - cost[j]]; // k - cost[j] 금액을 만드는 방법에 현재 동전을 추가하는 경우
                }
            }
            
            System.out.println(dp[M]);
    }
}
