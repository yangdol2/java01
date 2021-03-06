/* 주제 : 다차원 배열*/
package step02;

public class Exam08 {
    public static void main(String[] args){
      int[][] scores = {
        {100, 90, 90, 100 , 70},
        {90, 90, 90, 60},
        {80, 100},
        {80, 80, 70}
      };

      System.out.printf("%d %d %d\n", scores[0][0], scores[0][1], scores[0][2]);

  }
}

/* 배열 사용
- 배열에서 특정 항목의 변수를 사용하기
- 배열[인덱스] = 값;
  예) int[] a = new int[5];
      a[0] = 10;
      a[1] = 20;
      a[4] = 30;
      a[5] = 40; 인덱스 오류
- 인덱스는 배열의 항목을 가리키는 번호이다.
  0부터 시작한다.
*/
