package lab5;

public class Graduate extends Student{
    private String degree;
    private String concentration;
    private int years;
    public Graduate(String major, double gpa, int creditHours,
                    String degree, String concentration, int years){
        super(major, gpa, creditHours);
        this.concentration = concentration;
        this.degree=degree;
        this.years=years;
    }

    public String getConcentration() {
        return concentration;
    }

    public int getYears() {
        return this.years;
    }
}
