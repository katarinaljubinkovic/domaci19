package testKlase;

public abstract class Clan {
    protected String identifikacioniKod;
    protected String ime;
    protected String prezime;
    protected double visina;
    protected double tezina;

    public Clan() {
    }

    public Clan(String identifikacioniKod, String ime, String prezime, double visina, double tezina) {
        this.identifikacioniKod = identifikacioniKod;
        this.ime = ime;
        this.prezime = prezime;
        this.visina = visina;
        this.tezina = tezina;
    }

    public String getIdentifikacioniKod() {
        return identifikacioniKod;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if (visina > 0) {
            this.visina = visina;
        } else {
            System.out.println("Visina ne sme biti negativan vrednost.");
        }
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        if (tezina > 0) {
            this.tezina = tezina;
        } else {
            System.out.println("Tezina ne sme biti negativna vrednost.");
        }
    }
    public abstract void prikaziProfil();

    public abstract boolean postignutCilj(Sprava sprava);

    public double izracunajBMI() {
        double visinaUMetrima = visina / 100;
        return tezina / Math.pow(visinaUMetrima, 2);
    }
}

