# 언어 : Java , (성공/실패) : 1/0, 메모리 : 28524 KB , 시간 : 4604	 ms
  import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=M;i<=N;i++) {//M부터 N까지
			int chk = 0;
			if(i < 2) continue;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) chk++;
			}
			if(chk == 0) System.out.println(i);
		}
	}
}
