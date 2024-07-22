import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        // 바텀업 형식
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        
        // 돌을 1개 가져가는 경우와 3개를 가져가는 경우 둘 다 고려해 최소값을 구한다
        for (int i = 4; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }
        // 홀수면 상근이 승리 짝수면 창영이 승리
        if (dp[n] % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
/**
DP를 푸는 순서

1. 상태 결정
dp[1] : 돌이 1개 있으면 상근이가 먼저 1개를 가져가므로 상근이 승리
dp[2] : 상근이가 1개를 가져가고 남은 1개를 창영이가 가져가므로 창영 승리.
dp[3] : 상근이가 처음부터 3개를 가져가면 상근 승리
dp[4] : 상근이가 처음에 1개를 가져가면 창영이가 3개를 가져가서 창영 승리. 상근이가 처음에 3개를 가져가면 창영이가 1개를 가져가서 창영 승리.
dp[5] : 상근이가 처음에 1개를 가져가면 창영이가 1개를 가져가든 3개를 가져가든 3개나 1개가 남아 상근이가 나머지를 가져가면 상근 승리. 상근이가 처음에 3개를 가져가면 창영이는 1개밖에 못가져가므로 나머지 1개를 상근이가 가져가 상근 승리.
 
2. 관계를 수식화
돌을 1개를 가져가는 경우와 3개를 가져가는 경우 둘 다 고려해 최소값을 구한다.
dp[n] = Math.min(dp[n-1], dp[n-3]) + 1
dp[n] 이 홀수면 상근 승리, 짝수면 창영 승리

3. 초기값 정하기
dp[1] = 1
dp[2] = 2
dp[3] = 1
*/
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14360 KB , 시간 : 108 ms
