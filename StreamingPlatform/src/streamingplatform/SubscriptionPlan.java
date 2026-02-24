package streamingplatform;

import java.util.ArrayList;

public class SubscriptionPlan {
    private String name;
    private int montlyPrice;
    private String benefits;
    private ArrayList<Serie> series;
    
    public SubscriptionPlan(String name, int montlyPrice, String benefits) {
        this.name = name;
        this.montlyPrice = montlyPrice;
        this.benefits = benefits;
        this.series = new ArrayList<>();
    }
    
    public void addSeries(Serie s) {
        this.series.add(s);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMontlyPrice() {
        return montlyPrice;
    }
    
    public void setMontlyPrice(int montlyPrice) {
        this.montlyPrice = montlyPrice;
    }
    
    public String getBenefits() {
        return benefits;
    }
    
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
    
    public ArrayList<Serie> getSeries() {
        return series;
    }
}