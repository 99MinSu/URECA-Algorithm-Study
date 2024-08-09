// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14320 KB , 시간 : 128 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	static int[] dp;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp =  new int[n+2];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(tile(n));
		
	}
	
	static int tile(int n) {
		
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i-2] + dp[i-1];
			dp[i] %= 10007;
		}
		
		return dp[n];
	}
}
