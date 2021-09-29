
fixedCash=60000
userbalnce=70000
n=3
lst=[]


def main():
    
    print("Total amount in ATM :",fixedCash)
    print("Total amount in your account",userbalnce)
    amount=int(input("How much amount you want to withdraw ?"))
    

    def withdraw(amount,n,userbalnce,fixedCash): 
        print(n,amount)     
        if(amount>userbalnce or amount>(90*fixedCash)/100):
            print("Insufficient balance")

        n=n-1  
        userbalnce=userbalnce-amount
        fixedCash=fixedCash-amount
        lst.append(amount)
        print(amount,"debited from your account")
        if(n!=0):
            print("You can do ",n," more transations")
            amount=int(input("How much amount you want to withdraw ?"))
            withdraw(amount,n,userbalnce,fixedCash)
      

    print(n,amount)
    withdraw(amount,n,userbalnce,fixedCash) 
    i=input("Do you want to see your last 3 transaction and Total balance, Y|N ? ")
    if(i=="Y"):
        print("Balnace amount :",userbalnce)
        for i in range(0,n):
            print("Transaction ",i+1 ,"is", lst[i])
    
main()
