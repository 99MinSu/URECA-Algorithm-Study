import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String s = st.nextToken();
        	if(s.equals("push")) {
        		stack.push(Integer.parseInt(st.nextToken()));
        		
        	}else if(s.equals("top")) {
        		if(stack.isEmpty()) {
        			System.out.println(-1);
        		}else {
        			System.out.println(stack.peek());
        		}
        		
        	}else if(s.equals("size")) {
        		System.out.println(stack.size());
        		
        	}else if(s.equals("empty")) {
        		if(stack.isEmpty()) {
        			System.out.println(1);
        		}else
        			System.out.println(0);
        		
        	}else if(s.equals("pop")) {
        		if(stack.isEmpty()) {
        			System.out.println(-1);
        		}else
        			System.out.println(stack.pop());
        	}
		    }       
    }
}
 // 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 19604 KB , 시간 : 276 ms
