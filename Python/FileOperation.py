from abc import abstractproperty


lst=['Name','Email','Phone','Meenakshi','m@gmail.com','1234','Mitali','mm@gmail.com,1234','Meenakshi']
lst1=[]
lst_set=list(set(lst))
lst_tuple=()

print(lst)
print(lst_set)
count=0
file=open("sample.txt",'w')
for i in lst: 
    if lst.index(i)==0:
        pass
    elif(lst.index(i)%3==0):
         file.write('\n')
    for j in range(lst.index(i)+1,len(lst)):
        if(i==lst[j]):
            # print("Duplicate record")
            count=count+1
    if(count>1):
        pass
    else:
        file.write(i)
        file.write(',')



with open('sample.txt','r') as file:
    # print(file.read())
    Lines = file.readlines()
 
    count = 0
    for line in Lines:
        # count += 1
        # print("Line{}: {}".format(count, line.strip()))
        # if '\n' in line:
        #     for i in line:
        #         if i=='\n':
        #             continue
        #         else:
        #             lst1.append(line)
        # else:
        #     lst1.append(line)
        for word in line.split():
            lst1.append(word)
    lst_tuple=tuple(lst1)
    print("Tuple :",lst_tuple)
        
    
   

