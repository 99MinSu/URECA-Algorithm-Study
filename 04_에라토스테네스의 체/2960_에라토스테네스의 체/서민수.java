# 언어 : Java , (성공/실패) : 1/1, 메모리 : 	14312 KB , 시간 : 124 ms
  import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		//지운 정수 확인배열
		boolean[] check = new boolean[N+1];
		int cnt = 0;
		
		for(int i=2;i<=N;i++) {
			//i의 배수를 지워야하기 때문에 증감식은 j+=i
			for(int j=i;j<=N;j+=i) {
				//이미 지운 배수일시 continue
				if(check[j]) continue;
				
				cnt++;
				check[j] = true;
				
				if(cnt == K) {
					System.out.println(j);
					break;
				}
			}
		}
	}
}
