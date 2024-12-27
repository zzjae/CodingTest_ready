class Solution {
  // 멘헤튼 거리를 살쳐봐야할 위치
  private static final int dx[] = { 0, -1, 1, 0 }; // 상,좌,우,하
  private static final int dy[] = { -1, 0, 0, 1 }; // 상,좌,우,하

  private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
    for (int d = 0; d < 4; d++) {
      // 만약 검사를 안해도 된다면 pass
      if (d == exclude)
        continue;

      int nx = x + dx[d];
      int ny = y + dy[d];

      if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
        continue;
      // room[ny][nx]를 통해 사람에게 도달할 수 있는지 검사
      if (room[ny][nx] == 'P')
        return true;
    }

    return false;
  }

  // room안에서 사람들의 거리두기가 됐는지 확인
  private boolean isDistanced(char[][] room, int x, int y) {
    for (int d = 0; d < 4; d++) {

      int nx = x + dx[d];
      int ny = y + dy[d];

      if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length)
        continue;

      switch (room[ny][nx]) {
        case 'P':
          return false;
        case 'O':
          if (isNextToVolunteer(room, nx, ny, 3 - d))
            return false;
          break;
      }
    }
    return true;
  }

  // room하나의 거리두기가 됐는지 확인
  private boolean isDistanced(char[][] room) {
    for (int y = 0; y < room.length; y++) {
      for (int x = 0; x < room[y].length; x++) {
        if (room[y][x] != 'P')
          continue;

        // 에러 고침
        if (!isDistanced(room, x, y))
          return false;
      }
    }
    return true;
  }

  public int[] solution(String[][] places) {

    int[] answer = new int[places.length];
    for (int i = 0; i < answer.length; i++) {
      String[] place = places[i]; // place는 places의 한줄을 의미 ex) place = ["POOOP"]
      char[][] room = new char[place.length][]; // room은 place의 한줄의 문자열을 단어로 나눈것을 의미 ex) room = ["p", "o", "o", "o","p"]
      for (int j = 0; j < room.length; j++) {
        room[j] = place[j].toCharArray();
      }
      if (isDistanced(room)) {
        answer[i] = 1;
      } else {
        answer[i] = 0;
      }
    }

    return answer;
  }
}