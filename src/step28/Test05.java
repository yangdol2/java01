//주제 : 예외 처리와 연결 해제4 - 프로그램에서 예외처리하기
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test05 {
  public static void main(String[] args) throws Exception {    
    DriverManager.registerDriver(new Driver());
    try (
        Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111") /*DBMS 사용자 암호*/
        ) {
 
      
      System.out.println("연결 성공");
      System.out.printf("5 / 0 = %d ", (5 / 0));
      System.out.println("맑은 날씨 입니다."); // <-- 실행 안됨
    } catch (Exception e) {
      System.out.println("잠시 DBMS와 연결이 원활하지 않습니다.\n잠시후 다시 시도해 주세요");
    }
  }
}
/*
 *  
 */
