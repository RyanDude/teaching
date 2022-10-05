package lab5;

public class Exchange extends Student{
    private String country;
    private String year;
    public Exchange(String major, double gpa, int creditHours, String country,String year){
        super(major, gpa, creditHours);
        this.country = country;
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public String getYear(){return this.year;}
}
