package step20.ex03;

public class Outer5 { // anonymous inner class선언
  int no;

  //anonymous inner class - member
  // new [슈퍼클래스|인터페이스] (슈퍼클래스생성자파라미터) {선언};
  Object obj1 = new Object(){}; // Object의 하위 클래스
  Object obj2 = new Object(){};
  Object obj3 = new Object(){};
  Object obj4 = new Object(){};
  void m() {
    System.out.println(obj1);
  }
}
/*
#중첩 클래스와 .class파일
- 자바 컴파일러는 클래스 선언 당 한 개의 .class(bytecode)파일을 생성한다.
- 중첩 클래스의 경우 "바깥클래스명$중첩클래스명.class" 형식으로
  클래스 파일을 만든다.
- 익명 중첩 클래스는 "바깥클래스명$1.class" 처럼 $ 다음에 선언된 순서대로 번호가 붙는다.
*/
