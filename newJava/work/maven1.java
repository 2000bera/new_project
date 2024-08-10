package newJava.work;

public class maven1 extends maven 
{
    private String favColor;

    public maven1() 
    {
        
    }

    public maven1(String firstName, String lastName, int age, String favColor) 
    {
        super(firstName, lastName, age);
        this.favColor = favColor;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    @Override
    public String toString() 
    {
        return "maven1 [favColor=" + favColor + ", getFirstName()=" + getFirstName() + ", getLastName()="
                + getLastName() + ", getAge()=" + getAge() + "]";
    }

    
}
