package baekjoon.silver;

import java.util.Scanner;


/**
 * packageName    : baekjoon.silver
 * fileName       : Dfs_Lecture
 * author         : ipeac
 * date           : 2022-05-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-30        ipeac       최초 생성
 */

public class Dfs_Lecture {

      static final int MAX_N = 10;
      static int[][] D = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
      static int N;
      static int[][] Board = new int[MAX_N][MAX_N];

      static class Point {

            Point(int r, int c) {
                  row = r;
                  col = c;
            }

            int row, col;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                  
            }
      }

}
