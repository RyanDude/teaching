package lab5;

public class Student {
    private String major;
    private double gpa;
    private int creditHours;
    public Student(String major, double gpa, int creditHours){
        this.creditHours = creditHours;
        this.gpa = gpa;
        this.major = major;
    }

    public String getYear(){
        if(creditHours < 32){return "Freshman";}
        else if(creditHours < 64){return "Sophomore";}
        else if(creditHours < 96){return "Junior";}
        else {return "Senior";}
    }

    public double getGpa() {
        return gpa;
    }

    // optional
    public String getMajor(){
        return major;
    }

    public int getCreditHours() {
        return creditHours;
    }

    @Override
    public String toString() {
        return "student";
    }
}
