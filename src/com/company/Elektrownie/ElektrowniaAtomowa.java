package com.company.Elektrownie;
import com.company.Dochod.DochodAtomowa;
import com.company.Head.Wlasciciel;
import com.company.uslugodawcy.DystrybutorPradu;
import com.company.uslugodawcy.OdbiorcaOdpadow;

import java.util.ArrayList;

public class ElektrowniaAtomowa extends Elektrownia {

    private int LiczbaReaktorow;
    private float ZuzycieWody;
    private int kiedyDokupic;
    private int pojemnoscMagazynu;
    private com.company.uslugodawcy.OdbiorcaOdpadow OdbiorcaOdpadow;
    private ArrayList<String> listaMiastAtom = new ArrayList<>(){
        {
            add("Miasto1");
            add("Miasto2");
            add("Miasto3");
            add("Miasto4");
            add("Miasto5");

        }
    };

    public ElektrowniaAtomowa(){
        super();
        this.LiczbaReaktorow = 3;
    }


    public ElektrowniaAtomowa(String nazwa, String miasto, int MocChwilowa, int MocMaksymalna,int liczbaBlokow, int LiczbaPracownikow, Wlasciciel wlasciciel, boolean czyPracuje, int LiczbaReaktorow,
                              float ZuzycieWody, DystrybutorPradu Dystrybutor, int stanMagazynu,int pojemnoscMagazynu, OdbiorcaOdpadow OdbiorcaOdpadow, int cenaZakupu, int cenaSprzedazy,
                              int cenaBloku,int kiedyDokupic){

        super(nazwa, miasto, MocChwilowa, MocMaksymalna, liczbaBlokow, LiczbaPracownikow, czyPracuje, wlasciciel, Dystrybutor, cenaZakupu, cenaSprzedazy, cenaBloku, kiedyDokupic,stanMagazynu,pojemnoscMagazynu);
        this.LiczbaReaktorow = LiczbaReaktorow;
        this.ZuzycieWody = ZuzycieWody;
        this.OdbiorcaOdpadow = OdbiorcaOdpadow;
        this.kiedyDokupic = kiedyDokupic;
        this.obliczDochodElektrowni = new DochodAtomowa();
    }

    //metody get i set
    public int getLiczbaReaktorow() {
        return LiczbaReaktorow;
    }

    public void setLiczbaReaktorow(int liczbaReaktorow) {
        LiczbaReaktorow = liczbaReaktorow;
    }

    public float getZuzycieWody() {
        return ZuzycieWody;
    }

    public void setZuzycieWody(float zuzycieWody) {
        ZuzycieWody = zuzycieWody;
    }



    public com.company.uslugodawcy.OdbiorcaOdpadow getOdbiorcaOdpadow() {
        return OdbiorcaOdpadow;
    }

    public void setOdbiorcaOdpadow(com.company.uslugodawcy.OdbiorcaOdpadow odbiorcaOdpadow) {
        OdbiorcaOdpadow = odbiorcaOdpadow;
    }

    public int getKiedyDokupic() { return kiedyDokupic; }

    public void setKiedyDokupic(int kiedyDokupic) { this.kiedyDokupic = kiedyDokupic; }
    public float uzupelnij(){
        return  this.getStanMagazynu() * this.OdbiorcaOdpadow.getCenaZaTone();
    }


    public int getPojemnoscMagazynu() {
        return pojemnoscMagazynu;
    }

    public void setPojemnoscMagazynu(int pojemnoscMagazynu) {
        this.pojemnoscMagazynu = pojemnoscMagazynu;
    }

    @Override
    public String toString() {
        return "ElektrowniaAtomowa:" + super.toString() +
                "\nLiczbaReaktorow: " + LiczbaReaktorow +
                "\nZuzycieWody: " + ZuzycieWody +
                "\nOdbiorcaOdpadow: " + OdbiorcaOdpadow;
    }
    public String  typ(){
        return "atomowa";
    }

    @Override
    public float ObliczDochod(Elektrownia e) {
        return obliczDochodElektrowni.ObliczDochod(this);
    }
}
