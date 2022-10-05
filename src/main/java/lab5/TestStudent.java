package lab5;

public class TestStudent {
    public static void main(String[] args){
        /**
         * // you should test your code, this is my test
         *         Undergraduate under = new Undergraduate("CS", 3.80, 56, true);
         *         Student gra = new Graduate("CS", 3.80, 56, "MS", "CS", 2);
         *         Exchange Ex = new Exchange("CS", 3.80, 56, "GA", "20");
         *         // Under
         *         System.out.println("Under:");
         *         System.out.println(under.getGpa());
         *         System.out.println(under.getYear());
         *         System.out.println(under.isHoner());
         *         // Gra
         *         System.out.println("GRA:");
         *         System.out.println(gra.getMajor());
         *         System.out.println(gra.getCreditHours());
         *         // Ex
         *         System.out.println("EX:");
         *         System.out.println(Ex.getCreditHours());
         *         System.out.println(Ex.getYear());
         *         System.out.println(Ex.getCountry());
         * */
        Undergraduate under = new Undergraduate("CS", 3.80, 56, true);
        System.out.println(under);
    }
}
