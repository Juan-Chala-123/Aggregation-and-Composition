package school;

public class Student {
    private String name;
    private int telephone;
    
    public Student(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
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
}
