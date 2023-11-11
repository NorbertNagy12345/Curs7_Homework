import Exercise1.EmailAd;
import Exercise1.FacebookAd;
import Exercise1.PrintAd;
import Exercise2.BRDBank;
import Exercise2.BTBank;
import Exercise2.INGBank;
import Exercise3.*;
import Exercise4.Student;

public class Main {
    public static void main(String[] args) {
        new FacebookAd("This ad was published to facebook").displayAd();
        new EmailAd("This ad was sent via Email").displayAd();
        new PrintAd("This ad was printed on paper").displayAd();

        new INGBank().deposit(2000);
        new INGBank().withdraw(2000);

        new BRDBank().deposit(1000);
        new BRDBank().withdraw(1000);

        new BTBank().deposit(3000);
        new BTBank().withdraw(3000);

        System.out.println(new Cat().eat());
        System.out.println(new Dog().eat());
        System.out.println(new Mouse().eat());
        System.out.println(new Chicken().eat());
        System.out.println(new Duck().eat());

        Student student = new Student("Mihai",8);
        Student student1 = new Student("Julia",7);
        Student student2 = new Student("Iosif",10);
        Student student3 = new Student("Catalin",2);
        System.out.println(student.getName()+"  "+student.getGrade());
        System.out.println(Student.calculateAverageGrade());
    }
}
