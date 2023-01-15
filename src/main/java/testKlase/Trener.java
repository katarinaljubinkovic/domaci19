package testKlase;

public class Trener extends Clan {
    private int godineIskustva;

    public Trener() {
    }

    public Trener(String identifikacioniKod, String ime, String prezime, double visina, double tezina, int godineIskustva) {
        super(identifikacioniKod, ime, prezime, visina, tezina);
        this.godineIskustva = godineIskustva;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }
    public boolean postignutCilj(Sprava sprava) {
        return true;
    }

    public void prikaziProfil() {
        System.out.println(toString());
    }

    public String toString() {
        return "Instruktor: (" + identifikacioniKod + " " + ime + " " + prezime + ") \n " +
                "Godine iskustva: (" + godineIskustva + ")";
    }

}


