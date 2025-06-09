def two_sum(list, target):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if target - list[i] == list[j]:
                return i, j


result = two_sum([1, 2, 3, 5, 6, 7], 9)
print(result)