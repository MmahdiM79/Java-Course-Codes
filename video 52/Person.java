


public class Person implements Comparable<Person>
{
    // fields
    private String fullName;
    private int age;




    public Person(String fullName, int age) 
    {
        this.fullName = fullName;
        this.age = age;
    }




    @Override
    public int compareTo(Person o) 
    {
        return this.age - o.getAge();

        // if (this.age == o.getAge())
        //     return 0;

        // if (this.age > o.getAge())
        //     return +1;

        // return -1;
    }



    @Override
    public String toString() {
        return "--< " + fullName + ",  " + age + " >--\n";
    }


    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
