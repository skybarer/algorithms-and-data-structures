package day_28_regex_patterns;

/**
 * @author : akashdhar
 * @date : 31-03-2019
 * @time : 08:19 PM
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// https://www.hackerrank.com/challenges/30-regex-patterns/problem

class User implements Comparable<User> {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public int compareTo(User o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


public class Solution {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int N = scanner.nextInt();
        List<User> list = new ArrayList<>();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if (emailID.contains("@gmail.com"))
                list.add(new User(firstName, emailID));
        }

        Collections.sort(list);

        for (User user : list) {
            System.out.println(user.getName());
        }

//        System.out.println(list);

        scanner.close();
    }
}
