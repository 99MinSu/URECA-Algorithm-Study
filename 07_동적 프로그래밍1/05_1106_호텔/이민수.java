import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] cost = new int[N];
		int[] p = new int[N];
		
		int[] dp = new int[C+101];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			cost[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.fill(dp, 10000001);
		dp[0] = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = p[i]; j < C + 101; j++) {
				dp[j] = Math.min(dp[j], dp[j-p[i]]+cost[i]);
			}
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i = C; i < C +101; i++) {
			ans = Math.min(ans, dp[i]);
		}
		System.out.println(ans);
	}
}
// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 14296 KB , 시간 : 128 ms
