package org.example.calculatrice;

public class Operation {
    private String type;
    private double operande1;
    private double operande2;
    private double resultat;

    // Constructeurs
    public Operation() {}

    public Operation(String type, double operande1, double operande2) {
        this.type = type;
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    // Getters et Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOperande1() {
        return operande1;
    }

    public void setOperande1(double operande1) {
        this.operande1 = operande1;
    }

    public double getOperande2() {
        return operande2;
    }

    public void setOperande2(double operande2) {
        this.operande2 = operande2;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }

    @Override
    public String toString() {
        return "Operation{type='" + type + "', operande1=" + operande1 +
                ", operande2=" + operande2 + ", resultat=" + resultat + "}";}
}