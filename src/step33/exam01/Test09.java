//주제 객체 생성 정책(scope) 
package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test09 {

  public static void main(String[] args) {
    // 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam01/Application-context09.xml");
    //2) scope 속성이 singleton 일때,
    // =>객체가 한 개만 생성된다.
    Car p1 = (Car) context.getBean("c2");
    Car p2 = (Car) context.getBean("c2");
    Car p3 = (Car) context.getBean("c2");
    if (p1 == p2) {
      System.out.println("p1 == p2");
    }
    if (p2 == p3) {
      System.out.println("p2 == p3");
    }
  }
}