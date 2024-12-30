class Solution {
  boolean solution(String s) {
    s = s.toLowerCase(); // 모두 소문자로 변환
    int ps = s.length() - s.replace("p", "").length();
    int ys = s.length() - s.replace("y", "").length();

    boolean answer = ps == ys;
    return answer;
  }
}