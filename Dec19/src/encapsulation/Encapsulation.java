package encapsulation;

// wrapping a data in a single unit is called encapsulation
public class Encapsulation {

    private int id;
    private String name;
    private String address;

    public void setId(int id){
        if (id>0) {
            id = id;
        } else {
            System.out.println("Id zero cannot set");
        }

    }

    public void setName(String str) {
        name = str;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        
        Encapsulation obj = new Encapsulation();
        obj.id = 1;
        obj.name="Sapna";
        obj.address = "Pune";
        System.out.println(obj.id+" "+obj.name+" "+obj.address);


        obj.id = 2;
        obj.name = "Arisu";
        System.out.println(obj.getId()+" "+obj.getName());
    }


}




