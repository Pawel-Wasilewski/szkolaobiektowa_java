public class Student extends Person implements Spotters {
    private int students_ID_;
    public int students_count_ = 0;
    public Student(String name_, String surname_) {
        super(name_, surname_);
        students_count_++;
        students_ID_ = students_count_;
    }
    @Override
    public String toString() {
        return "Person " + "name_ = '" + getName_() + '\'' + ", surname_ = '" + getSurname_() + '\'' + ", age_ = " + getAge_();
    }

    @Override
    public void doaDuty() {
        System.out.println("Cleaning a chalkboard");
    }
}
