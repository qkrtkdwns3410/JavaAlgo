package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * packageName    : programmers.lv2
 * fileName       : Target_number
 * author         : ipeac
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        ipeac       최초 생성
 */

public class Target_number {

      public static void main(String[] args) {
            Solution solution = new Solution();
            solution.solution(12345);
      }

      static class Solution {
      
            public List<Integer> solution(long n) {
                  System.out.println("n = " + n);
                  
                  String result = String.valueOf(n);
                  String[] result_arr = result.split("");
                  
                  List<String> result_list;
                  result_list = Arrays.asList(result_arr);
                  System.out.println("result_list = " + result_list);
                  Collections.reverse(result_list);
      
                  List<Integer> result_int_list = new ArrayList<>();
                  for (String value : result_list) {
                        result_int_list.add(Integer.valueOf(value));
                  }
                  
                  return  result_int_list;
            }

      }

}

