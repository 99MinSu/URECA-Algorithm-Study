import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] array = new int[n];//원본 배열
		int[] arraySort = new int[n];//정렬된 배열
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();//압축할 map

		//배열 입력
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++){
			array[i] = arraySort[i] = Integer.parseInt(st.nextToken());
		}

		//배열 정렬
		Arrays.sort(arraySort);


		//배열의 압축 값을 map 에 저장 (순서 매기기)
		int rank = 0;

		for(int value : arraySort){
			if(!rankMap.containsKey(value)){
				rankMap.put(value,rank);
				rank++;
			}
		}

		//원본 배열의 순서대로 해당 압축 배열을 출력 (key 에 있는 value 값 반환)
		StringBuilder sb = new StringBuilder();
		for(int key : array){
			sb.append(rankMap.get(key)).append(" ");
		}

		System.out.println(sb);
	}
}

// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 265076 KB , 시간 : 1940 ms
