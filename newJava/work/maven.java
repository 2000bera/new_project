package newJava.work;

public abstract class maven 
{
    private String firstName;
    private String lastName;
    private int age;

    public maven() 
    {

    }

    public maven(String firstName, String lastName, int age) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return "maven [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
    
    
}
