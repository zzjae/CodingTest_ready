# CodingTest 준비

# Java 문자열 함수

<br />
String.charAt(int index): string내 char을 추출 <br />
String.toCharArray(): string을 char로 전부 변환<br />
<br />
StringBuilder.toString(): 문자열을 string형태로 반환<br />
StringBuilder.append(char c): 문자 c를 문자열 끝에 붙임<br />
StringBuilder.length(): 문자열 길이 반환<br />
StringBuilder.reverse(): 문자열을 역으로 전환<br />
<br />
String.equals(String other) -> {boolean}: string이 other을 담고 있는지 반환<br />
String.length() -> {int}: 문자열의 길이 반환<br />
String.substring(int startIndex, int endIndex) -> {string}: startIndex부터 endIndex까지 잘라 반환<br />
String.toUpperCase() -> {string}: 대문자로 변환<br />
String.toLowerCase() -> {string}: 소문자로 변환<br />
<br />
Integer.parseInt(String s) -> {int}: 숫자를 표현하는 문자열을 정수로 변환<br />
Integer.toString(int v) -> {string}: 정수v를 문자열로 변환<br />
Long.parseLong(String s) -> {Long}: 숫자를 표현하는 문자열을 정수로 변환<br />
Long.toString(int v) -> {string}: 정수v를 문자열로 변환<br />
<br />
Integer.parseInt(String s, int radix) -> {int}: radix진법으로 숫자를 표현하는 문자열 s를 정수로 변환<br />
Integer.toString(int v, int radix) -> {string}: 정수 v를 radix 진법의 문자열로 변환<br />
Long.parseInt(String s, int radix) -> {Long}: radix진법으로 숫자를 표현하는 문자열 s를 정수로 변환<br />
Long.toString(Long v, int radix) -> {string}: 정수 v를 radix 진법의 문자열로 변환<br />
<br />
String.contains(CharSequence s) -> {boolean}: 전달받은 문자열이 원본 문자열에 있는지 검사<br />
String.startsWith(String prefix) -> {boolean}: 원본 문자열이 전달받은 문자열로 시작하는지 검사<br />
String.endsWith(String suffix) -> {boolean}: 원본 문자열이 전달받은 문자열로 끝나는지 검사<br />
String.indexOf(String str) -> {int}: 전달받은 문자열이 원본 문자열의 몇번째 인덱스에 있는지 검사<br />
<br />
String.replace(char oldChar, char newChar) -> {string}: oldChar을 newChar로 변환후 반환<br />
String.replace(CharSequence target, CharSequence replacement) -> {string}: 원본 문자열에 있는 target문자열을 replacement로 변환후 반환<br />
<br />
# 정규표현식
<br />
. :해당 문자를 제외한 아무 문자 ex) .nd -> and, end, cnd, nnd<br />
[abc]: a,b,c중 아무거나 ex) [ae]nd -> and, end<br />
[^abc]: a,b,c를 제외하고 ex) [^ae]nd -> cnd,nnd...<br />
[a-g]: a,g사이 문자 [0-9] -> 모든 숫자 [a-z] -> 모든 소문자 [A-Z] -> 모든 대문자 ex) [1-9][0-9] -> 10,25,35...<br />
a*: a 0개 이상 ex) 1[0-9]* -> 1,10,164,1810...<br />
a+: a 1개 이상 ex) 1[0-9]+ -> 10,164,1810...<br />
a?: a 0개 또는 1개 ex) 1[0-9]? -> 1,10,11...<br />
a{5}: a 5개 ex) [a-c]{3} -> aaa,aba...<br />
a{2,}: a 2개 이상 ex) [a-c]{3,} -> a,aa,ab...<br />
a{2,4}: a 2개 이상 4개 이하 ex) [a-c]{2,3} -> aa,bb,ac...<br />
ab|cd: ab또는 cd ex) 일|하나|한 -> 일,하나,한...<br />
^a: 문자열 처음이 a <br />
a$: 문자열 마지막이 a <br />
\: 사전 정의된 문자를 표현하는 이스케이프 시퀀스 ex) \. -> ., \+ -> +<br />
<br />
replaceAll(String regex, String replacement) -> {string}: 전달받은 정규식 표현에 매칭되는 모든 패턴을 모두 replacement로<br />
matches(String regex) -> {boolean}: 정규식 표현에 매칭되는지 검사<br />
split(String regex) -> {String[]}: 전달받은 정규식 표현에 매칭되는 모든 패턴을 기준으로 원본 문자영을 잘라서 반환<br />
