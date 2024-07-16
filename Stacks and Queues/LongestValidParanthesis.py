stack = [-1]

maxu = 0

expr = input()

for idx, bracket in enumerate(expr):
    if bracket == '(':
        stack.append(idx)

    else:
        stack.pop()

        if stack:
            maxu = max(maxu, idx - stack[-1])
        else:
            stack.append(idx)

print(maxu)

