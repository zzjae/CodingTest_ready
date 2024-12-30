import java.util.ArrayList;
import java.util.List;

class Solution {
  // 압축 후 압축된 문자열의 길이를 반환하는 함수
  private int compress(String source, int length) { // length는 몇개 단위로 자를 것인가임
    StringBuilder builder = new StringBuilder();

    String last = "";
    int count = 0;

    for (String token : split(source, length)) {
      if (token.equals(last)) {
        count++;
      } else {
        if (count > 1)
          builder.append(count);
        builder.append(last);
        last = token;
        count = 1;
      }

    }

    if (count > 1)
      builder.append(count);
    builder.append(last);

    return builder.length();
  }

  // 문자열을 분리하는 함수
  private List<String> split(String source, int length) {
    List<String> tokens = new ArrayList<>();

    for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
      int endIndex = startIndex + length;
      if (endIndex > source.length()) // 만약 원본 문자열 보다 endIndex가 크다면 원본 문자열의 마지막 까지로
        endIndex = source.length();

      tokens.add(source.substring(startIndex, endIndex)); // substring은 start부터 end까지 잘라서 반환

    }

    return tokens;
  }

  public int solution(String s) {
    int min = Integer.MAX_VALUE; // 최소값 초기화

    for (int length = 1; length <= s.length(); length++) {
      int compressed = compress(s, length);
      if (compressed < min) {
        min = compressed;
      }
    }
    return min;
  }
}