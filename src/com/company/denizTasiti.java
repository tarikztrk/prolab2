package com.company;

public class denizTasiti extends arac implements IdenizTasitlari{

    int ID;

    public denizTasiti(){

    }

    public denizTasiti(int yolcuSayisi,int hiz,int uretimYili ,String marka,String renk,int fiyat){
            this.setHiz(hiz);
            this.setUretimYili(uretimYili);
            this.setYolcuSayisi(yolcuSayisi);
            this.setMarka(marka);
            this.setRenk(renk);
            this.setFiyat(fiyat);
            üretilenNesne++;
    }


    public void hizlan(int a) {

        this.setHiz(this.getHiz()+a);
    }

    public void yavasla(int a) {
        this.setHiz(this.getHiz()-a);
        if (this.getHiz()<0){
            dur();
        }
    }

    public void dur() {
        this.setHiz(0);

    }
}
