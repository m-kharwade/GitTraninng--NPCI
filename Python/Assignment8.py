dict1={"one":"Two","two":'One',"Five":'Five'}
list1=[]
for i in range(len(dict1)):
    sml=[a for a in dict1.values() if a ==min(dict1.values())][0]
    key1=[k for k,v in dict1.items() if v ==min(dict1.values())][0]
    del dict1[key1]
    list1.append(sml)

print(list1)