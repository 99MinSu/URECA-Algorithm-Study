// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14344 KB , 시간 : 128 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= N; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-3]) + 1;
        }
        if (dp[N] % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }
    
}
