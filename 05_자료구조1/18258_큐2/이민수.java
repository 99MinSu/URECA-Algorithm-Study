import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Queue<Integer> q = new ArrayDeque<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int last = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String s = st.nextToken();
            switch(s){
            	case "push": 
            		last = Integer.parseInt(st.nextToken()); 
            		q.offer(last);
            		break;
            	case "pop":
            		if(q.isEmpty()) {
            			sb.append(-1 + "\n");
            		}else
            			sb.append(q.poll()+"\n");
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
            			sb.append(q.peek()+"\n");
            		break;
            	case "back":
            		if(q.isEmpty()) {
            			sb.append(-1+"\n");
            		}else
            			sb.append(last+"\n");          	
            }
		    }
        System.out.println(sb);
    }
}
 // 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 339264 KB , 시간 : 1404 ms
