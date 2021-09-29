
lst=[]
dict1={}
dict2={}

def main():
    print("1.Add a new element to the list")
    print("2.create dict from the list")
    print("3.Sort dict from the list")
    action=int(input("Enter your action :"))
    

    def addElements():
        m=int(input("Enter number of elements :"))
        for i in range(0,m):
            n=int(input("Enter list element:"))
            lst.append(n)
        print(lst)

    def createDict():
        # dict1 = {lst[i]: lst[i + 1] for i in range(0, len(lst), 2)}
        # print(dict1)
        dict1={n:n+n for n in lst}
        print(dict1)
        main()
        return dict1

    def sortDict():
        for i in range(len(dict1)):
            sml=[a for a in dict1.values() if a ==min(dict1.values())][0]
            key1=[k for k,v in dict1.items() if v ==min(dict1.values())][0]
            del dict1[key1]
            print(sml,key1,dict1[0],dict1[1])
            # list1.append(sml)
            # dict1[0]=dict1.keys
            # dict1[1]=dict1.values
        # print(dict1)

    if action==1:
        addElements()
        main()
    elif action==2:
        createDict()
    elif action==3:
        sortDict()  
        main()         
    else:
        print("Enter valid option !")
        main()


   
main()       

# add_lst=lambda 1