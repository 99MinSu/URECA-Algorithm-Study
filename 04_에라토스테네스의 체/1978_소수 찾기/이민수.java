import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
			  arr[i] = Integer.parseInt(st.nextToken());
			  cnt = 0;
			  for (int j = 1; j <= arr[i]; j++) {
				    if( arr[i] % j == 0) {
					  cnt++;
				    }
			  }
			  if( cnt == 2) {
				    ans++;
			  }
		}  
        
    System.out.println(ans);		
    }
}

// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14168 KB , 시간 : 104 ms
