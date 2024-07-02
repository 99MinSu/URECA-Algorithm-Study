import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n; // 입력 변수 n
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine()); // 입력 n 받기
		int[] arr = new int[n]; // 입력 받은 수 넣을 배열 생성
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // 배열에 입력 받은 수 넣기
		}
		
		quickSort(arr, 0, arr.length-1); // 퀵 정렬
		
		for (int i : arr) { // 정렬 된 수 출력
			System.out.println(i);
		}
		
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) return; 
		
		int pivot = start; // 기준
		int left = start +1; // 기준 앞
		int right = end; // 맨 끝
		
		while(left<=right) {
			// 기준보다 큰 값을 찾기위해 반복
			while(left<=end && arr[pivot] >= arr[left])
				left++;
			// 기준보다 작은 값을 찾기위해 반복
			while(right>start && arr[pivot] <= arr[right])
				right--;
			
			if(left<=right) { // 엇갈리지 않았다면 작은 데이터와 큰 데이터 교체
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}else { // 엇갈다면 작은 데이터와 피벗 교체
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			}
		}
		
		//분할 이후 왼쪽 오른쪽 분할
		quickSort(arr, start, right -1);
		quickSort(arr, right +1, end);
		
	}
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 18984 KB , 시간 : 168 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int n; // 입력 변수 n
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine()); // 입력 n 받기
		int[] arr = new int[n]; // 입력 받은 수 넣을 배열 생성
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine()); // 배열에 입력 받은 수 넣기
		}
		
		Arrays.sort(arr);
		
		for (int i : arr) { // 정렬 된 수 출력
			System.out.println(i);
		}		
	}	
}
// 언어 : JAVA , (성공/실패) : 1/0 , 메모리 : 14872 KB , 시간 : 144 ms
// 퀵 정렬보다 Arrays.sort 쓰는 게 더 빨랐다....
