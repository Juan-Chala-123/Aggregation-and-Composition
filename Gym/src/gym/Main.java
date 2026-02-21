/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User("Carlos", 123456789);

        Plan plan = new Plan("Plan Fitness");
        
        Routines routine = new Routines("Rutina Piernas", 60);

        Couches coach = new Couches("Pedro", 987654321);

        routine.addCouche(coach);
        plan.addRoutine(routine);
        user.addPlan(plan);

        System.out.println("Usuario: " + user.getName());
        System.out.println("Plan: " + plan.getName());
        System.out.println("Rutina: " + routine.getName());
        System.out.println("Coach: " + coach.getName());
    }
    
}
