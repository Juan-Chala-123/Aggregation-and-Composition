package streamingplatform;

import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String name;
    private String code;
    private List<Season> seasons;
    
    public Serie(String name, String code) {
        this.name = name;
        this.code = code;
        this.seasons = new ArrayList<>();
    }
    
    public void addSeasons(Season se) {
        this.seasons.add(se);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public List<Season> getSeasons() {
        return seasons;
    }
}