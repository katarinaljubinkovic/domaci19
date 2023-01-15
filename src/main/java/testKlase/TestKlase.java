package testKlase;

import java.util.ArrayList;

public class TestKlase {
    public static void main(String[] args) {
        Teretana teretana = new Teretana();
        teretana.setNaziv("Herkules");
        teretana.setGodinaOsnivanja(2016);

        Rekreativac rekreativac1 = new Rekreativac("H123", "Ivan", "Ivanovic", 198, 89, 10, 1000);
        Rekreativac rekreativac2 = new Rekreativac("H456", "Katarina", "Ljubinkovic", 175, 53, 10, 150);
        Rekreativac rekreativac3 = new Rekreativac("H789", "Nikola", "Nikolic", 185, 70.5, 20, 300);
        Rekreativac rekreativac4 = new Rekreativac("H987", "Maja", "Ilic", 168, 57.5, 10, 100);
        Rekreativac rekreativac5 = new Rekreativac("H654", "Bojana", "Bojic", 181, 63, 15, 50);

        Trener trener = new Trener("H321", "Nebojsa", "Savic", 186, 76.5, 10);

        ArrayList<Clan> listaClanova = new ArrayList<>();
        listaClanova.add(rekreativac1);
        listaClanova.add(rekreativac2);
        listaClanova.add(rekreativac3);
        listaClanova.add(rekreativac4);
        listaClanova.add(rekreativac5);
        listaClanova.add(trener);

        teretana.setListaClanova(listaClanova);

        //for (int i = 0; i < listaClanova.size(); i++) {
        //System.out.println(listaClanova.get(i));

        //}
        Sprava sprava1 = new Sprava("Sprava1", "Rad na nogama", 35);
        Sprava sprava2 = new Sprava("Sprava2", "Rad na rukama", 30);
        Sprava sprava3 = new Sprava("Sprava3", "Rad na trbušnjacima", 25);

        System.out.println(teretana.uspesniClanovi(sprava1));
        System.out.println(teretana.uspesniClanovi(sprava2));
        System.out.println(teretana.uspesniClanovi(sprava3));


    }
}



