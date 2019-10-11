import turtle

wn = turtle.Screen()
tur = turtle.Turtle()


print("Hello! My name is computer, nice to see u)")
n = int(1)
particl = []
fig = int(input("how many figure do you want?"))
abc = True

while abc:
    if fig <= 0:
        print("Sorry I cant wrote u figure which <= 0")
        abc = False
    else:
        print("How many parties do u want for figure", n)
        part = int(input())
        if part >= 3:
            n += 1
            particl.append(part)
            print(particl)
            if n > fig:
                abc = False
        else:
            print("Valid numbers of parties for figure, try to place partice for figure more than 3")

if particl[0]%2 != 0:
    for i in range(particl[0]):
        tur.forward(100)
        angle = particl[0]//2 * 360/particl[0]
        tur.left(angle)
tur.color('white')
tur.left(180)
tur.forward(100)
if particl[1]%2 != 0:
    for i in range(particl[1]):
        tur.color('black')
        tur.forward(100)
        angle = particl[1]//2 * 360/particl[1]
        tur.left(angle)
