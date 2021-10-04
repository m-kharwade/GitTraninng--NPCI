



# def main():
#     print("Total amount in ATM :",fixedCash)
#     print("Total amount in your account",userbalnce)
#     amount=int(input("How much amount you want to withdraw ?"))
    
#     def withdraw(amount): 
#         global fixedCash
#         global userbalnce
#         global n  

#         amo_lst.append(amount)

#         if(amount>userbalnce or amount>(90*fixedCash)/100):
#             print("Insufficient balance")
#         else:
#             n=n-1  
#             userbalnce=userbalnce-amount
#             fixedCash=fixedCash-amount
            
              
#             lst.append(amount)
#             print(amount,"debited from your account")
#             if(n!=0):
#                 print("You can do ",n," more transations")
#                 amount=int(input("How much amount you want to withdraw ?"))
#                 withdraw(amount)
#             else:
#                 i=input("Do you want to see your last 3 transaction and Total balance, Y|N ? ")
#                 if(i=="Y"):
#                     print("Balnace amount :",userbalnce)
#                     for i in range(0,3):
#                         print("Transaction ",i+1 ,"is", lst[i])
        
#     withdraw(amount) 



# main()



# class AuthenticateWithdral():

#     def __init__(self,amount,pin):
#         self.amount=amount
#         self.pin=pin

#     def check_ATM_PIN(self):
#         if(self.pin):
#             pass

fixedCash=60000
userbalnce=70000
n=2
lst=[]
amo_lst=list()
transaction_lst=dict()


class OpenAccount():

    def __init__(self,id,name,saving_amount,pin):
        self.id=id
        self.name=name
        self.saving_amount=saving_amount
        self.pin=pin

    def __str__(self):
        return 'Account Details :'+"\n\t\tAccount Holder ID :"+str(self.id) +"\n\t\tAccount Holder Name : "+(self.name)+"\n\t\tAccount Holder Saving amount :"+ (self.saving_amount)+"\n\t\tAccount Holder Pin : "+(self.pin)
        

class PinAuthentication():
    n=1
   
    def __init__(self,accountHolder_pin):
        self.accountHolder_pin=accountHolder_pin
        
    def checkPin(self,amount):
        
        self.amount=amount
        
        self.pin=int(input("Enter your pin :"))

        if self.accountHolder_pin==self.pin:
            print("ATM pin is correct !")
            Transaction.debit(self.amount)
        else:  
            if(self.n==0):
                print("You entered wrong ATM pin twice so your account is block !")
            else:
                while(self.n!=0):
                    print("Wrong pin ! Enter pin again :")
                    self.n=self.n-1
                    self.checkPin(self.amount)
                    


class Display():


    def menu(self):
        print("What action do you want to perform:")
        print("\t1.Debit Money")
        print("\t2.Credit Money")
        print("\t3.Display Mini statement")
        self.action=int(input("Enter your choice :"))
        self.checkAction()
        
           
    def checkAction(self):
        if(self.action==1):
            self.amount=int(input("How much amount you want to debit ?"))
            # self.pin=int(input("Enter your pin :"))
            p1=PinAuthentication(accountHolder.pin)
            p1.checkPin(self.amount)
           

        elif (self.action==1):
            self.amount=int(input("How much amount you want to credit ?"))
            Transaction.credit()  
        else:
            Transaction.display_mini_statemnets()


class Transaction():

    def __init__(self):
        pass   


    def debit(amount): 
        global fixedCash
        global userbalnce
        global n  
        global transaction_lst
      
        amo_lst.append(amount)

        if(amount>userbalnce or amount>(90*fixedCash)/100):
            print("Insufficient balance")
        else:
            n=n-1  
            userbalnce=userbalnce-amount
            fixedCash=fixedCash-amount
            
              
            lst.append(amount)
            transaction_lst["Debited Amount"]=amount
            print(amount,"debited from your account")
            if(n!=0):
                print("You can do ",n," more transations")
                amount=int(input("How much amount you want to withdraw ?"))
                Transaction.debit(amount)
            else:
                i=input("Do you want to see your last 3 transaction and Total balance, Y|N ? ")
                if(i=="Y"):
                    print("Balnace amount :",userbalnce)
                    for i in range(0,3):
                        print("Transaction ",i+1 ,"is", lst[i])
     

    def credit(amount):
        global userbalnce
        global transaction_lst

        userbalnce=userbalnce+amount
        transaction_lst["Credited Amount"]=amount

        print("Amount is credited !")

    def display_mini_statemnets():
        global transaction_lst
        j=1
        
        for i in transaction_lst.items():
            print("Transaction " ,j," is ",i)
            j=j+1



user_lst=list()
for i in range(3):
    print("------------------Open Account-------------------")
    id,name,saving_amount,pin=input("Enter your ID,Name,amount to be saved and ATM pin :").split(",")
    accountHolder=OpenAccount(id,name,saving_amount,pin)
    user_lst.append(accountHolder)
    print("Your Account is created successfully !")
    print(accountHolder)

   
obj2=PinAuthentication(accountHolder.pin)

obj1=Display()
obj1.menu()
        
