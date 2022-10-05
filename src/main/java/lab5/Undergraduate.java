package lab5;

public class Undergraduate extends Student{
    private boolean honer;
    public Undergraduate(String major, double gpa, int creditHours, boolean honer){
        super(major, gpa, creditHours);
        this.honer = honer;
    }

    public void setHoner(boolean honer) {
        this.honer = honer;
    }

    public boolean isHoner() {
        return honer;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "honer=" + honer +
                '}';
    }
}
