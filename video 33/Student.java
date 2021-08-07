import java.util.Calendar;



class Student 
{
    // class fields and methods
    private static long idCounter = 1;
    private static long calculateID() { return idCounter++; }
    public static long numberOfStudents() { return idCounter-1; }


    // Fields
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private long id;
    private String email;
    private String phone;
    private String address;




    // Constructors
    public Student(String firstName, String lastName, int age, String email) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;

        this.id = calculateID();
        this.gpa = -0.1f;
        this.phone = null;
        this.address = null;
    }

    public Student(String fullName, int birthdayYear)
    {
        this.firstName = fullName.substring(0, fullName.lastIndexOf(" "));
        this.lastName = fullName.substring(fullName.lastIndexOf(" ") + 1);

        this.age = (Calendar.getInstance().get(Calendar.YEAR) - birthdayYear);

        this.id = calculateID();

        this.gpa = -0.1f;
        this.phone = null;
        this.address = null;

    }

    public Student(String firstName, String lastName, int age, double gpa, String email, String phone, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa; 
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = calculateID();
    }





    // setters
    public void setAge(int age) { this.age = age; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }


    // getters
    public String getAddress() 
    { 
        if (address == null)
            return "No address";
        return address; 
    }

    public String getEmail() 
    { 
        if (email == null)
            return "No email";
        return email; 
    }

    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public int getAge() { return this.age; }
    public double getGpa() { return this.gpa; }
    public long getId() { return this.id; }

    public String getPhone() 
    { 
        if (phone == null)
            return "No phone";
        return this.phone; 
    }

    public String getFullName() { return this.firstName + " " + this.lastName; }
}


