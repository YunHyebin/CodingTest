def solution(array, cmd):
    answer = []

    for row in cmd:
        # i번째부터 k번째까지 슬라이싱 & 정렬한 배열을 temp 변수에 담음
        temp = sorted(array[row[0]-1:row[1]])
        # 임시 배열 temp의 k번째 수 가져와서 answer 변수에 담기
        answer.append(temp[row[2]-1])
    return answer

#원본 배열 만들기
array = []
arrayCnt = int(input("array 배열의 원소 갯수: "))
for idx in range(arrayCnt):
    array.append(int(input("배열 원소 입력: ")))
print(f"array: {array}")

#명령 배열 만들기
commands = []
comCnt = int(input("명령 갯수 입력: "))
for idx in range(comCnt):
    print(f"명령 {idx+1}번")
    i = int(input("i번째 숫자부터: "))
    j = int(input("j번째 숫자까지: "))
    k = int(input("k번째 수: "))
    commands.append([i,j,k])
print(f"commands: {commands}")

print(f"정답: {solution(array, commands)}")