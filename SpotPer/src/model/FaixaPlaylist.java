package model;

public class FaixaPlaylist {
    private int idPlaylist, idAlbum, numFaixa, qtdeTocada;
    private String dtUltimaVezTocada;

    public int getId() {
        return idPlaylist;
    }

    public void setId(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public int getNumeroFaixa() {
        return numFaixa;
    }

    public void setNumFaixa(int numFaixa) {
        this.numFaixa = numFaixa;
    }

    public int getQtdeTocada() {
        return qtdeTocada;
    }

    public void setQtdeTocada(int qtdeTocada) {
        this.qtdeTocada = qtdeTocada;
    }

    public String getDtUltimaVezTocada() {
        return dtUltimaVezTocada;
    }

    public void setDtUltimaVezTocada(String dtUltimaVezTocada) {
        this.dtUltimaVezTocada = dtUltimaVezTocada;
    }
}
