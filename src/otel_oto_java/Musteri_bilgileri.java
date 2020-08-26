package otel_oto_java;

public class Musteri_bilgileri {
    private int TC;
    private String AD;
    private String SOYAD;
    private String ODA_NO;

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public String getAD() {
        return AD;
    }

    public void setAD(String AD) {
        this.AD = AD;
    }

    public String getSOYAD() {
        return SOYAD;
    }

    public void setSOYAD(String SOYAD) {
        this.SOYAD = SOYAD;
    }

    public String getODA_NO() {
        return ODA_NO;
    }

    public void setODA_NO(String ODA_NO) {
        this.ODA_NO = ODA_NO;
    }
        public Musteri_bilgileri(int TC,String AD, String SOYAD, String ODA_NO) {
        this.TC = TC;
        this.AD = AD;
        this.SOYAD = SOYAD;
        this.ODA_NO = ODA_NO;
    }
}

