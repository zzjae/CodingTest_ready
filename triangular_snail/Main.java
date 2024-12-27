class Solution {
  public int[] solution(int n) {

    // 입력으로 n을 받음 삼각형을 표현할 배열
    int[][] triangle = new int[n][n];
    // 채워넣을 숫자
    int number = 1;

    // 숫자를 채울 위치
    int x = 0;
    int y = 0;

    while (true) {
      // 아래로 이동
      while (true) {
        triangle[y][x] = number++; // 숫자를 채워넣음
        if (y + 1 == n || triangle[y + 1][x] != 0)
          break; // y+1 = n이면 밑이 더 없음 or 밑에 숫자가 넣어져 있다면
        y += 1;
      }
      // 아래로 이동이 끝나고 오른쪽으로 가는경우
      if (x + 1 == n || triangle[y][x + 1] != 0)
        break;
      x += 1;

      // 우측으로 이동
      while (true) {
        triangle[y][x] = number++;
        if (x + 1 == n || triangle[y][x + 1] != 0)
          break; // x+1 = n이면 오른쪽이 더 없음 or 오른쪽에 숫자가 넣어져 있다면
        x += 1;
      }
      // 우측으로 이동이 끝나고 왼쪽 위로 가는 경우
      if (triangle[y - 1][x - 1] != 0)
        break;
      y -= 1;
      x -= 1;

      // 왼쪽위로 이동
      while (true) {
        triangle[y][x] = number++;
        if (triangle[y - 1][x - 1] != 0)
          break;
        y -= 1;
        x -= 1;
      }
      // 왼쪽 위로 이동이 끝나고 나래로 가는 경우
      if (y + 1 == n || triangle[y + 1][x] != 0)
        break;
      y += 1;

    }

    int[] answer = new int[number - 1];

    int index = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        answer[index++] = triangle[i][j];
      }
    }
    return answer;
  }
}
