import re
#방법1 정규표현식으로 치환. s에서 pattern과 일치하는 부분을 repl로
def solution1(s):
    patterns = {"zero" : "0", "one" : "1", "two" : "2", "three" : "3", "four" : "4", "five" : "5", "six" : "6", "seven" : "7", "eight" : "8", "nine" : "9"}
    for pattern, repl in patterns.items():
        s = re.sub(pattern, repl, s)
    return int(s)

#방법2 replace 메소드로 치환
def solution2(s):
    patterns = {"zero" : "0", "one" : "1", "two" : "2", "three" : "3", "four" : "4", "five" : "5", "six" : "6", "seven" : "7", "eight" : "8", "nine" : "9"}
    for pattern, repl in patterns.items():
        s = s.replace(pattern, repl)
        print(f"테스트 : {s}")
    return int(s)

# 방법3 replace가 아닌 translate 메소드 사용하기 -> translate는 치환대상 문자열와 치환할 문자열의 길이가 같아야한다.

s = input("문자열 입력: ")
print(f"결과: {solution1(s)}")