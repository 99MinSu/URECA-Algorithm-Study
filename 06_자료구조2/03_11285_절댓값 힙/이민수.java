import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			if(Math.abs(o1) == Math.abs(o2)) {
				return o1 - o2;
			}else
				return Math.abs(o1) - Math.abs(o2);
		});
		// compare 버전 연습
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1,o2) : Integer.compare(Math.abs(o1),Math.abs(o2));
//            }
//        });
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
        	int n = Integer.parseInt(br.readLine());
			if( n != 0) {
				pq.add(n);
			}else {
				if(!pq.isEmpty()) {
					System.out.println(pq.poll());
				}else
					System.out.println(0);
			}
		}
        
	}
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 	26884 KB , 시간 : 652 ms
