#Francis Gerard
#Wrap Around Code

from __future__ import division
while 1:
    a = raw_input("letter? ")
    alpha = ('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z')
    s=0
    for i in alpha:
        s+=1
        if a==i:
            a=s
    if (a<=5):
        f=a*2
    elif (a<=10):
        f=(a%3)*5
    elif (a<=15):
        f=int(a/4)*8
    elif (a<=20):
        k=list(str(a))
        h=0
        for i in k:
            h=eval(i)+h
        f=h*10
    else:
        j=0
        e=1
        while j==0:
            e+=1
            if (a/e==int(a/e)):
                f=(a/e)*12
                j=1
    while f>26:
        f=f-26
    f=int(f-1)
    print alpha[f]