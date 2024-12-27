class Solution {
  public int[] solution(long n) {

    // 입력받은 long을 string으로 변환
    String str = Long.toString(n);

    // StringBuilder로 문자열을 뒤집음
    String reverse = new StringBuilder(str).reverse().toString();

    // 뒤집힌 문자열을 char 형태의 배열로 변환
    char[] arr = reverse.toCharArray();

    // char배열을 int형태의 배열로 변환
    int[] answer = new int[arr.length];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = arr[i] - '0';
    }
    return answer;
  }
}