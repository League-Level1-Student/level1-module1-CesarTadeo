
public class Platypus {
    private String platypusName;
    
    public Platypus(String name) {
		platypusName = name;
	}
    
    public void setName(String name) {
    	platypusName = name;
    }
    
    public String getName() {
    	return platypusName;
    }
    
	void sayHi(){
        System.out.println("The platypus " + platypusName + " is smarter than your average platypus.");
    }
}