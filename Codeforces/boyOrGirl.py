
username = input().strip()


distinct_chars = set(username)


distinct_count = len(distinct_chars)


if distinct_count % 2 == 0:
    
    print("CHAT WITH HER!")
else:
    
    print("IGNORE HIM!")