import java.util.Locale;
import java.util.Scanner;

public class slaptazodis {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Įveskite login: ");
        String login = skaitytuvas.nextLine();
        System.out.println("Įveskite email: ");
        String email = skaitytuvas.nextLine();
        System.out.println("Įveskite password: ");
        String password = skaitytuvas.nextLine();
        System.out.println("Įveskite pakartotasPassword: ");
        String pakartotasPassword = skaitytuvas.nextLine();

        System.out.println("login = " + login);
        System.out.println("email = " + email);
        System.out.println("password = " + password);
        System.out.println("pakartotasPassword = " + pakartotasPassword);

        boolean arVienodi = arZodziaiVienodi(login, password);
        System.out.println("Ar žodžiai yra vienodi: " + arVienodi);

        boolean arTuriSimboli = arTuriSImboli(email);
        System.out.println("Ar turi simbolį: " + arTuriSimboli);

        boolean arNesutampa = arZodziaiNesutampa(password, pakartotasPassword);
        System.out.println("Ar žodžiai nesutampa: " + arNesutampa);

        String kiekSimboliu= arDaugiauNegu10Simboliu(password);
        System.out.println("kiek passwordas turi simbolių = " + kiekSimboliu);

        boolean arYraDidzioji = arTuriDidziajaraide(password);
        System.out.println("Yra didžioji raide: " + arYraDidzioji);

        boolean arYraMazoji = arTuriMazajaraide(password);
        System.out.println("Yra mažoji raide: " + arYraMazoji);

    }

    public static boolean arZodziaiVienodi(String login, String password) {
        boolean arYra;
        arYra = login.equalsIgnoreCase(password);
        return arYra;
    }

    public static boolean arZodziaiNesutampa(String password, String pakartotasPassword) {
        boolean arYra;
        arYra = password.equalsIgnoreCase(pakartotasPassword);
        return arYra;
    }
    public static String arDaugiauNegu10Simboliu(String password) {
        if (passwor    public static boolean arTuriSImboli(String email) {
            boolean arTuri;
            arTuri = email.contains("@") && email.contains(".");
            return arTuri;
        }d.length() > 10) {
            return " daugiau nei 10 simbolių";
        }
        else {
            return "Mažiau nei 10 simbolių";
        }
    }
    public static boolean  arTuriDidziajaraide(String password) {
        boolean arYra;
        arYra = password.toLowerCase().equals(password);
        return arYra;
    }
    public static boolean  arTuriMazajaraide(String password) {
        boolean arYra;
        arYra = password.toUpperCase().equals(password);
        return arYra;
    }
}
    public static boolean arTuriSkaiciu(String password) {
        boolean arTuri;

        arTuri = Character.isDigit(password);
        for (int i = 0; i < password.length(); i++){

        }
        return arTuri;
    }
}
}
