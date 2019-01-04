package com.company;

public class KaraTasitlari extends arac implements Ikaratasitlari{
    int tekerlekSayisi;
private String YakitTuru;
int ID;

    public KaraTasitlari(){


    }
    public KaraTasitlari(String YakitTuru){
        this.YakitTuru=YakitTuru;

    }
    public KaraTasitlari(int yolcuSayisi,int hiz,int uretimYili ,String marka,String renk,int fiyat,int tekerlekSayisi){
        this.tekerlekSayisi=tekerlekSayisi;
        this.setHiz(hiz);
        this.setUretimYili(uretimYili);
        this.setYolcuSayisi(yolcuSayisi);
        this.setMarka(marka);
        this.setRenk(renk);
        this.setFiyat(fiyat);
        üretilenNesne++;
    }



    public String getYakitTuru() {
        return YakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        YakitTuru = yakitTuru;
    }

    public void hizlan(int a) {
        this.setHiz(this.getHiz()+a);
    }

    public void yavasla(int a) {
        this.setHiz(this.getHiz() - a);
        if (this.getHiz() < 0) {
            dur();
        }
    }
    public void dur() {
        setHiz(0);

    }
}
