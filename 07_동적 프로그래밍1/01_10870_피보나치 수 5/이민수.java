// 점화식 Fn = Fn-1 + Fn-2
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.print(fibo(N));
    }
    // 재귀로 푸는 법
	static int fibo(int N) {
		if (N == 0)	return 0;
		if (N == 1)	return 1;
		return fibo(N - 1) + fibo(N - 2);
	}
}

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class Main {
// 	static int[] dp;
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         dp = new int[N + 1];  //DP 배열 초기화
                
//         System.out.print(fibo(N));
//     }
//     // 탑다운 방식
// 	static int fibo(int N) {
// 		if (N <= 1)	return N;
// 		if (dp[N] != 0)	return dp[N]; // 메모이제이션
		
// 		dp[N] = fibo(N-1) + fibo(N-2);
// 		return dp[N];
// 	}
// }

// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class Main {
// 	static int[] dp;
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());        
        
//         System.out.print(fibo(N));
//     }
//     // 바텀업 방식
// 	static int fibo(int N) {
// 		if (N <= 1)	return N;
		
//         dp = new int[N + 1];  //DP 배열 초기화
        
//         dp[0] = 0;
//         dp[1] = 1;
        
//         for (int i = 2; i <= N; i++) {
//         	dp[i] = dp[i-1] + dp[i-2];
// 		}
// 		return dp[N];
// 	}
// }
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14392 KB , 시간 : 128 ms <- 재귀
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14448 KB , 시간 : 104 ms <- 탑타운
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14152 KB , 시간 : 120 ms <- 바텀업
