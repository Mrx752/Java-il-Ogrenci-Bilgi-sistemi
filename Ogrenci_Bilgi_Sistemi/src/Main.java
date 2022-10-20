public class Main {
    public static void main(String[] args) {

    Teacher t1 = new Teacher("Yadigar","0544 220 53 65","MAT") ;
//    t1.print();
    Teacher t2 = new Teacher("Kerem","0538 432 21 21","BDN");
    Teacher t3 = new Teacher("jiraiya ","0533 221 34 45","EMT");
    Course Mate = new Course("Matematik","101","MAT");
    Course BDN = new Course("Beden eğitimi","001","BDN");
    Course EMT = new Course("Elektro Manyetik", "100", "EMT");

    Mate.addTeacher(t1);
    BDN.addTeacher(t2);
    EMT.addTeacher(t3);

    Student s1 = new Student("Naruto","666","2",Mate,BDN,EMT);
    s1.addNote(70,50,100);
    s1.printNote(Mate,BDN,EMT, s1.name);





















    }
}