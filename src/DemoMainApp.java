public class DemoMainApp {

    public static void main(String[] args) {
        System.out.println("Hello World");


        Person susi; // Ein Objekt von Person für Susi, eine Variable vom Typ "Person"
        susi = new Person(); // Objekt wird erst hier erstellt. Erst jetzt wir Speicher belegt. 
        susi.uniqueID = 4711;
        susi.firstName = "Susi";
        susi.lastName = "Sorglos" ;
        susi.ageInYears = 39;
        susi.mailAddress = "susi.sorglos@test.com";

        Person max = new Person();
        max.uniqueID = 2511;
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.ageInYears = 40;
        max.mailAddress = "max.mustermann@test.com";

        printPerson(max);
        printPerson(susi);
        printTwoPerson(susi,max);


    }

    public static void printTwoPerson(Person person1, Person person2){
        printPerson(person1);
        printPerson(person2);

    }

    public static void printPerson(Person person) {
        System.out.println("person.uniqueID = " + person.uniqueID);
        System.out.println("person.firstName = " + person.firstName);
        System.out.println("person.lastName = " + person.lastName);
        System.out.println("person.mailAddress = " + person.mailAddress);
        System.out.println("person.ageInYears = " + person.ageInYears);
    }

}
