package privatesecuritycompany;

public class Company {
    private String name;
    private int telephone;
    private String email;
    
    public Company(String name, int telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
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
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}