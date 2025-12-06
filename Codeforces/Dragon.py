s, n = map(int, input().split())
dragons = []

for _ in range(n):
    x, y = map(int, input().split())
    dragons.append((x, y))

# Sort by dragon strength
dragons.sort()

for x, y in dragons:
    if s > x:
        s += y
    else:
        print("NO")
        break
else:
    print("YES")
