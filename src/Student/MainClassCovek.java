package Student;

public class MainClassCovek {

    public static void main(String[] args){
       Covek covek = new Covek();
       covek.ime = "Filip";
       covek.prezime = "Tomevski";
       covek.maticen = 12352345123l;

        System.out.println("Imeto na covekot e: " + covek.ime +
                "\nPrezimeto na covekot e: " + covek.prezime +
                "\nCovekot ima maticen broj: " + covek.maticen);
   }
}
