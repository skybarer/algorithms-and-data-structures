package java_priority_queue;

/**
 * @author : akashdhar
 * @date : 23-03-2019
 * @time : 08:17 PM
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */
class Student {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {

        return new ArrayList<>();
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
