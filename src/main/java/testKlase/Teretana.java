package testKlase;

import java.util.ArrayList;

public class Teretana {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Clan> listaClanova = new ArrayList<>();

    public Teretana() {
    }

    public Teretana(String naziv, int godinaOsnivanja, ArrayList<Clan> listaClanova) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.listaClanova = listaClanova;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Clan> getListaClanova() {
        return listaClanova;
    }

    public void setListaClanova(ArrayList<Clan> listaClanova) {
        this.listaClanova = listaClanova;
    }
    public int uspesniClanovi(Sprava sprava) {
        int count = 0;
        for (int i = 0; i < listaClanova.size(); i++) {
            if (listaClanova.get(i).postignutCilj(sprava)) {
                count++;
            }

        }
        return count;
    }
}

