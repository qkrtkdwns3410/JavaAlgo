package baekjoon.silver;

/**
 * packageName    : 백준
 * fileName       : 병든_나이트_1783_S4
 * author         : ipeac
 * date           : 2022-03-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-26        ipeac       최초 생성
 */

public class ill_night_1783_S4 {

      public static void main(String[] args) {
            solution(100, 50);
            solution(1, 1);
            solution(17, 5);
            solution(20, 4);
      }

      static int right_init = 1;
      static int left_init = 1;

      public static void solution(int n, int m) {
            System.out.println("======================================================");
            System.out.println("n = " + n);
            System.out.println("m = " + m);

            boolean ss = true;
            int cnt = 0;

            while (ss) {
                  if (right_init >= m) {
                        
                        break;
                  }
            }
      }

      public void checkIt(boolean ss, int n, int m, int cnt) {
            if (right_init >= m) {
                  ss = false;
                  return;
            }
      }

}













