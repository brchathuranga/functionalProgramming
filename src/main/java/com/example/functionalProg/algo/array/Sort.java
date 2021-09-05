package com.example.functionalProg.algo.array;

import com.example.functionalProg.algo.array.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        User user1 =  new User();
        user1.setId(1);
        user1.setFirstName("abc");
        user1.setLastName("pqr");
        User user2 =  new User();
        user2.setId(2);
        user2.setFirstName("def");
        user2.setLastName("axyz");


        List<User> users =  new ArrayList<>();
        users.add(user1);
        users.add(user2);
        //Sort without streaming
      // Collections.sort(users, Comparator.comparing(User::getLastName));
        users.stream()
                //.sorted(Comparator.comparing(user -> user.getLastName()))
                .forEach(System.out::println);

    }

}
