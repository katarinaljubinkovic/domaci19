package testKlase;

public class Sprava {
    private String naziv;
    private String opis;
    private int tezinaRada;

    public Sprava() {
    }

    public Sprava(String naziv, String opis, int tezinaRada) {
        this.naziv = naziv;
        this.opis = opis;
        this.tezinaRada = tezinaRada;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getTezinaRada() {
        return tezinaRada;
    }

    public void setTezinaRada(int tezinaRada) {
        if (tezinaRada > 25 && tezinaRada < 100) {
            this.tezinaRada = tezinaRada;
        } else {
            System.out.println("Nevalidan podatak.");
        }
    }
}

