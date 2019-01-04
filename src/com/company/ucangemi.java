package com.company;

public class ucangemi extends  arac implements Ihavatasitlari,IdenizTasitlari {

    int ID;

    public ucangemi(){

    }
    public ucangemi(int yolcuSayisi,int hiz,int uretimYili ,String marka,String renk,int fiyat){
        this.setHiz(hiz);
        this.setUretimYili(uretimYili);
        this.setYolcuSayisi(yolcuSayisi);
        this.setMarka(marka);
        this.setRenk(renk);
        this.setFiyat(fiyat);
        üretilenNesne++;
    }


    public void hizlan(int a) {

    }


    public void yavasla(int a) {

    }


    public void dur() {

    }
}
