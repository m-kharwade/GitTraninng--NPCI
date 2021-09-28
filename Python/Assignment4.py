
num_tuple=(1,2,5,(5,8,9,(8,7,1,(5,1))))

ori=num_tuple

count=1

while(count!=0):
    for i in num_tuple:
        # print("i",i)
        # print("num_tumple",num_tuple) 
        if  isinstance(i,tuple)==True:
            count=+1
            for j in ori:
                # print(i,j)
                if(j in i):
                    print(i)
                    print("Matching element | ",j) 
            num_tuple=i 
            # print(i)
            # print(num_tuple) 
        else:
            count=0        
             
    
        

              
               
                



