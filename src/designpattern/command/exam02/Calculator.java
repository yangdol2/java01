package designpattern.command.exam02;

public class Calculator {
  public void plus(int a, int b) {
    System.out.printf("%d + %d = %d\n", a, b, a + b);
  }
  public void minus(int a, int b) {
    System.out.printf("%d - %d = %d\n", a, b, a - b);
  }
  //필요한 기능을 기존 소스 코드에 추가한다.
  public void multiple(int a, int b) {
    System.out.printf("%d * %d = %d\n", a, b, a * b);
  }
  

}
