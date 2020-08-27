import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String firstName;
        String lastName;
        int age;
        boolean married;
        double size;

        String pattern="dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date=simpleDateFormat.format(new Date());

        System.out.println("Wie ist dein Vorname ?");
        firstName=sc.nextLine();
        System.out.println("Wie ist dein Nachname ?");
        lastName=sc.nextLine();
        System.out.println("Wie alt bist du ?");
        age=sc.nextInt();
        System.out.println("Bist du verheiratet ? true für Ja, false für nein");
        married=sc.nextBoolean();
        System.out.println("Wie groß bist du in Metern ? Bsp. 1,80");
        size=sc.nextDouble();

        System.out.println("Vorname: "+firstName);
        System.out.println("Nachname: "+lastName);
        System.out.println("Alter: "+age+" Jahre");
        if(married == true){
            System.out.println("Du bist verheiratet");
        } else{
            System.out.println("Du bist nicht verheiratet");
        }
        System.out.println("Größe: "+size+" m");

        //Bonus
        System.out.println("Vor- und Nachname: "+firstName+" "+lastName);
        System.out.println("Wann bist du geboren ? Bsp. 01.01.2020");
        sc.nextLine();
        date=sc.nextLine();
        System.out.println("Du bist am "+date+" geboren");
    }
}
