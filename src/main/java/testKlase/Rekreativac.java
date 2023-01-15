package testKlase;

public class Rekreativac extends Clan {
    private int brojPonavljanja;
    private double maksimalnoOpterecenje;

    public Rekreativac() {
    }

    public Rekreativac(String identifikacioniKod, String ime, String prezime, double visina, double tezina, int brojPonavljanja, double maksimalnoOpterecenje) {
        super(identifikacioniKod, ime, prezime, visina, tezina);
        this.brojPonavljanja = brojPonavljanja;
        this.maksimalnoOpterecenje = maksimalnoOpterecenje;
    }

    public int getBrojPonavljanja() {
        return brojPonavljanja;
    }

    public void setBrojPonavljanja(int brojPonavljanja) {
        if (brojPonavljanja > 0) {
            this.brojPonavljanja = brojPonavljanja;
        } else {
            System.out.println("Broj ponavljanja ne sme biti negativna vrednost.");
        }
    }
    public double getMaksimalnoOpterecenje() {
        return maksimalnoOpterecenje;
    }

    public void setMaksimalnoOpterecenje(double maksimalnoOpterecenje) {
        if (maksimalnoOpterecenje > 0) {
            this.maksimalnoOpterecenje = maksimalnoOpterecenje;
        } else {
            System.out.println("Broj ponavljanja ne sme biti negativna vrednost.");
        }
    }
    public boolean postignutCilj(Sprava sprava) {
        if (maksimalnoOpterecenje >= sprava.getTezinaRada() * brojPonavljanja) {
            return true;
        } else {
            return false;
        }
    }
    public void prikaziProfil() {
        System.out.println(toString());
    }

    public String toString() {
        return "Rekreativac: (" + identifikacioniKod + " " + ime + " " + prezime + ") \n" +
                "Maksimalno opterecenje: (" + maksimalnoOpterecenje + ")";
    }
}


