/*Vinicius Ribeiro RM:559165*/
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApdexTest {

    private Apdex apdex; // objeto usado em todos os testes

    @BeforeEach
    void setUp() {
        apdex = new Apdex(); // inicializa antes de cada teste
    }

    @Test
    public void calcApdex() {
        float score = apdex.calcularApdex(447332, 0, 559165);
        assertEquals(0.80f, score, 0.001f);
    }

    @Test
    public void testClassificacaoExcelente() {
        float score = apdex.calcularApdex(526600, 10000, 559165);
        assertEquals("Excelente", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoBom() {
        float score = apdex.calcularApdex(476290, 30000, 559165);
        assertEquals("Bom", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoRegular() {
        float score = apdex.calcularApdex(391415, 40000, 559165);
        assertEquals("Regular", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoRuim() {
        float score = apdex.calcularApdex(279580, 20000, 559165);
        assertEquals("Ruim", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoInaceitavel() {
        float score = apdex.calcularApdex(100000, 10000, 559165);
        assertEquals("Inaceitável", apdex.classificar(score));
    }

    @Test
    public void testTotalZeroLancaExcecao() {
        assertThrows(IllegalArgumentException.class,
                () -> apdex.calcularApdex(10, 5, 0));
    }
}