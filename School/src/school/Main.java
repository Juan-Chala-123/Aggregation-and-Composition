/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school;

import java.time.LocalDate;
/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Dr. Maria Garcia", "Mathematics");
        Teacher teacher2 = new Teacher("Prof. John Smith", "Physics");
        
        Student student1 = new Student("Alice Johnson", 55512);
        Student student2 = new Student("Bob Williams", 55568);
        Student student3 = new Student("Carol Brown", 34569);
        
        Evaluations eval1 = new Evaluations(LocalDate.of(2026, 3, 15), 30.0, "Midterm Exam");
        Evaluations eval2 = new Evaluations(LocalDate.of(2026, 4, 20), 40.0, "Final Exam");
        Evaluations eval3 = new Evaluations(LocalDate.of(2026, 2, 28), 20.0, "Quiz");
        Evaluations eval4 = new Evaluations(LocalDate.of(2026, 3, 10), 10.0, "Homework");
        
        Course course1 = new Course("Advanced Mathematics", "MATH301");
        Course course2 = new Course("Introduction to Physics", "PHYS101");
        
        course1.addTeacher(teacher1);
        course2.addTeacher(teacher2);
        
        course1.addStudents(student1);
        course1.addStudents(student2);
        course2.addStudents(student3);
        
        course1.addEvaluations(eval1);
        course1.addEvaluations(eval2);
        course1.addEvaluations(eval3);
        course1.addEvaluations(eval4);
        
        System.out.println("=== COURSE MANAGEMENT SYSTEM ===\n");
        
        System.out.println("Curso: " + course1.getName());
        System.out.println("Codigo: " + course1.getCode());
        
        System.out.println("\nProfesor: " + course1.getTeacher().get(0).getName());
        
        System.out.println("\nEstudiantes matriculados (" + course1.getStudents().size() + "):");
        
        System.out.println("\nEvaluaciones (" + course1.getEvaluations().size() + "):");
        
        System.out.println("\n\n=== Segundo Curso ===\n");
        System.out.println("Curso: " + course2.getName());
        System.out.println("Codigo: " + course2.getCode());

        System.out.println("\nEstudiantes matriculados (" + course2.getStudents().size() + "):");
        
        System.out.println("\nEvaluaciones (" + course2.getEvaluations().size() + "):");
        
        System.out.println("\nEvaluaciones: " + course2.getEvaluations().size());
    }
}