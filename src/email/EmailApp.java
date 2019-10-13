package email;

public class EmailApp {

    public static void main(String[] args) {

        // Kreiranje objekta
        Email em1 = new Email("John", "Smith");
        // Pozivanje metode info koja ispisuje informacije radnika
        System.out.println(em1.info());
    }
}
