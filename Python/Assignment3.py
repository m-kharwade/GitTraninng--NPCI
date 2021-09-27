

size = 4
m = (2 * size)-1
n=3
list=[]
list2=[]
sum=0

for i in range(1, size):
    for j in range(1, m):
        print(end=" ")
    m = m-1 
    for k in range(1,m):
        print(" ",end=" ")
    for j in range(1, i+1):
        if(i==1):
            print(i,end=" ")
            list2.append(i)
        else:
            print(n+j,end=" ")
            sum=sum+n+j
            list2.append(n+j)
        for k in range(1,3):
            print(" ",end=" ")     
    print(" ")
    if(i==1):
        list.append(1)
    else:
        list.append(sum)
    if(i!=1):
        n=n+3
       
print("Output 2")

for i in range(len(list)):
    print("Row",i,":" ,list[i])



#output 3
list3=[]
list2.reverse()


print("Reverse matrix :" ,list2)

for i in range(len(list2)):
    list2[i]=list2[i]*list2[i]

print("Square of reverse matrix :",list2)
   

