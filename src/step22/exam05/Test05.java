// 주제 : 대용량 데이터 읽기 - Buffered 데코레이터 사용 후
package step22.exam05;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
public class Test05 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileInputStream in0 = new FileInputStream("test.pdf");
    BufferedInputStream in = new BufferedInputStream(in0);

    long start = System.currentTimeMillis();

    int b = 0;
    int count = 0;
    while ((b = in.read()) != -1) {
      in.read();
      if ((count % 100000) == 0) {
        System.out.print("-");
      }
      count++; 
    }
    System.out.println();
    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);


    in.close();
    in0.close();

  }

}

/*

*/
