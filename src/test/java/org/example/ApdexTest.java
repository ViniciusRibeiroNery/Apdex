/*Vinicius Ribeiro RM:559165* /
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApdexTest {

    @Test
    public void calcApdex() {
        //Arrange
        Apdex apdex = new Apdex();

        //Act
        float score = apdex.calcularApdex(447332, 22366, 559165);

        //Assert
        assertEquals(0.80f, score, 0.001f);
    }

    @Test
    public void testClassificacaoExcelente() {
        Apdex apdex = new Apdex();
        float score = apdex.calcularApdex(526600, 10000, 559165);
        assertEquals("Excelente", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoBom() {
        Apdex apdex = new Apdex();
        float score = apdex.calcularApdex(476290, 30000, 559165);
        assertEquals("Bom", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoRegular() {
        Apdex apdex = new Apdex();
        float score = apdex.calcularApdex(391415, 40000, 559165);
        assertEquals("Regular", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoRuim() {
        Apdex apdex = new Apdex();
        float score = apdex.calcularApdex(279580, 20000, 559165);
        assertEquals("Ruim", apdex.classificar(score));
    }

    @Test
    public void testClassificacaoInaceitavel() {
        Apdex apdex = new Apdex();
        float score = apdex.calcularApdex(100000, 10000, 559165);
        assertEquals("Inaceitável", apdex.classificar(score));
    }

    @Test
    public void testTotalZeroLancaExcecao() {
        Apdex apdex = new Apdex();
        assertThrows(IllegalArgumentException.class, () -> apdex.calcularApdex(10, 5, 0));
    }
}