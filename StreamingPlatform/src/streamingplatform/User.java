package streamingplatform;

import java.util.ArrayList;

public class User {
    private String name;
    private String code;
    private ArrayList<SubscriptionPlan> subscription;
    
    public User(String name, String code) {
        this.name = name;
        this.code = code;
        this.subscription = new ArrayList<>();
    }
    
    public void addSubscription(SubscriptionPlan su) {
        this.subscription.add(su);
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
    
    public ArrayList<SubscriptionPlan> getSubscription() {
        return subscription;
    }
}