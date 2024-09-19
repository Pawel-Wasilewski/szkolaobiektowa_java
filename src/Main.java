public class Main {
    public static void main(String[] args) {
        Person person = new Person("Joe", "Dover");
        System.out.println(person.getName_());

        //person.setName_("Ben");
        //System.out.println(person.getName_());

        Student student = new Student("Joe", "Bidon");
        System.out.println("Number of students: " + student.students_count_);
    }
}