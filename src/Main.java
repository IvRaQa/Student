import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listaStudenata = new ArrayList<>();
        ArrayList<Student> poloziliIspit = new ArrayList<>();

        do {
            System.out.println("Unesite ime studenta:");
            String ime = sc.next();
            if (ime.equals("quit")) {
                break;
            }
            System.out.println("Unesite Prezime studenta:");
            String prezime = sc.next();
            if (prezime.equals("quit")) {
                break;
            }


            System.out.println("Unesite ocenu studenta:");
            String ocenaI = sc.next();
            if (ocenaI.equals("quit")) {
                break;
            }
            int ocena = Integer.parseInt(ocenaI);
            if(!(ocena >=5 && ocena<=10)){
                System.out.println("Niste uneli dobru ocenu");
                break;
            }

            listaStudenata.add(new Student(ime, prezime, ocena));
        }
        while (true);

        System.out.println("Lista svih upisanih studenata" + listaStudenata);

        for (Student s : listaStudenata) {
            if (s.getOcena() > 5) {
                poloziliIspit.add(s);
            }
        }
        System.out.println("Studenti koji su polozili ispit " + poloziliIspit);
    }
}