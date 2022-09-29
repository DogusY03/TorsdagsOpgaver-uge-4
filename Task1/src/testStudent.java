public class testStudent {

    public static void main(String[] args) {
        Student a = new Student("X.X");
        Student b = new Student("Chris");
        Student c = new Student("Anders");

        Course Math = new Course("Math");
        Course History = new Course("History");
        Course Biology = new Course("Biology");

        a.addCourse(History);
        a.addCourse(History);

        b.addCourse(Math);
        b.addCourse(Biology);

        c.addCourse(Biology);
        c.addCourse(History);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
