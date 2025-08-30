def findteams(n, ranks):
    t = 0
    teams = []  # Use list instead of tuple
    for i in range(n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                if (ranks[i] > ranks[j] > ranks[k]) or (ranks[i] < ranks[j] < ranks[k]):
                    t += 1
                    teams.append((ranks[i], ranks[j], ranks[k]))
    print("Total teams:", t)
    print("Teams formed:", teams)
      # return if you want to use the result

# Input
n = int(input("Enter n: ").strip())
ranks = list(map(int, input("Enter ranks: ").strip().split()))

# Function call
findteams(n, ranks)

