import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		//dp 선언 바텀업 활용
		int[][] dp = new int[30][30];
		
		// nCo = 1, nCn = 1 특징 이용 배열에 넣기
		for (int i = 0; i < 30; i++) {
			dp[i][0] = 1;
			dp[i][i] = 1;
		}
		
		// n+1 C r+1 = nCr + n C r+1 특징 이용
		for (int i = 1; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
			}
		}
		StringBuilder sb = new StringBuilder();
		// 테이스 케이스
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			System.out.println(dp[M][N]);
		}
	}
}
// 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 45008 KB , 시간 : 208 ms
