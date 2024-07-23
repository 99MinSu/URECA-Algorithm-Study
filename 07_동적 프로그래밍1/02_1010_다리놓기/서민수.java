// 언어 : Java , (성공/실패) : 1/0 , 메모리 : 14468 KB , 시간 : 156 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	static int[][] check = new int[30][30];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			System.out.println(dp(M, N)); //M개에서 N개를 뽑는 조합공식
		}
    }
    
    public static int dp(int m, int n) {
    	if(check[m][n] != 0) return check[m][n];
    		
    	if(m == n || n == 0) return check[m][m] = 1; //조합의 성질
    	
    	return check[m][n] = dp(m-1, n-1) + dp(m-1, n);
    }
}
