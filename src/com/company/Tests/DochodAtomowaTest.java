package com.company.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.Dochod.DochodAtomowa;
import com.company.Elektrownie.*;

class JUnitTest {

    ListyDystrybutorzy dystrybutorzy = new ListyDystrybutorzy();
    ListyWlasciciele wlasciciele = new ListyWlasciciele();
    ListyDostawcy dostawcy = new ListyDostawcy();
    DochodAtomowa dochodAtomowa = new DochodAtomowa();

    Elektrownia el_atom_1 = new ElektrowniaAtomowa("Żarnowiec", "Żarnowiec", 0, 1070, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(0), 2, 150, dostawcy.odbiocyOdpadow.get(0), 150000, 75000, 75000, 10);
    Elektrownia el_atom_2 = new ElektrowniaAtomowa("Dukovany", "Trebic", 0, 1233, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(0), 2, 150, dostawcy.odbiocyOdpadow.get(1), 281250, 140625, 93750, 10);
    Elektrownia el_atom_3 = new ElektrowniaAtomowa("Biełojarsk", "Jekateryburg", 0, 1437, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(0), 2, 150, dostawcy.odbiocyOdpadow.get(2), 450000, 225000, 112500, 10);
    Elektrownia el_atom_4 = new ElektrowniaAtomowa("Emsland", "Lingen", 0, 1692, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(0), 2, 150, dostawcy.odbiocyOdpadow.get(3), 656250, 328125, 131250, 10);
    Elektrownia el_atom_5 = new ElektrowniaAtomowa("Belleville", "Burgundia", 0, 2010, 10, 10, wlasciciele.getWlasciciele().get(0), false, 1, 10f, dystrybutorzy.getDystrybutorzyPradu().get(0), 2, 150, dostawcy.odbiocyOdpadow.get(4), 900000, 450000, 150000, 10);

    @BeforeEach
    public void setUp() throws Exception {
    	el_atom_1.setMocChwilowa(el_atom_1.getMocMaksymalna());
    	el_atom_2.setMocChwilowa(el_atom_2.getMocMaksymalna());
    	el_atom_3.setMocChwilowa(el_atom_3.getMocMaksymalna());
    	el_atom_4.setMocChwilowa(el_atom_4.getMocMaksymalna());
        el_atom_5.setMocChwilowa(el_atom_5.getMocMaksymalna());
    }

    @Test
    public void obliczDochod_e1() {
        float result1 = 15010;
        
        assertEquals(result1, dochodAtomowa.ObliczDochod(el_atom_1),0.1);
    }
    
    @Test
    public void obliczDochod_e2() {
    	float result2 = 18759;
        
    	assertEquals(result2, dochodAtomowa.ObliczDochod(el_atom_2),0.1);
    }
    
    @Test
    public void obliczDochod_e3() {
    	float result3 = 23451;
        
    	assertEquals(result3, dochodAtomowa.ObliczDochod(el_atom_3),0.1);
    }
    
    @Test
    public void obliczDochod_e4() {
    	float result4 = 29316;
        
    	assertEquals(result4, dochodAtomowa.ObliczDochod(el_atom_4),0.1);
    }
    
    @Test
    public void obliczDochod_e5() {
    	float result5 = 36630;
        
    	assertEquals(result5, dochodAtomowa.ObliczDochod(el_atom_5),0.1);
    }

}
