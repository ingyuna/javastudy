package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		
		// 배열은 reference type입니다.
		
		int[] arr = new int[3];
		
		System.out.println(arr);  // new int[3]을 통해서 생성된 
									//배열요소들의 주소가 저장되어 있다.
		
		// 배열의 길이를 조정하는 (일반적으로 늘이는 작업 코드입니다.
		
		int[] a = { 1, 2, 3 }; // 배열 a의 길이는 3입니다.
		int[] b = new int[10]; // 배열 b의 길이는 10입니다.
		
		// b[0] = a[0], b[1] = a[1],b[2] = a[2]
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			// -> 현재 상태 
			// a에는 {1, 2, 3}이 저장된 주소가 있습니다.
			// b에는 {1, 2, 3, 0, 0, 0, 0, 0, 0, 0}이 저장된 주소가 있습니다. 
		
		}
			a = b; // a에는 {1, 2, 3, 0, 0, 0, 0, 0, 0, 0}이 저장된 주소가 있습니다. 
			       // b가 a로 덮어지는거니까.
		
			// 배열 a의 길이가 증가했습니다. (원래 1, 2, 3이 있었으니까 얘는 그대로 있고 뒤에 7개가 더 붙은거니까)
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	
	}



