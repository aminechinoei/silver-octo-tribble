import java.util.ArrayList;
import java.util.Scanner;

public class ZorgApp
{
    Scanner keyboard = new Scanner(System.in);
    boolean quit = false;
    int menuItem;
    private Profile profi1le;
    ArrayList patients = new ArrayList();

    ZorgApp(){

        patients.add(new Profile("Amine", "Scheunhage", 28, 100, 180));
        patients.add(new Profile("Oumaima", "Scheunhage", 27, 60, 154));
        patients.add(new Profile("Jaouad", "Schreefel", 13, 80, 165));
        patients.add(new Profile("Yvette", "Schreefel", 58, 70, 160));
        patients.add(new Profile("Peter", "Scheunhage", 59, 100, 193));
        patients.add(new Profile("Karima", "Talbi", 57, 70, 165));
    }
    public void Lijst(){
        ZorgApp zorgApp;

        do {

            System.out.println("Ik wil graag de hele lijst zien!");
            System.out.println("Toets 1 om de lijst weertegeven");
            System.out.println("Toets 2 aan te maken");

            System.out.println("Maak een keuze uit cijfer 1 - 3: ");
            menuItem = keyboard.nextInt();
            switch (menuItem) {
                case 1:
                    for(int i = 0; i <patients.size(); i++) {
                        System.out.println(patients);
                    }
                    break;
                case 2:
                    AddPatient();
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }while(!quit);
    }

    public void AddPatient(){
        ZorgApp zorgApp;

            System.out.println("Voeg hier uw account toe");
            System.out.println("Geef aan hoeveel accounts u wilt toevoegen:");
            int countPatients = keyboard.nextInt();

            for(int i = 0; i <countPatients; i++){
                Profile profile = new Profile();
                System.out.println("Voer de patient gegevens in: " + (i + 1));

                System.out.println("Voer de voornaam in: ");
                profile.setFirstName(keyboard.next());

                System.out.println("Voer achternaam in: ");
                profile.setLastName(keyboard.next());

                System.out.println("Voer leeftijd in: ");
                profile.setAge(keyboard.nextInt());

                System.out.println("Voer gewicht in: ");
                profile.setWeight(keyboard.nextDouble());

                System.out.println("Voer lengte in: ");
                profile.setLength(keyboard.nextDouble());
                patients.add(profile);
            }
    }


}
