//주제 : 데이터 삭제하기- delete문 보내기
package step29.exam03;

public class MemberDelete {
  public static void main(String[] args) throws Exception {      
    try {
      MemberDao memberDao = new MemberDao();            
      
      int count = memberDao.delete(5);
      
      System.out.printf("삭제 개수 : %d" , count);      
      
    } catch (Exception e) {
      System.out.println("데이터 삭제 실패");
    }
  }
}
/*
 *  
 */
