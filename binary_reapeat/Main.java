class Solution {
  private int countZeros(String s) {
    int zeros = 0;
    for (char c : s.toCharArray()) {
      if (c == '0')
        zeros++;
    }

    return zeros;
  }

  public int[] solution(String s) {
    int loop = 0; // 진법 변환 횟수
    int removed = 0; // 제거된 0의 수

    while (!s.equals("1")) {
      int zeros = countZeros(s);
      loop += 1;
      removed += zeros;

      int ones = s.length() - zeros; // 0을 없앤 후 1의 갯수
      s = Integer.toString(ones, 2);

    }

    int[] answer = new int[] { loop, removed };
    return answer;
  }
}