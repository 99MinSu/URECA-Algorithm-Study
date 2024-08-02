import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int M = Integer.parseInt(st.nextToken()); // 각 학생이 가진 블록의 최대 개수
        int H = Integer.parseInt(st.nextToken()); // 목표 높이

        int[][] blocks = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                blocks[i][j] = Integer.parseInt(s[j]);
            }
        }

        int[][] dp = new int[N + 1][H + 1];
        dp[0][0] = 1; // 높이 0을 만드는 경우의 수는 1

        for (int i = 1; i <= N; i++) {
            for (int h = 0; h <= H; h++) {
                // 이전 학생까지의 경우의 수 가져오기
                dp[i][h] = dp[i-1][h];

                for (int j = 0; j < M; j++) {
                    int block = blocks[i-1][j];
                    if (block == 0) continue;
                    if (h >= block) {
                    	// h - block 현재높이 h에서 block 을 사용하기 전의 높이
                        dp[i][h] = (dp[i][h] + dp[i-1][h-block]) % 10007;
                    }
                }
            }
        }
        System.out.println(dp[N][H]);
    }
}
