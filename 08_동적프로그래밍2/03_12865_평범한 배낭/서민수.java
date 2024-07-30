// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 53836 KB , 시간 : 196 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] weights = new int[N+1];
		int[] values = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			weights[i] = Integer.parseInt(st.nextToken());
			values[i] = Integer.parseInt(st.nextToken());
		}
		
		int[][] dp = new int[N+1][K+1];
		
		for (int i = 1; i <= N; i++) {
			for (int w = 0; w <= K; w++) {
				if (weights[i] <= w) {
					// 현재 물품을 넣을 수 있는 경우
          // 물품을 넣는 경우와 넣지 않는 경우 중 최대 가치를 선택
					dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-weights[i]] + values[i]);
				} else {
					 // 현재 물품을 넣을 수 없는 경우
					dp[i][w] = dp[i-1][w];// 이전값 가져오기
				}
			}
		}
		
		System.out.println(dp[N][K]);
	}
}
