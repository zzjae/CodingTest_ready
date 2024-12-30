public class string_manage {
  public boolean solution(String s) {
    // boolean answer = s.matches("[0-9]{4}|[0-9]{6}");
    // return answer;

    if (s.length() != 4 && s.length() != 6)
      return false;
    for (char c : s.toCharArray()) {
      if (!Character.isDigit(c))
        return false;
    }
    return true;
  }
}
