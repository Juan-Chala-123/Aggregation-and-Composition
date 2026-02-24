/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamingplatform;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Episode episode1 = new Episode("Episode 1: The Beginning", 45);
        Episode episode2 = new Episode("Episode 2: The Journey", 50);
        Episode episode3 = new Episode("Episode 3: The Challenge", 48);
        
        Season season1 = new Season("Season 1", "S01");
        Season season2 = new Season("Season 2", "S02");
        
        season1.addEpisodes(episode1);
        season1.addEpisodes(episode2);
        season2.addEpisodes(episode3);
        
        Serie series1 = new Serie("Breaking Bad", "BB001");
        Serie series2 = new Serie("Game of Thrones", "GOT001");
        
        series1.addSeasons(season1);
        series1.addSeasons(season2);
        
        SubscriptionPlan basicPlan = new SubscriptionPlan("Basic Plan", 9, "SD Quality, 1 Screen");
        SubscriptionPlan premiumPlan = new SubscriptionPlan("Premium Plan", 15, "HD Quality, 4 Screens");
        
        basicPlan.addSeries(series1);
        premiumPlan.addSeries(series1);
        premiumPlan.addSeries(series2);
        
        User user1 = new User("Alice Johnson", "U001");
        User user2 = new User("Bob Smith", "U002");
        
        user1.addSubscription(basicPlan);
        user2.addSubscription(premiumPlan);
        
        System.out.println("=== STREAMING PLATFORM SYSTEM ===\n");
        
        System.out.println("Series: " + series1.getName());
        System.out.println("Code: " + series1.getCode());
        System.out.println("Total Seasons: " + series1.getSeasons().size());
        
        System.out.println("\n\n=== SUBSCRIPTION PLANS ===\n");
        System.out.println(basicPlan.getName() + " - $" + basicPlan.getMontlyPrice() + "/month");
        System.out.println("Benefits: " + basicPlan.getBenefits());
        System.out.println("Available Series: " + basicPlan.getSeries().size());
        
        System.out.println("\n" + premiumPlan.getName() + " - $" + premiumPlan.getMontlyPrice() + "/month");
        System.out.println("Benefits: " + premiumPlan.getBenefits());
        System.out.println("Available Series: " + premiumPlan.getSeries().size());
        
        System.out.println("\n\n=== USERS ===\n");
        System.out.println("User: " + user1.getName() + " (Code: " + user1.getCode() + ")");
        System.out.println("Subscriptions: " + user1.getSubscription().size());
        
        System.out.println("\nUser: " + user2.getName() + " (Code: " + user2.getCode() + ")");
        System.out.println("Subscriptions: " + user2.getSubscription().size());
    }
    
}
