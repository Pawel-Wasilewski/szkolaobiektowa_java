public class Person {
    public String name_;
    public String surname_;
    public int age_;

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

}
