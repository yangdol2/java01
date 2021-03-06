// 주제 : SQL맵퍼인 Mybatis적용하기 - memberDao에 적용 - insert
package step33.exam11;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberUpdate {
  public static void main(String[] args) throws Exception{    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam11/Application-context.xml");
    MemberDao memberDao = (MemberDao)context.getBean("memberDao");
    
    Member member = new Member();
    member.setName("커피우유");
    member.setEmail("coffieMilk@test.com");    
    member.setTel("1588-1539");
    member.setNo(2);
    memberDao.update(member);
    System.out.println("변경 성공");
    
    List<Member> list = memberDao.selectList();       
    for (Member m : list) {
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.getNo(), m.getName(), m.getEmail(), m.getPassword(), m.getTel());
    }    
  }
}
/* 
 * 
 */