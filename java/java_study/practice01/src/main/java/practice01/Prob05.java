package practice01;

public class Prob05 {

	public static void main(String[] args) {
		
		/* 코드를 작성합니다 */
		// 369 반복문 테스트
		for(int i = 1; i < 100; i++) {
			
			// 문자열로 형변환
			String strCnt = String.valueOf(i); //String 으로 자료형 변환
			// 형변환된 값의 길이 만큼 반복
			for(int j = 0; j < strCnt.length(); j++) {
				char chk = strCnt.charAt(j);
				if(chk == '3' || chk == '6' | chk =='9') {
					System.out.println(i + " 짝");
				}
			}
		}
	
	}
}
