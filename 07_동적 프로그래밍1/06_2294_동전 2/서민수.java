// 언어 : Java , (성공/실패) : 1/1 , 메모리 : 14204 KB , 시간 : 140 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1]; //동전 가치 배열
        
        for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
       
        int[] dp = new int[k+1]; // 동전 개수 배열
        
        for (int i = 1; i <= k; i++) {
			dp[i] = Integer.MAX_VALUE-1;
		}
        for (int i = 1; i <= n; i++) {
			for (int j = arr[i]; j <= k; j++) {
				//+1 을 하는 이유 -> 동전가치인 arr[i]를 하나뺌으로써 동전하나를 더 사용했기 때문
				dp[j] = Math.min(dp[j], dp[j-arr[i]] + 1); 
			}
		}
        
        if(dp[k] == Integer.MAX_VALUE-1) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(dp[k]);
        }
    }
}
//동전 가치 1원에 대해 dp 배열 갱신:
//dp = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
//		
//동전 가치 5원에 대해 dp 배열 갱신:
//dp = [0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 3]
//
//		동전 가치 12원에 대해 dp 배열 갱신:
//dp = [0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 2, 3, 1, 2, 3, 3]
