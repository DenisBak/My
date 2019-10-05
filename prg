import turtle

print("Hello! My name is computer, nice to see u) How many ")
n = int(1)
data = []
fig = int(input("how many figure do you want?"))
for i in range(fig):
    print("How many parties do u want for figure", n)
    l = input()
    n += 1
    data.append(l)
    print(data)
