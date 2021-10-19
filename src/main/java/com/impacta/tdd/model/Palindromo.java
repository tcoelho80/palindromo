package com.impacta.tdd.model;

public class Palindromo {

    private String palavraFrase;

    public Palindromo() {
        
    }

    public String getPalavraFrase() {
        return palavraFrase;
    }

    public boolean validaPalindromo(String _palavraFrase){
        if (_palavraFrase == null || _palavraFrase == "")
        {
            throw new IllegalArgumentException("Erro palavra/Frase é nula ou em branco");
        }
            
        this.palavraFrase = _palavraFrase.toUpperCase().replaceAll("[\\p{Punct}&&[^_-]]+", "").replace(" ", "");
         return palavraFrase.equals(new StringBuilder(palavraFrase).reverse().toString());
    }

}
