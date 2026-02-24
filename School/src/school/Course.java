package school;

import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private ArrayList<Teacher> teacher;
    private ArrayList<Evaluations> evaluations;
    private ArrayList<Student> students;
    
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.evaluations = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teacher = new ArrayList<>();
    }
    
    public void addTeacher(Teacher t) {
        this.teacher.add(t);
    }
    
    public void addEvaluations(Evaluations e) {
        this.evaluations.add(e);
    }
    
    public void addStudents(Student s) {
        this.students.add(s);
    }
    
    public void removeEvaluations(Evaluations e) {
        this.evaluations.remove(e);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }
    
    public ArrayList<Evaluations> getEvaluations() {
        return evaluations;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
}
