# 언어 : Java , (성공/실패) : 1/0, 메모리 : 294852 KB , 시간 : 724 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		List<Integer> ans = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=N;i++) {
			q.add(i);
		}
		
		int cnt = 0;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            cnt++;
            
            if(cnt == K) {
                ans.add(tmp);
                cnt = 0;
            } else {
                q.add(tmp);
            }
        }
		sb.append("<");
		for(int i=0;i<ans.size();i++) {
			sb.append(ans.get(i)).append(", ");
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		System.out.println(sb);
	}
}
