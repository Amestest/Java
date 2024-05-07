package ncs.test1;

public class ArrayTest {
	public static void main(String[] args) {
		int [][] array = {
						  {12, 41, 36, 56, 21}, 
						  {82, 10, 12, 61, 45}, 
						  {14, 16, 18, 78, 65}, 		
						  {45, 26, 72, 23, 34}};
		//2차원 배열에 들어 있는 데이터들의 합계와 평균
		double 합 = 0;
		int count = 0;
	
		//for -each 이중으로 작성해서 계싼
		
		for(int[] row : array) {
			System.out.println("시작");
			for(int num : row) {
				합 += num;
				count++; //숫자를 세는 이유는 나중에 숫자 평균
			}
			//평균 계싼
			double 평균 = 합 / count;
			
			System.out.println("합계 : " + 합);
			System.out.println("평균 : " + 평균);
		}
	}
}
