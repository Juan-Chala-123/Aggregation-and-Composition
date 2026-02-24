package streamingplatform;

public class Episode {
    private String name;
    private int duration;
    
    public Episode(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
}