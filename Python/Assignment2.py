

size = 10
sum=0

list=[]
m = (2 * size)-2


for i in range(1, size):
    for j in range(1, m):
        print(end=" ")
    m = m-1 
    for j in range(0, i):
        if(i==1):
            print(i,end=" ")
        elif(i%2!=0):
            print(i,end=" ")
            sum=sum+i
    if(sum!=0):
        list.append(sum)  
    sum=0
    print(" ")
       
    
 
print("Output")
print(list)


