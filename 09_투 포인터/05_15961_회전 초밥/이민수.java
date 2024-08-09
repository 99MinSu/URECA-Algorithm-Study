import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] check = new int[d+1];

        for(int i=0;i<N;i++) {
        	A[i]=Integer.parseInt(br.readLine());
        }

        int res=1;
        check[c]++;
        for(int i=0;i<k;i++) {
            if(check[A[i]]==0) res++;
            check[A[i]]++;
        }

        int cnt=res;
        for(int i=1;i<N;i++) {
            int pop = A[i-1]; // 처음 먹은 초밥
            check[pop]--; // 먹은 초밥 제거
            if(check[pop]==0) cnt--; // 먹었더니 0개이면 마이너스

            int add = A[(i+k-1)%N]; // 마지막 초밥 + 1 번째 초밥
            if(check[add]==0) cnt++; // 처음 먹는 초밥이면 플러스
            check[add]++;

            res = Math.max(res,cnt);
        }

        System.out.println(res);
    }

}
// 언어 : JAVA , (성공/실패) : 1/1 , 메모리 : 	170884 KB , 시간 : 484 ms
