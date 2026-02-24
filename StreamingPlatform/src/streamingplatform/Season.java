package streamingplatform;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private String name;
    private String code;
    private List<Episode> episodes;
    
    public Season(String name, String code) {
        this.name = name;
        this.code = code;
        this.episodes = new ArrayList<>();
    }
    
    public void addEpisodes(Episode e) {
        this.episodes.add(e);
    }
    
    public void removeEpisodes(Episode e) {
        this.episodes.remove(e);
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
    
    public List<Episode> getEpisodes() {
        return this.episodes;
    }
}