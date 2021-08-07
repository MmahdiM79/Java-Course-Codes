

public class Main 
{
    public static void main( String[] args )
    {
        // int num = 1;
        // System.out.println(num++);
        // System.out.println(num);

        // num = 1;
        // System.out.println(++num);
        // System.out.println(num);


        Student s1 = new Student("amirali farahani", 2001);
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());

        System.out.println("\n -------------- \n");

        Student s2 = new Student("hamid", "moradi", 19, "hamid@gmail.com");
        System.out.println(s2.getFirstName());
        System.out.println(s2.getLastName());
        System.out.println(s2.getAge());
        System.out.println(s2.getId());
        System.out.println(s2.getEmail());
        System.out.println(s2.getAddress());
        System.out.println(s2.getPhone());

        System.out.println("\n\n" + Student.numberOfStudents());
    }
}

