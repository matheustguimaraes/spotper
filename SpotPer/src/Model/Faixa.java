package Model;


public class Faixa {
    private int numeroFaixa, idAlbum, idTipoComposicao, tempoDuracao;
    private String descricao, tipoComposicao, tipoGravacao;

    public int getNumeroFaixa() {
        return numeroFaixa;
    }

    public void setNumeroFaixa(int numeroFaixa) {
        this.numeroFaixa = numeroFaixa;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public int getIdTipoComposicao() {
        return idTipoComposicao;
    }

    public void setIdTipoComposicao(int idTipoComposicao) {
        this.idTipoComposicao = idTipoComposicao;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoComposicao() {
        return tipoComposicao;
    }

    public void setTipoComposicao(String tipoComposicao) {
        this.tipoComposicao = tipoComposicao;
    }

    public String getTipoGravacao() {
        return tipoGravacao;
    }

    public void setTipoGravacao(String tipoGravacao) {
        this.tipoGravacao = tipoGravacao;
    }
}
