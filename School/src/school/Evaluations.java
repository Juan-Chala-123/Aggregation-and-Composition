package school;

import java.time.LocalDate;

public class Evaluations {
    private LocalDate date;
    private double percentage;
    private String type;
    
    public Evaluations(LocalDate date, double percentage, String type) {
        this.date = date;
        this.percentage = percentage;
        this.type = type;
    }
    
    public LocalDate getDate() {
        return this.date;
    }
    
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public double getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
