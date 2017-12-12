package cn.edu.swpu.cins.learnSomethings.collection.collectionTest01;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by miaomiao on 17-7-21.
 */
public class Student implements Comparable<Student> {

    private int id;
    private  String name;
    private Set<Course> course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getCourse() {
        return course;
    }

    public void setCourse(Set course) {
        this.course = course;
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
        this.course = new HashSet<Course>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id,o.getId());
    }
}
