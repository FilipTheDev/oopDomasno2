package Student;

public class MainClassAvtomobil {

    public static void main(String[] args){
        Avtomobil def = new Avtomobil();
        Avtomobil din = new Avtomobil("BMW", "321", 201512);
        def.marka = "Renault";
        def.model = "Megane";
        def.km = 124577;

        System.out.println("-Avtomobil 1 \nMarka: " + def.marka + "\nModel: " + def.model + "\nKilometri: " + def.km +
                "\n-Avtomobil 2 \nMarka: " + din.marka + "\nModel: " + din.model + "\nKilometri: " + din.km);
    }
}
