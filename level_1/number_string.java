public class number_string {
  private static final String[] words = {
      "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
  };

  public int solution(String s) {

    for (int i = 0; i < words.length; i++) {
      s = s.replace(words[i], Integer.toString(i));
    }
    int answer = Integer.parseInt(s);
    return answer;
  }
}
