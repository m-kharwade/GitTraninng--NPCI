package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColMain {

    public static void main(String[] args) {

        User user;
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Bob"));
        users.add(new User(11, "Adam"));
        users.add(new User(12, "Steve"));
        users.add(new User(1, "James"));


        Collections.sort(users, new SortList());
        for (User usr : users) {
            System.out.println(usr);
        }
    }
}
