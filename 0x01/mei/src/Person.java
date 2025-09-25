import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Objects;

public class Person {

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner,
            boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public String fullName() {
        return name + " " + surname;
    }

    public float calculateYearlySalary() {
        return this.salary * 12;
    }

    public boolean isMEI() {
        if (anotherCompanyOwner || pensioner || publicServer) {
            return false;
        }
        
        if (calculateYearlySalary() >= 130000) {
            return false;
        }
        
        return isAtLeast18YearsOld();
    }

    private boolean isIneligibleForMEI() {
        return anotherCompanyOwner || pensioner || publicServer;
    }
    
    private boolean isAtLeast18YearsOld() {
        Objects.requireNonNull(birthDate, "Data de nascimento não pode ser nula");
        
        LocalDate birthLocalDate = new java.sql.Date(birthDate.getTime()).toLocalDate();
        LocalDate today = LocalDate.now();
        
        return Period.between(birthLocalDate, today).getYears() >= 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
