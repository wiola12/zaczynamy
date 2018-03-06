public class Start {
    public static void main(String[] args) {
        String imie = "wiola";
        int liczba = 12;
        String[]imiona = {"wiola","janek","kamil"};
        float liczby = 12.5f;
        long duzaliczba = 555555555;
        boolean prawda = true;
        Osoba person = new Osoba("klaudia", "widacha","w.wojta@hotmail.com",18,04,1999);
        person.setImie("janek");
        Employee person2 = new Employee();
        person.

        System.out.println(imiona.length);
        System.out.println("czesc "+imiona[2]);
        System.out.println(person.getImie()+","+person.getEmail()+","+person.getRokUrodzenia());
        System.out.println(person.jakSieCzujesz(0));

    }
}
