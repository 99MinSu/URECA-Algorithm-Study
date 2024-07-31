import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 돌의 개수 입력
        
        int[] dp = new int[N+1];
        int[][] eng = new int[N-1][2];
        
        // N-1개의 줄에 걸쳐 작은 점프, 큰 점프 시 필요한 에너지 입력
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            eng[i][0] = Integer.parseInt(st.nextToken()); // 작은 점프 에너지
            eng[i][1] = Integer.parseInt(st.nextToken()); // 큰 점프 에너지
        }
        
        int K = Integer.parseInt(br.readLine()); // 매우 큰 점프에 필요한 에너지
        
        // dp 배열을 큰 값으로 초기화
        for (int i = 2; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        // 첫 번째 돌에서 시작
        dp[1] = 0;
        
        // 작은 점프와 큰 점프를 통한 dp 계산
        for (int i = 1; i < N; i++) {
            if (i + 1 <= N) {
                dp[i+1] = Math.min(dp[i+1], dp[i] + eng[i-1][0]); // 작은 점프
            }
            if (i + 2 <= N) {
                dp[i+2] = Math.min(dp[i+2], dp[i] + eng[i-1][1]); // 큰 점프
            }
        }
        
        int minEnergy = dp[N]; // 초기 최소 에너지 설정
        
        // 매우 큰 점프를 사용하는 경우를 별도로 계산
        for (int i = 1; i <= N-3; i++) {
            int[] tempDp = dp.clone(); // dp 배열 복사
            tempDp[i+3] = Math.min(tempDp[i+3], tempDp[i] + K); // 매우 큰 점프 사용
            for (int j = i+3; j < N; j++) {
                if (j + 1 <= N) {
                    tempDp[j+1] = Math.min(tempDp[j+1], tempDp[j] + eng[j-1][0]); // 작은 점프
                }
                if (j + 2 <= N) {
                    tempDp[j+2] = Math.min(tempDp[j+2], tempDp[j] + eng[j-1][1]); // 큰 점프
                }
            }
            minEnergy = Math.min(minEnergy, tempDp[N]); // 최소 에너지 갱신
        }       
        System.out.println(minEnergy); // 최종 최소 에너지 출력
    }
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14220 KB , 시간 : 132 ms
