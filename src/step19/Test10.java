package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test10 { // RuntimeException의 이해 1.상위 호출자에게 자동전달
  static void m1() {
    m2();
  }

  static void m2() {
    m3();
  }

  static void m3() {
    throw new RuntimeException();
  }
  public static void main(String[] args) {
    try {
      m1();
    } catch (RuntimeException e) {
      System.out.println("예외 처리");
    }
  }
}
/*

*/
