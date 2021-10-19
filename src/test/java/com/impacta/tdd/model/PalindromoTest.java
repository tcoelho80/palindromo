package com.impacta.tdd.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    // Retorna que é Palindromo
    // “Rotator”
    // “bob”
    // “madam”
    // “mAlAyAlam”
    // “1”
    // “Able was I, ere I saw Elba”
    // “Madam I’m Adam”
    // “Step on no pets.”
    // “Top spot!”
    // “02/02/2020”

    @Test
    public void testPalindromoToUpperCase()
    {  
        Palindromo palindromo = new Palindromo();
        assertTrue(palindromo.validaPalindromo("Able was I, ere I saw Elba"));
    }

    @Test
    public void testPalindromoComCaracteresEspeciais()
    {
        Palindromo palindromo = new Palindromo();
        assertTrue(palindromo.validaPalindromo("02/02/2020"));
    }

    //Retorna que não é um Palindromo
    // “xyz”
    // “elephant”
    // “Country”
    // “Top . post!”
    // “Wonderful-fool”
    // “Wild imagination!”
    @Test
    public void testNaoPalindromo()
    {
        Palindromo palindromo = new Palindromo();
        assertFalse(palindromo.validaPalindromo("Wild imagination!"));
    }

    //Valida Se parametro de entrada é nulo
    @Test
    public void testNull()
    {
        Palindromo palindromo = new Palindromo();
        assertThrows(IllegalArgumentException.class, () -> {
            palindromo.validaPalindromo(null);
          });
    }

    //Valida Se parametro de entrada é bramnco
    @Test
    public void testBranco()
    {
        Palindromo palindromo = new Palindromo();
        assertThrows(IllegalArgumentException.class, () -> {
            palindromo.validaPalindromo("");
          });
    }
}