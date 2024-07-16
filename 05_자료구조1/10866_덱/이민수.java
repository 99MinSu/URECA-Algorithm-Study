import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Deque<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String s = st.nextToken();
            switch(s){
            	case "push_front": 
            		q.offerFirst(Integer.parseInt(st.nextToken()));
            		break;
            	case "push_back": 
            		q.offerLast(Integer.parseInt(st.nextToken())); 
            		break;
            	case "pop_front":
            		if(q.isEmpty()) {
            			sb.append(-1 + "\n");
            		}else
            			sb.append(q.pollFirst()+"\n");
            		break;
               	case "pop_back":
            		if(q.isEmpty()) {
            			sb.append(-1 + "\n");
            		}else
            			sb.append(q.pollLast()+"\n");
            		break;
            	case "size":
            		sb.append(q.size()+"\n");
            		break;
            	case "empty":
            		if(q.isEmpty()) {
            			sb.append(1+"\n");
            		}else
            			sb.append(0+"\n");
            		break;
            	case "front":
            		if(q.isEmpty()) {
            			sb.append(-1+"\n");
            		}else
            			sb.append(q.peekFirst()+"\n");
            		break;
            	case "back":
            		if(q.isEmpty()) {
            			sb.append(-1+"\n");
            		}else
            			sb.append(q.peekLast()+"\n");          	
            }
		    }
        System.out.println(sb);
    }
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 20152 KB , 시간 : 204 ms
