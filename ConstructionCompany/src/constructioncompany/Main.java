/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructioncompany;

import java.time.LocalTime;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Project project = new Project("Sistema ERP", "Madrid", 50000);

        project.addEngineer(new Engineers("Ana", 111111));
        project.addEngineer(new Engineers("Luis", 222222));

        Stages stage1 = project.addStages(
                "Análisis",
                LocalTime.of(9, 0),
                LocalTime.of(13, 0)
        );

        stage1.addActivities("Recolección de requisitos", 2);
        stage1.addActivities("Entrevistas", 2);

        System.out.println("Proyecto: " + project.getName());
        System.out.println("Ubicación: " + project.getLocation());
        System.out.println("Ingeniero: " + project.getEngineers());
    }
    
}
