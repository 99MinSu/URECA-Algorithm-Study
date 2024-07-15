# 언어 : Java , (성공/실패) : 1/3, 메모리 : 409520 KB , 시간 : 1400 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int last = 0;
        
        for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				q.offer(Integer.parseInt(s[1]));
				last = Integer.parseInt(s[1]);
				break;
				
			case "pop":
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.poll()).append("\n");
				break;
				
			case "size":
				sb.append(q.size()).append("\n");
				break;
				
			case "empty":
				if(q.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
				
			case "front":
				if(q.isEmpty()) sb.append(-1).append("\n");
				else sb.append(q.peek()).append("\n");
				break;
				
			case "back":
				if(!q.isEmpty()) {
					sb.append(last).append("\n");
				}
				else {
					sb.append(-1).append("\n");
				}
			}
			
		}
        System.out.println(sb);
    }
}
