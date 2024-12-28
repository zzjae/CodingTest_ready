class Solution {

  private char push(char c, int n) {
    // 알파벳이 아니라면(공백)
    if (!Character.isAlphabetic(c))
      return c;

    // 기준잡기(소문자인지 대문자인지 확인)
    int offset = Character.isUpperCase(c) ? 'A' : 'a';

    // 해당 문자가 몇번째 알파벳인지 계산
    int position = c - offset;

    // 만약 position+n의 값이 z를 넘어 갔다면 a부터 다시 계산해야됨
    position = (position + n) % ('Z' - 'A' + 1);

    // 기준+위치
    return (char) (offset + position);
  }assa

  public String solution(String s, int n) {
    StringBuilder builder = new StringBuilder();
    for (char c : s.toCharArray()) {
      builder.append(push(c, n));
    }
    return builder.toString();
  }
}