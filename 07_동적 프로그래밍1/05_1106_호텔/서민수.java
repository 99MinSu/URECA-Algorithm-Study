// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14228 KB , 시간 : 124 ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int c, n;
    static int[] dp; // dp 배열은 각 고객 수에 도달하기 위한 최소 비용을 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        c = Integer.parseInt(s[0]); 
        n = Integer.parseInt(s[1]); 

        dp = new int[c + 101]; // dp 배열의 크기를 설정 (c+100까지 계산을 위해 +101)
        Arrays.fill(dp, 987654321); // 초기값을 큰 수로 채움 (최소값을 찾기 위해)
        dp[0] = 0; // 고객 0명을 확보하는 데 드는 비용은 0


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken()); 
            int customer = Integer.parseInt(st.nextToken()); 

            // dp 배열을 갱신 (customer 수 부터 c+100 까지)
            for (int j = customer; j < c + 101; j++) {
                dp[j] = Math.min(dp[j], cost + dp[j - customer]);
            }
        }

        // 최소한 c명의 고객을 확보하기 위해 드는 최소 비용을 찾음
        int result = Integer.MAX_VALUE;
        for (int i = c; i < c + 101; i++) {
            result = Math.min(result, dp[i]);
        }
        System.out.println(result);
    }
}
