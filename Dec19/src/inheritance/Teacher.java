package inheritance;
// What is Inheritance? --> Acquiring all properties from parent class to child class.
// Advantage of Inheritance --> Re-usability
// Single class
// Multilevel class
// Heirarchical class
// Multiple class --> cannot use because it leads ro diamond problem
// Hybrid class


// Hybrid class example
public class Teacher {
    int id;
    String name;
    String address;
}

class MathsTeacher extends Teacher{
    public static void main(String[] args) {
        MathsTeacher obj = new MathsTeacher();
        obj.id = 1;
        obj.name = "Sapna";
        obj.address = "Pune";
        System.out.println("id=>"+ obj.id +" name=>"+ obj.name +" address=>"+ obj.address);
    }
}

class  PhysicsTeacher extends MathsTeacher{
    public static void main(String[] args){
        PhysicsTeacher obj = new PhysicsTeacher();
        obj.id = 1;
        obj.name = "Suhana";
        obj.address = "Mumbai";
        System.out.println("id=>" + obj.id +" name=>" + obj.name +" address=>" + obj.address);
    }

}

class ChemistryTeacher extends MathsTeacher{
    public static void main(String[] args){
        ChemistryTeacher obj = new ChemistryTeacher();
        obj.id = 1;
        obj.name = "Sudhir";
        obj.address = "Delhi";
        System.out.println("id=>"+obj.id+" name=>"+ obj.name+" address=>"+obj.address);

    }
}