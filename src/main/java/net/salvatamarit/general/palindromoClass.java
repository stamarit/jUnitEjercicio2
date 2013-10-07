/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.salvatamarit.general;

/**
 * @author Salva Tamarit
 * @version %I%, %G%
 * @date 06/10/2013
 */
public class palindromoClass {
    
    /**
     * Devuelve el palíndromo de una cadena dada como parámetro
     * @param cadena String que recibe
     * @return palindromo String que devuleve como palíndromo
     */
    public String getPalindromo(String cadena) {
        
        String palindromo = "";
        
        for(int i = cadena.length() - 1; i >= 0; i--) {
            palindromo += cadena.charAt(i);
        }
        
        return palindromo;
    }
}
