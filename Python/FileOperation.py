from abc import abstractproperty


lst=['Name','Email','Phone','Meenakshi','m@gmail.com','1234','Mitali','mm@gmail.com,1234','Meenakshi','Mitali']
lst1=[]
lst_set=list(set(lst))
lst_tuple=()

def f7(lst):
    global seen
    global seen_add
    seen = set()
    seen_add = seen.add
    return [x for x in lst if not (x in seen or seen_add(x))]


lst=f7(lst)


file=open("sample.txt",'w')
for i in lst: 
    if lst.index(i)==0:
        pass
    elif(lst.index(i)%3==0):
         file.write('\n')
    file.write(i)
    file.write(',')



with open('sample.txt','r') as file:
    Lines = file.readlines()
 
    count = 0
    for line in Lines:
        for word in line.split():
            lst1.append(word)
    lst_tuple=tuple(lst1)
    print("Tuple :",lst_tuple)
        
    
   

