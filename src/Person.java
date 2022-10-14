import java.util.Locale;

public class Person {
    // Unsere Klassen die Objekte aus der realen Welt abbilden haben KEINE main-Methode
    public int uniqueID;
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAddress;



    // Methoden innerhalb der Klasse sind MEIST (99%) NICHT static
    public void print() { //der Klasse eine Methode geben
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("ageInYears = " + ageInYears);
        System.out.println("mailAddress = " + mailAddress);

    }

    public String fullName(){
        return lastName.toUpperCase() + " " + firstName;

    }

    public void setLastName(String lastName) { //Methode mit Parameter, ändert Nachname (1) //this.sagt auf Attribut in Klasse zugreifen und nicht auf variable
        this.lastName = lastName;
    }

    @Override
    public String toString() {    // Code + Generate + markieren + to string (3)
        return "Person{" +
                "uniqueID=" + uniqueID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageInYears=" + ageInYears +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }

    public int getUniqueID() {     // Code + generate + auswählen "Getter and Setter"
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void changeAge(int newAge){
        if (newAge > ageInYears && newAge > 0 && newAge < 150) { // Bedingungen setzen (2)
            ageInYears = newAge;
        }
        else {
            System.out.println("404 - this age is not correct: " + newAge);
        }
    }

}
