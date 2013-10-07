/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.salvatamarit.tests;

import net.salvatamarit.general.palindromoClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para testear la clase palindromClass
 *
 * @version %I%, %G%
 * @author Salva Tamarit
 * @date 06/10/2013
 */
public class palindromoClassTest {
    
    public palindromoClassTest() {
        System.out.println("NewEmptyJUnitTest");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("before-setUp");
    }

    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }
    
    @Test
    public void testGetPalindromo() {
        System.out.println("test: getPalindromo");
        palindromoClass oPalindromo = new palindromoClass();
        assertNotNull("objeto palindromo creado", oPalindromo);
        //assertEquals("getPalindromo: hola = aloh", oPalindromo.getPalindromo("hola"), "aloh");
        assertTrue("getPalindromo: hola = aloh", "aloh".equals(oPalindromo.getPalindromo("hola")));
        if (! "aloh".equals(oPalindromo.getPalindromo("hola")) ) {
            fail("getPalindromo: hola = aloh");
        }
    }
}