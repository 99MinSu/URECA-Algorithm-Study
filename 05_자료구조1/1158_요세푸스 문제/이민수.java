import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        Queue<Integer> qu = new LinkedList<>(); // 큐 생성

        for (int i = 1; i <= n; i++) { // 큐에 1부터 n 까지 순서대로 넣어주기
        	qu.offer(i); 
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("<");
        
        while (qu.size() != 1) {
        	for (int i = 0; i < k - 1; i++) { // k 번 전까지 빼서 다시 널어주고
        		qu.offer(qu.poll());
        		}
        
        		sb.append(qu.poll()).append(", "); // k 번 째 수 더해주고 ,까지 더하기
        }
        // 하나 남은 값 빼와서 합치기        
        sb.append(qu.poll()).append(">");
        System.out.println(sb);
    }      
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 294812 KB , 시간 : 588 ms
