class OurStudent { 
    private String name;
    private int id;

    // Parameterized Constructor
    public OurStudent(String myname, int myid){
        name = myname;
        id = myid;
    }
    
    // Default Constructor
    public OurStudent(){
        name = "Ali";
        id = 84;
    }

    public String getName(){ return name; }
    public void setName(String n){ this.name = n; }
    public int getId(){ return id; }
    public void setId(int i){ this.id = i; }
}

public class ConstructorDemo { 
    public static void main(String[] args) {
         // Using Parameterized Constructor
         OurStudent nikhil = new OurStudent("Ram", 85);
         System.out.println("ID: " + nikhil.getId());
         System.out.println("Name: " + nikhil.getName());
    }
}
