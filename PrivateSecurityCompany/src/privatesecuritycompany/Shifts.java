package privatesecuritycompany;

import java.time.LocalTime;

public class Shifts {
    private LocalTime startTime;
    private LocalTime endTime;
    private String code;
    
    public Shifts(LocalTime startTime, LocalTime endTime, String code) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.code = code;
    }
    
    public LocalTime getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    
    public LocalTime getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}