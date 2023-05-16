# 첫번째 시도: 몸무게가 제일 적은 사람들끼리 보트 태움
# def solution(people, limit):
#     people.sort()
#     answer = 0
#     temp = 0
#     for person in people:
#         if temp + person <= limit:
#             temp += person
#         else:
#             temp = person
#             answer += 1
#     return answer

# 정렬한 후 몸무게가 제일 가벼운 사람과 제일 무거운 사람을 태운다.
# 만약 제한 몸무게보다 큰 경우 무거운 사람만 태우고 그 다음 무거운 사람과 비교한다. 
def solution(people, limit):
    people.sort()
    answer = 0
    idxF = 0
    idxB = len(people)-1
    while idxF <= idxB:
        if people[idxF] + people[idxB] <= limit:
            idxF += 1
        idxB -= 1
        answer += 1
    return answer

people = list(map(int, (input("사람들 몸무게 입력: ").split())))
limit = int(input("구명보트의 무게 제한: "))
print(f"필요한 최소 구명보트 개수: {solution(people, limit)}")
