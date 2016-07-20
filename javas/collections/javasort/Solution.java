package javas.collections.javasort;

import java.util.*;

/**
 * Created by buyan on 3/17/16.
 */

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        if (a.getCgpa() > b.getCgpa())
            return -1;
        else if (a.getCgpa() < b.getCgpa())
            return 1;
        else{
            int nameComparison = a.getFname().compareTo(b.getFname());
            if (nameComparison != 0)
                return nameComparison;
            else{
                if (a.getId() > b.getId())
                    return -1;
                else
                    return 1;
            }
        }
    }
}

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new StudentComparator());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }

        in.close();
    }
}
