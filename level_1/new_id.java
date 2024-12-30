public class new_id {
  public String solution(String new_id) {
    String newId = new_id.toLowerCase(); // 1단계 소문자 변환
    newId = newId.replaceAll("[^a-z0-9\\-_.]", ""); // 2단계 알파벳 소문자, 숫자, 뺴기, 밑줄, 마침표를 제외한 모든것 없앰
    newId = newId.replaceAll("\\.+", "."); // 3단계 .이 1개이상이면 .으로 바꿈
    newId = newId.replaceAll("^\\.+|\\.+$", ""); // 4단계 .이 처음과 끝에 오면 제거
    if (newId.isEmpty()) // 5단계 만약 빈 문자열이면 a대입
      newId = "a";

    if (newId.length() >= 16) { // 6단계 16자 이상이면 15자리까지만 사용, .으로 끝나면 제거
      newId = newId.substring(0, 15);
      newId = newId.replaceAll("\\.+$", "");
    }

    while (newId.length() < 3) { // 7단계 문자열 길이가 3보다 작다면 마지막 문자를 이어 붙여줌
      newId += newId.charAt(newId.length() - 1);

    }
    return newId;
  }
}
