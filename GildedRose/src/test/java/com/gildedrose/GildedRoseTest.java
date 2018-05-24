package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }
    
    //créer des smoke tests
    /*
     * les smoke tests permettent d'entrer dans la boucle impossible refactor / test
     * -> a partir d'un jeu de données resultant de l'application , on peut faire une comparaison des resultats 
     * -> on s'assure que le refactor rendra le meme jeu de données
     * 
     */
    
    //Mais les smoke tests ne sont pas suffisants
    /*
     * plugin eclipse mutation test
     * -> va regarder le code testé et effectuer des modifs (erreurs triviales)
     * -> va voir si les smoke tests couvrent des modifs du code
     * -> si ça reste vert => il y a un problème
     * -> sinon on sait que le smoke test est probant
     */

}
