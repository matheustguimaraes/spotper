package Model;


public class Album {
    private int id, codGravadora;
    private String descricao, tipoCompra, dtGravacao, dtCompra;
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

    public String getDtGravacao() {
        return dtGravacao;
    }

    public void setDtGravacao(String dtGravacao) {
        this.dtGravacao = dtGravacao;
    }

    public String getDtCompra() {
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
