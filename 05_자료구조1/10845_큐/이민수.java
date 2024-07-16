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
            			System.out.println(-1);
            		}else
            			System.out.println(q.poll());
            		break;
            	case "size":
            		System.out.println(q.size());
            		break;
            	case "empty":
            		if(q.isEmpty()) {
            			System.out.println(1);
            		}else
            			System.out.println(0);
            		break;
            	case "front":
            		if(q.isEmpty()) {
            			System.out.println(-1);
            		}else
            			System.out.println(q.peek());
            		break;
            	case "back":
            		if(q.isEmpty()) {
            			System.out.println(-1);
            		}else
            			System.out.println(last);          	
            }
		    }
        
    }
}

// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 19120 KB , 시간 : 296 ms
