import java.util.Scanner;
/*
    Z klasy abstrakcyjnej nie można zrobić obiektu
 */
public abstract class Person {
    /*
        Sposoby deklaracji danych:

        - public pozwala na edycje zmiennej w mainie lub innej klasie
        - private dostępne jest tylko w jednej klasie
        - protected dostępne tylko w tej klasie lub pochobnej

     */
    private String name_;
    private String surname_;
    private int age_;

    /*
        Tworzenie obiektów w klasie oraz tzw. overloading czyli przeciążanie
    */
    public Person(String name_, String surname_, int age_) {
        this.name_ = name_;
        this.surname_ = surname_;
        this.age_ = age_;
    }
    public Person(String name_, String surname_) {
        this.name_ = name_;
        this.surname_ = surname_;
        age_ = 7;
    }
    /*
        Dostęp do prywatnych wartości
    */
    public String getName_() {
        return name_;
    }

    public String getSurname_() {
        return surname_;
    }

    public int getAge_() {
        return age_;
    }

    public void setName_(String name_) {
        System.out.println("Podaj PIN:");
        Scanner scan_PIN = new Scanner(System.in);
        String PIN = scan_PIN.next();
        if (PIN.equals("123")) {
            this.name_ = name_;
        } else {
            System.out.println("ERR 001: Złe hasło");
        }
    }
}
