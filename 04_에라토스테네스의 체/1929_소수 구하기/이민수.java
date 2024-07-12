import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	  static int M,N;
	  static boolean[] check; 
	  public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      N = Integer.parseInt(st.nextToken());
	      M = Integer.parseInt(st.nextToken());
	      check = new boolean[M+1];
	    
	      PrimeNum(N,M);
	    
	      for (int i = N; i <= M; i++) {
			  if(check[i] == false)
				    System.out.println(i);
		    }
	  }
	
	  static void PrimeNum(int N, int M) {
	      check[1] = true;
	    
	      for(int i = 2; i<=M; i++) {
	    	    if(check[i]) continue;
	    	    for(int j = i+i; j<=M; j += i) {
	        	    check[j] = true;
	    	    }
	      }
	  }
}

// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 295688 KB , 시간 : 624 ms
