package car_project.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> student = new HashMap<>();

        student.put("Name", "João");
        student.put("Age", "17");
        student.put("Avarege Grade", "8.5");
        student.put("Class", "3a");

        System.out.println(student);

        System.out.println(student.keySet());

        List<Map<String, String>> listStudent = new ArrayList<>();
        listStudent.add(student);

        Map<String, String> student2 = new HashMap<>();

        student.put("Name", "<Maria>");
        student.put("Age", "20");
        student.put("Avarege Grade", "7.0");
        student.put("Class", "5c");

        listStudent.add(student2);

        System.out.println(listStudent);

        System.out.println(student.containsKey("Name"));

    }
}
