import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
 
public class Main {
	static int cnt, sum, first;
	static Queue<Integer> q = new ArrayDeque<>(); 
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        for (int i = M; i <= N; i++) {
        	cnt = 0;
			for (int j = 1; j <= i; j++) {
				if( i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				q.add(i);
			}
		}
        
        if(q.isEmpty()) {
        	System.out.println(-1);
        }else {
        	first = q.poll();
            while(! q.isEmpty()) {
            	sum += q.poll();
            }
            System.out.println(sum + first);
            System.out.println(first);
        }
    }
}
  // 언어 : JAVA , (성공/실패) : 1/4 , 메모리 : 14440 KB , 시간 : 340 ms
