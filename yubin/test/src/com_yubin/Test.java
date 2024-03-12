package com_yubin;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[4];
		int arr2[] =new int[4];
		arr[0] = 10;
		arr[1]=  20;
		arr[2]=  30;
		arr[3] = 40;
//		arr[4] = 50;
		
		// 누적변수 : 반드시 초기값 설정
		int sum = 0;				// 0
		sum = sum +arr[0];	// 10 = 0 + 10
		sum = sum +arr[1];	// 30 = 10 + 20
		sum = sum +arr[2];	// 60 = 30 + 30
		sum = sum +arr[3];	// 100 = 60 + 40
		
		System.out.println(sum);
		
		if(10 < 20 || arr[1] == arr[2]) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		// sum 변수에 arr배열의 모든 값을 누적
//		for(int i=0; i<arr.length; i++) {
//			sum = sum +arr[i];
//			System.out.println(sum);
//		
		
		for(int n : arr) {
			sum = sum +n;
			System.out.println(sum);
		}
		
		System.out.println("최종 합계 = " + sum);
		System.out.println("");
		
		// arr배열의 값 중, 40인 index번호 출력
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==40) {
				System.out.println("배열 값이 40인 index: " + i);
			}
			
	}
		
		
		// 비교(if)
		// 비교연산자: >, <, >=, <=, ==, !=
		// 비교연산자의 결과를 판단 => 논리연산자: &&, ||, !
		// 그리고, ~이고 &&(AND) tree && true ==> true
		// 또는, || (OR) false || false ==> false
		// true <=> false => !
		/*
		//  if(비교값 비교연산자 비교값){	
		 * 		비교연산의 결과가 true일 경우 실행 내용
		 }else{
		 		비교연산의 결과가 false일 경우 실행 내용
		 		}
		 */
/*
 * 연령이 34세 이상이면 월지원금 100만원..
 * age 34 >=  if print
 */
		int age = 40;
		String money ="100만원";
		if(age >=34) {
			System.out.println("월 지원금은 " + money);	
		}
		/*
		 * 월 소득이 300만원 이하이고, 가구인원이 2인 이상이면 세금공제
		 * pay 300<= && num >=2    "세금공제"
		 */
		int pay = 200;
		int num = 4;
		if(pay <=300 && num>=2) {
			System.out.println("세금공제 대상입니다.");
		}else {
			System.out.println("세금공제 대상이 아닙니다.");
		}
		
		String str;
		String str2="강";
		str="강강";
		
		System.out.println(arr.length);
		System.out.println();

	}

}