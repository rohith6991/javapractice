
//Member class
class Member{
    String name;
    int age;
    Double salary;
}

//Member variable classs
class Member_Variable{
    Member mb = new Member(); // creating an object for the Member class
    Member_Variable(String name, int age, Double salary) // Member_Variable constructor to initialise the variables for the member class
    {
        mb.name = name;
        mb.age = age;
        mb.salary = salary;
    }
}

//Main class method
public class MemberQ3
{
    public static void main(String args[]) {
        Member_Variable mb_var = new Member_Variable("Harry Potter", 30, 2500.3);
        System.out.println("Members name : " + mb_var.mb.name);
        System.out.println("Members age : " + mb_var.mb.age);
        System.out.println("Members salary : " + mb_var.mb.salary);
    }
}

