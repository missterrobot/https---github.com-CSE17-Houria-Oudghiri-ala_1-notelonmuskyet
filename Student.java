public class Student extends Person{
    private int id;
    private String major;

    public Student(){
        super();
        id=0;
        major = "none";
    }

    public Student(String name, String address, String phone, String email, int id, String major){
        super(name, address, phone, email);
        this.id = id;
        this.major = major;
    }

    public int getID(){
        return id;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String toString(){
        return String.format("%sID: %d\nMajor: %s\n", super.toString(), id, major);
    }
}
