def solution(babbling):
    answer = 0
    for i in range(len(babbling)):
        babbling[i] = babbling[i].replace("aya", "X")
        babbling[i] = babbling[i].replace("ye", "X")
        babbling[i] = babbling[i].replace("woo", "X")
        babbling[i] = babbling[i].replace("ma", "X")
        if babbling[i] == "X" * len(babbling[i]):
            answer += 1
    return answer

cnt = int(input("말할 것 같은 발음의 갯수: "))
babbling = []
for i in range(cnt):
    babbling.append(input("발음입력: "))
print(f"실제 발음한 수: {solution(babbling)}")
		