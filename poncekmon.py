def get_ponketmon(poketmon):
    if len(set(poketmon)) >= len(poketmon)//2:
        return len(poketmon)//2
    else:
        return len(set(poketmon))

#폰켓몬 입력받기
ponketmon = [int (i) for i in input("폰켓몬 입력: ")]
print(f"박사님의 폰켓몬: {ponketmon}")

print(f"내가 가진 폰켓몬: {get_ponketmon(ponketmon)}")