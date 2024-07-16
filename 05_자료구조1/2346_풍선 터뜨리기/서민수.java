# 언어 : Java , (성공/실패) : 1/0, 메모리 : 16620 KB , 시간 : 164 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<int[]> dq = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		int in = arr[0];
		
		for(int i=1; i<N; i++){
			dq.add(new int[] {(i+1), arr[i]});
		}
		
		while(!dq.isEmpty()) {
			// 양수인 경우 
			if(in >0) {
				// 순서 뒤로 돌리기 
				for(int i=1; i<in; i++) {
					dq.add(dq.poll());
				}
				
				int[] nxt = dq.poll();
				in = nxt[1];
				sb.append(nxt[0]+" ");
			}
			// 음수인 경우 
			else {
				for(int i=1; i<-in; i++	) {
					dq.addFirst(dq.pollLast());
				}
				
				int[] nxt = dq.pollLast();
				in = nxt[1];
				sb.append(nxt[0]+" ");
			}
		}
				
		System.out.println(sb.toString());
	}
}
