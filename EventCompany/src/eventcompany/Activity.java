/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventcompany;

/**
 *
 * @author CHALA RAMIREZ
 */
import java.time.LocalTime;

public class Activity {

    private LocalTime startTime;
    private int duration;

    public Activity(LocalTime startTime, int duration) {
        this.startTime = startTime;
        this.duration = duration;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}