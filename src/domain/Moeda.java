package domain;

public class Moeda {
    private String nomeMoeda;
    private double taxaConversao;

    public Moeda(String nomeMoeda, double taxaConversao) {
        this.nomeMoeda = nomeMoeda;
        this.taxaConversao = taxaConversao;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }
}