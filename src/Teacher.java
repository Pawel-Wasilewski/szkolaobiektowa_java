public sealed class Teacher extends Person implements Spotters permits MainTeacher{
    private String subject;

    public Teacher(String name_, String surname_, int age_) {
        super(name_, surname_, age_);
        this.subject = subject;
    }
    @Override
    public void doaDuty() {
        System.out.println("Walking a Hallway");
    }
}
