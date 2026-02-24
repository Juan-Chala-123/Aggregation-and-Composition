package privatesecuritycompany;

public class Guard {
    private String name;
    private int telephone;
    private String code;
    
    public Guard(String name, int telephone, String code) {
        this.name = name;
        this.telephone = telephone;
        this.code = code;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
