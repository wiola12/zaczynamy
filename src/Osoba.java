public class Osoba {
   private String imie;
   private String nazwisko;
   private String email;
   private int dzienUrodzenia;
   private int miesiacUrodzenia;
   private int rokUrodzenia;
   Osoba (String imie, String nazwisko, String email, int dU,int mU , int rU){
   this.imie=imie;
   this.nazwisko=nazwisko;
   this.email=email;
   this.dzienUrodzenia=dU;
   this.miesiacUrodzenia=mU;
   this.rokUrodzenia=rU;

   }
   Osoba(){}
   String jakSieCzujesz() {
       return "kiepsko";
   }

   String jakSieCzujesz(int skala) {
       String samopoczucie = "nie swietnie";
       if(skala>=5){
           samopoczucie="swietnie";
       }else if (skala==0){
           samopoczucie="tragicznie";
       }
       return samopoczucie;
   }

   String getImie(){

       return this.imie;

   }
   String getEmail(){
       return this.email;

   }
int getRokUrodzenia(){
       return this.rokUrodzenia;
}

    public String getNazwisko() {
        return nazwisko;
    }

    public int getDzienUrodzenia() {
        return dzienUrodzenia;
    }

    public int getMiesiacUrodzenia() {
        return miesiacUrodzenia;

    }
    void setImie(String imie) {

        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDzienUrodzenia(int dzienUrodzenia) {
        this.dzienUrodzenia = dzienUrodzenia;
    }

    public void setMiesiacUrodzenia(int miesiacUrodzenia) {
        this.miesiacUrodzenia = miesiacUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }
}

