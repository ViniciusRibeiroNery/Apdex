/*Vinicius Ribeiro RM:559165*/
package org.example;

public class Apdex {

    public float calcularApdex(int satisfatorios, int toleraveis, int total) {
        if (total <= 0) {
            throw new IllegalArgumentException("O total tem que ser maior que zero");
        }
        return (satisfatorios + (toleraveis / 2f)) / total;
    }

    public String classificar(float score) {
        if (score >= 0.94) return "Excelente";
        if (score >= 0.85) return "Bom";
        if (score >= 0.70) return "Regular";
        if (score >= 0.50) return "Ruim";
        return "Inaceitável";
    }
}