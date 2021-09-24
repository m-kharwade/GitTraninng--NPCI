package Comparator;

import java.util.Comparator;

public class SortList implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
       if(o1.id==o2.id)
           return o1.name.compareTo(o2.name);
       else
           return o1.id-o2.id;
    }
}
