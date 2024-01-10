package module303;

public class Student {
    // Attributes / Field: variables that hold things about the student
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private long socialSecurity;
    private String address;
    private double[] grades;
    private int graduationYear;

    //Default attribute:
    String schoolName;

    protected int protectedDemo;

    // Constructor = special method that we use when we create Student objects
    //Same name as the class

    public Student(String firstName,String middleName, String lastName,int age, long socialSecurity, String address, double[] grades, int graduationYear){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurity = socialSecurity;
        this.address= address;
        this.grades = grades;
        this.graduationYear = graduationYear;
    }

    // default constructor that we created, so we can use it later when we create a new Student object
    /*If we don't create ANY constructor, Java creates an empty default constructor for us */
    public Student(){
        /*
        we can leave it empty; we can add default arguments
        we can even call the ALL ARGUMENTS CONSTRUCTOR empty
          Example: this("Unknown","Unknown","Unknown",0,0,"Unknown",null,0);
        */

        firstName= "Unknown";
        middleName= "Unknown";
        lastName ="Unknown";
        age= 0;
        socialSecurity = 0;
        address = "Unknown";
        grades =null;
        graduationYear = 0;

    }


    // Another constructor = maybe for students who only give their name;
    public Student(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Methods / Behavior:
    //Setter/Mutators (mutator )
    public void setName(String firstName, String lastName, String middleName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }


    public void setAge(int age){
        this.age = age;
    }

    public void setSocialSecurity(long socialSecurity){
        this.socialSecurity =  socialSecurity;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setGrades(double grades[]){
        this.grades = grades;
    }

    public void setGraduationYear(int graduationYear){
        this.graduationYear = graduationYear;
    }


    //Getters (accessor) methods: they allow us to access the valuer of our ATTRIBUTES

    public String getName(){
        return firstName + " " + middleName +" " + lastName;
    }
    public long getSocialSecurity(){
        return socialSecurity;
    }

    public String getAddress(){
        return address;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public int getAge(){
        return age;
    }
    public double[] getGrades(){
        return grades;
    }
    public int getGraduationYear(){
        return graduationYear;
    }


}
