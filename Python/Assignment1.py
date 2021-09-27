
#class Student():

# s1M=int(input("Enter markrs for Stud1 for Maths :"))
# s1E=int(input("Enter markrs for Stud1 for English :"))
# s1P=int(input("Enter markrs for Stud1 for Physics : "))
# s2M=int(input("Enter markrs for Stud2 for Maths :"))
# s2E=int(input("Enter markrs for Stud2 for English :"))
# s2P=int(input("Enter markrs for Stud2 for Physics :"))
# s3M=int(input("Enter markrs for Stud3 for Maths :"))
# s3P=int(input("Enter markrs for Stud3 for Physics :"))
# s3E=int(input("Enter markrs for Stud3 for English :"))

s1M=22
s1E=56
s1P=67
s2M=88
s2E=98
s2P=98
s3M=50
s3P=56
s3E=45

stu1=[]
stu1.append(s1E)
stu1.append(s1M)
stu1.append(s1P)

stu2=[]
stu2.append(s2E)
stu2.append(s2M)
stu2.append(s2P)

stu3=[]
stu3.append(s3E)
stu3.append(s3M)
stu3.append(s3P)

# print(stu1)
# print(stu2)
# print(stu3)

stu1Total=(s1E+s1M+s1P)/3
stu2Total=(s2E+s2M+s2P)/3
stu3Total=(s3E+s3M+s3P)/3

print(stu1Total)
print(stu2Total)
print(stu3Total)

dist=[]
firstDiv=[]
secondDiv=[]



def result():
    if(stu1Total>80):
        print("Distiction")
        dist.append(stu1Total)
    elif(stu2Total>80):
        print("Distiction")
        dist.append(stu2Total)
    elif(stu3Total>80):
        print("Distiction")
        dist.append(stu3Total)
    elif(stu1Total>60 and stu1Total<79):
        print(" First Division")
        firstDiv.append(stu1Total)
    elif( stu2Total>60 and stu2Total<79 ):
        print(" First Division")
        firstDiv.append(stu1Total)
    elif(stu3Total>60 and stu3Total<79):
        print(" First Division")
        firstDiv.append(stu1Total)
    else:
        print("Second Division")
    

if(s1E<35 or s1M<35 or s1P<35 or s2E<35 or s2P<35 or s2M<35 or s3E<35 or s3M<35 or s3P<35):
    print("Failed")
    result()

print(dist)
print(firstDiv)








