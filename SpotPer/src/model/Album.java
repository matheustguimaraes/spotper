package model;


public class Album {
    private int id, codGravadora;
    private String nomeGravadora, descricao, tipoCompra, dtGravacao, dtCompra;
    private double precoCompra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodGravadora() {
        return codGravadora;
    }

    public void setCodGravadora(int codGravadora) {
        this.codGravadora = codGravadora;
    }

    public String getNomeGravadora() {
        return nomeGravadora;
    }

    public void setNomeGravadora(String nomeGravadora) {
        this.nomeGravadora = nomeGravadora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public String getDtCompra() {
        return dtGravacao;
    }

    public void setDtGravacao(String dtGravacao) {
        this.dtGravacao = dtGravacao;
    }

    public String getDtGravacao() {
        return dtCompra;
    }

    public void setDtCompra(String dtCompra) {
        this.dtCompra = dtCompra;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
}
