import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    static int N;
    static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 입력 받을 배열 선언
        sorted = new int[N];  // 정렬 한 수 넣을 배열 선언
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
 
        mergeSort(arr, 0, N - 1);

        StringBuilder sb = new StringBuilder();
        
        for (int i : arr) {
        	sb.append(i).append("\n");
		}
		System.out.println(sb);
    }
 
    static void mergeSort(int arr[], int left, int right) {
        // 리스트가 1일 떄까지 계속 나누기
    	if(left < right) {
        	int middle = (left + right) / 2; // 반으로 나누기
        	
            mergeSort(arr, left, middle); // 왼쪽 부분 리스트 (middle) -> 왼쪽 부분 끝점
            mergeSort(arr, middle + 1, right); // 오른쪽 부분리스트 (middle + 1) -> 오른쪽 리스트 시작점
                
            merge(arr, left, middle, right); // 병합
    	}
       
    }
 
    static void merge(int arr[], int left, int middle, int right) {
        int i = left; // 왼쪽 부분 리스트 시작점
        int j = middle + 1; // 오른쪽 부분 리스트의 시작점
        int k = left; // 채워넣을 배열의 인덱스

        // 작은 순서대로 배열에 삽입
        while(i <= middle && j <= right) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[i];
                i++;
            }
            else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // 오른쪽에 데이터가 남아 있을 경우
        if (i > middle) {
            for (int z = j; z <= right; z++) {
                sorted[k] = arr[z];
                k++;
            }
        }
        else { // 왼쪽에 데이터가 남아있을경우
            for (int z = i; z <= middle; z++) {
                sorted[k] = arr[z];
                k++;
            }
        }
        
        // 정렬된 배열을 삽입
        for (int z = left; z <= right; z++) {
            arr[z] = sorted[z];
        }
    }
}
// 언어 : JAVA , (성공/실패) : 1/6 , 메모리 : 102680 KB , 시간 : 856 ms
// 이 문제는 Arrays.sort는 무조건 시간초과가 난다.
// 시간 초과가 자꾸 나서 StringBuilder도 써보고 했지만 계속 났다
// sorted 배열 선언을 merge 함수 안에 해줬는데 main 함수로 빼주니 성공했다!! (무슨 차이가 있는거지..)
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
// 언어 : JAVA , (성공/실패) : 1/6 , 메모리 : 131064 KB , 시간 : 1336 ms
// 다른 풀이를 찾아보다가 리스트의 Collections.sort(Timsort라고 하고 병합정렬과 삽입정령 알고리즘을 사용한다고 한다)를 써도 된다 길래 써봤더니 통과했다. 
// 병합정렬로 푸는 게 더 빠르긴 하다. (함수 쓰는 게 훨씬 편하긴하다..)
