# 언어 : Java , (성공/실패) : 1/0, 메모리 : 55752 KB , 시간 : 1204 ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i][0] = Integer.parseInt(st.nextToken());
        	arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>(){
        	public int compare(int[] a, int[] b) {
        		if(a[0] == b[0]) {//[0]인 x좌표끼리 같을시 y좌표를 기준으로 정렬
        			return Integer.compare(a[1], b[1]);
        		}
        		else {
        			return Integer.compare(a[0], b[0]);
        		}
        	}
        });
        
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        
    }
}
