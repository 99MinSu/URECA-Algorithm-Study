# 언어 : Java , (성공/실패) : 1/1, 메모리 : 308392 KB , 시간 : 1248 ms
// StringBuilder를 사용안하고 System.out.print 사용 시 출력 할 떄마다 시스템 콜이 발생
// N과 M의 입력 값이 클수있기때문에 시간초과

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] A = new int[N];
        int[] B = new int[M];
        int[] merge = new int[N+M];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < A.length && j < B.length) {
        	//A와 B의 값 비교, 작은값 merge배열에 추가 후 추가한 배열의 인덱스 증가
        	if(A[i] < B[j]) {
        		merge[k] = A[i];
        		i++;
        	}
        	else {
        		merge[k] = B[j];
        		j++;
        	}
        	k++;
        }
        //추가하지못한 나머지 요소들 merge 배열에 할당
        while(i < A.length) {
        	merge[k] = A[i];
        	i++;
        	k++;
        }
        
        while(j < B.length) {
        	merge[k] = B[j];
        	j++;
        	k++;
        }
        StringBuilder sb = new StringBuilder();
        for (int a = 0; a < merge.length; a++) {
            sb.append(merge[a]).append(" ");
        }
        
        System.out.println(sb);
    }
}
