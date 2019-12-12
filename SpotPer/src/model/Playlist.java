package model;


public class Playlist {
    private int id;
    private String nome, dtCriacao;
    private double tempoTotalExecucao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(String dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempoTotalExecucao() {
        return tempoTotalExecucao;
    }

    public void setTempoTotalExecucao(double tempoTotalExecucao) {
        this.tempoTotalExecucao = tempoTotalExecucao;
    }
}
