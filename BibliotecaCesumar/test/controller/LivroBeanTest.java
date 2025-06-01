/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controller;

import java.util.List;
import model.Livro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vi
 */
public class LivroBeanTest {
    
    public LivroBeanTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class LivroBean.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        LivroBean instance = new LivroBean();
        String expResult = "";
        String result = instance.salvar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLivro method, of class LivroBean.
     */
    @Test
    public void testGetLivro() {
        System.out.println("getLivro");
        LivroBean instance = new LivroBean();
        Livro expResult = null;
        Livro result = instance.getLivro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLivro method, of class LivroBean.
     */
    @Test
    public void testSetLivro() {
        System.out.println("setLivro");
        Livro livro = null;
        LivroBean instance = new LivroBean();
        instance.setLivro(livro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLivros method, of class LivroBean.
     */
    @Test
    public void testGetLivros() {
        System.out.println("getLivros");
        LivroBean instance = new LivroBean();
        List<Livro> expResult = null;
        List<Livro> result = instance.getLivros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLivros method, of class LivroBean.
     */
    @Test
    public void testSetLivros() {
        System.out.println("setLivros");
        List<Livro> livros = null;
        LivroBean instance = new LivroBean();
        instance.setLivros(livros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
