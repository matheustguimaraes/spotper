package Model;


public class Playlist {
    private int id, dtCriacao;
    private String nome;
    private double tempoTotalExecucao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(int dtCriacao) {
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
