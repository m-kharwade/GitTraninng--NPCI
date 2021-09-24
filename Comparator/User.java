package Comparator;

public class User {

    String name;
    int id;

    User(int id,String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null ){
            return false;
        }
        User user = (User) o; // type cast the object into our class type
        return id == user.id && name.equals(user.name);
    }

    @Override
    public String toString() {
        return "User => Id =" + id +", Name = "+name;
    }

}
