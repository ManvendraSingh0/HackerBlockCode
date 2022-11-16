package oops;

// import javax.xml.transform.stax.StAXResult;

public class student {
    private int age=19;
    private String name = "kaju";
    public student(String name,int age)
    {
        this.name= name;
        this.age=age;
    }
    // public void setAge(int age) throws Exception {
    //     if(age<0)
    //     {
    //         throw new Exception("Invalid age");
    //     }
    //     this.age = age;
    // }
    public void setAge(int age) throws Exception {
        try{
            if(age<0)
            {
                throw new Exception("it is Invalid age");
            }
            this.age = age;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       finally
       {
        System.out.println("I am in finally blocks");
       }
       
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        

    }
}
