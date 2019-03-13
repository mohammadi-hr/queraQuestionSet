package _10_javacupCompany.ir.javacup.company;

/**
 * Created by Hamidreza-HR on 3/13/2019.
 */
public class Company {
    private static final String name = "JavaCup.co";

    private static Company company = new Company();

    private Company() {
    }

    public String getName(){
        return name;
    }

    public static Company getInstance(){
        return company;
    }
}
