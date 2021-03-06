//주제 : Builder 패턴 적용 전
package designpattern.builder.exam01;

import java.util.HashMap;

public class Test01 {

  public static void main(String[] args) {
    //1) 자동차 정보를 준비
    HashMap<String, Car> carMap = new HashMap<>();
    Car c = new Car();
    c.model = "tico";
    c.cc = 800;
    carMap.put("tico", c);
    
    c = new Car();
    c.model = "sonata";
    c.cc = 1997;
    carMap.put("sonata", c);
    
    //2) 자동차 정보를 바탕으로 자동차 공장을 준비
    CarFactory factory = new CarFactory();
    factory.setCarMap(carMap);
    // 티코 객체 생성
    Car c1 = factory.createCar("tico");
    
    // 소나타 객체 생성
    Car c2 = factory.createCar("sonata");
    
    
    System.out.println(c1);
    System.out.println(c2);
  }

}

/* # 팩토리 메서드 설계 패턴
 * - 객체 생성 과정이 복잡한 경우, 매번 직접 객체를 생성하기 보다는
 *  메서드를 통해 객체를 얻는 것이 유지보수에 좋다.
 * - 메서드를 통해 객체를 생성하는 설계방식을 "Factory Method"패턴이라 부른다.
 * 
 * */
