package otel_oto_java;
public class Oda_bilgileri {
    
    private int no;
    private int kat;
    private int yatak_sayisi;
    private int tipId;
    private int ucret;

    public int getno() {
        return no;
    }

    public void setno(int no) {
        this.no = no;
    }

    public int getkat() {
        return kat;
    }

    public void setkat(int kat) {
        this.kat = kat;
    }

    public int getyatak_sayisi() {
        return yatak_sayisi;
    }

    public void setyatak_sayisi(int yatak_sayisi) {
        this.yatak_sayisi = yatak_sayisi;
    }

    public int gettipId() {
        return tipId;
    }

    public void settipId(int tipId) {
        this.tipId = tipId;
    }
    
    public int getucret() {
        return ucret;
    }

    public void settur(int ucret) {
        this.ucret = ucret;
    }
    
    public Oda_bilgileri(int no,int kat,int yatak_sayisi, int tipId,int ucret) {
        this.no = no;
        this.kat = kat;
        this.yatak_sayisi = yatak_sayisi;
        this.tipId = tipId;
        this.ucret = ucret;
    }
    
}

