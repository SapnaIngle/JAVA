package collectionframework;

import java.util.ArrayList;
import java.util.List;


public class Employee {

    String name;
    int id;
    String address;

    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id    ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getAddress() {
        this.address = address;
    }

    public String setAddress(String address) {
        return address;
    }



    public static void main (String[] args) {
        Employee obj1 = new Employee(101,"Mokshit", "Bangalore");
        Employee obj2 = new Employee(102, "Rahul", "Mumbai");
        Employee obj3 = new Employee(103, "Akshita", "Indore");

        List<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        list.forEach(s ->{
//            System.out.println("id: "+s.getId()+" name: "+s.getName()+" address: "+s.getAddress());
//        });

    }
}
