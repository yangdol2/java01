/* 주제 : 전위 증감 연산자*/
package step04;

public class Exam09 {
    public static void main(String[] args){
      int i = 10;
      //i = i + 1;
      //i += 1;
      ++i; // prefix 증가 연산자
      ++i;
      ++i;

      int j = 10;
      // j = j - 1;
      // j -= j;
      --j; // prefix 감소 연산자
      --j;
      --j;
      System.out.printf("%d, %d\n", i, j);

      i = 10;
      j = 10;
      System.out.printf("%d, %d\n", ++i, --j);


      // += , -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=

      i ^= 0x45; // i = i ^ 0x45;
  }
}

/*

*/