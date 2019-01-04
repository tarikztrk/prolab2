package com.company;

public class HavaTasitlari extends arac implements  Ihavatasitlari{
    int ID;
    int tekerlekseyisi;

    private boolean inisKontrol =false;
    public HavaTasitlari(){

    }

    public HavaTasitlari(int yolcuSayisi,int hiz,int uretimYili ,String marka,String renk,int fiyat,int tekerlekSayisi){
        this.tekerlekseyisi=tekerlekSayisi;
        this.setHiz(hiz);
        this.setUretimYili(uretimYili);
        this.setYolcuSayisi(yolcuSayisi);
        this.setMarka(marka);
        this.setRenk(renk);
        this.setFiyat(fiyat);
        this.tekerlekseyisi=tekerlekSayisi;
        üretilenNesne++;
    }


    public void setInisKontrol(boolean inisKontrol) {
        this.inisKontrol = inisKontrol;
    }

    public boolean isInisKontrol() {
        return inisKontrol;
    }


    public void hizlan(int a) {
        this.setHiz(this.getHiz()+a);

    }

    public void yavasla(int a) {
        this.setHiz(this.getHiz()-a);
        if (this.getHiz()<0){
          inisYap();
          dur();
    }
    }

    public void inisYap(){
        setInisKontrol(true);
    }

    public void dur() {
        if (isInisKontrol())
            setHiz(0);
        else
            System.out.println("inmek için iniş yapmış olmalısınız.");

    }

}
