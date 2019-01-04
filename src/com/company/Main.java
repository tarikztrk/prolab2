package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        File dosya = new File("tasitlar.txt");
        if (!dosya.exists()) {
            dosya.createNewFile();
        }
        FileWriter fw = new FileWriter(dosya, true);
        BufferedWriter bw = new BufferedWriter(fw);
        File tempdosya = new File("Tasıtlar.txt");
        if (!dosya.exists()) {
            tempdosya.createNewFile();
        }
        FileWriter tempw = new FileWriter(tempdosya, true);
        BufferedWriter tempbw = new BufferedWriter(tempw);
        KaraTasitlari[] karaTasitlaris=new KaraTasitlari[10];
        HavaTasitlari[] havaTasitlaris=new HavaTasitlari[10];
        denizTasiti[] denizTasitis=new denizTasiti[10];
        ucangemi[] ucangemis=new ucangemi[10];


        Scanner sc = new Scanner(System.in);
        int sayi = 0;
       do {
           System.out.println("Yapmak istediğiniz işlemi seçin : ");
           System.out.println("1. veri girişinde bulun ");
           System.out.println("2. veri listele");
           System.out.println("3. veri güncelleme");
           System.out.println("4. çıkış");
           sayi = sc.nextInt();
           switch (sayi) {
               case 1:
                   int sayi2=0;
                   int i=0; //karatasiti sayaç
                   int j=0;//deniz tasiti sayaç
                   int z=0; //hava tasiti sayaç
                   int t=0;//uçan gemi sayaç
                   do {
                       System.out.println("veri girisişinde bulunacağınız aracı secin");
                       System.out.println("1.otomobil");
                       System.out.println("2.bisiklet");
                       System.out.println("3.gemi");
                       System.out.println("4.uçak");
                       System.out.println("5. yürüyen uçak");
                       System.out.println("6.bir önceki menüye dön");
                       System.out.println("7. çıkış");
                       sayi2 = sc.nextInt();
                       switch (sayi2) {
                           case 1:
                               String marka,renk;
                               int tekerlekSayisi,hiz,yolcuSayisi,fiyat,UretimYili;
                               System.out.print("yolcu girin : ");
                               yolcuSayisi=sc.nextInt();
                               System.out.print("hiz girin : ");
                               hiz=sc.nextInt();
                               System.out.print("üretim yili girin : ");
                               UretimYili=sc.nextInt();
                               System.out.print("marka girin : ");
                               marka=sc.next();
                               System.out.print("renk girin : ");
                               renk=sc.next();
                               System.out.print("fiyat girin : ");
                               fiyat=sc.nextInt();
                               System.out.print("tekerlek sayisi girin : ");
                               tekerlekSayisi=sc.nextInt();

                               KaraTasitlari otomobil =new KaraTasitlari(yolcuSayisi,hiz,UretimYili,marka,renk,fiyat,tekerlekSayisi);
                               karaTasitlaris[i]=otomobil;
                               karaTasitlaris[i].ID=arac.üretilenNesne;
                               System.out.println("Ne yapmak istersiniz \n 1. hızlanmak \n 2. yavaslamak \n 3. durmak");
                               int a=sc.nextInt();
                               if (a==1){
                                   System.out.println("hızı ne kadar arttırmak istersiniz : ");
                                   int arttır=sc.nextInt();
                                   otomobil.hizlan(arttır);
                                   System.out.println("yeni hızınız : "+otomobil.getHiz());
                               }
                               if (a==2){
                                   System.out.println("hızı ne kadar azaltmak istersiniz : ");
                                   int azalt=sc.nextInt();
                                   otomobil.hizlan(azalt);
                                   System.out.println("yeni hızınız : "+otomobil.getHiz());
                               }
                               if (a==3){
                                   otomobil.dur();
                                   System.out.println("yeni hızınız : "+otomobil.getHiz());
                               }
                               bw.write("otomobil        ID : "+arac.üretilenNesne+"     Yolcu sayisi : "+otomobil.getYolcuSayisi()+"       Hız : "+otomobil.getHiz()+"       Uretim  yili : "+otomobil.getUretimYili()+"       Marka : "+otomobil.getMarka()+"       Renk : "+otomobil.getRenk()+"       Fiyat : "+otomobil.getFiyat()+"       Tekerlek sayisi : "+otomobil.tekerlekSayisi+"\n");
                               bw.flush();
                               i++;

                               break;

                           case 2:
                               System.out.print("yolcu girin : ");
                               yolcuSayisi=sc.nextInt();
                               System.out.print("hiz girin : ");
                               hiz=sc.nextInt();
                               System.out.print("üretim yili girin : ");
                               UretimYili=sc.nextInt();
                               System.out.print("marka girin : ");
                               marka=sc.next();
                               System.out.print("renk girin : ");
                               renk=sc.next();
                               System.out.print("fiyat girin : ");
                               fiyat=sc.nextInt();
                               System.out.print("tekerlek sayisi girin : ");
                               tekerlekSayisi=sc.nextInt();
                               KaraTasitlari bisiklet =new KaraTasitlari(yolcuSayisi,hiz,UretimYili,marka,renk,fiyat,tekerlekSayisi);
                               karaTasitlaris[i]=bisiklet;
                               karaTasitlaris[i].ID=arac.üretilenNesne;
                               int b=sc.nextInt();
                               if (b==1){
                                   System.out.println("hızı ne kadar arttırmak istersiniz : ");
                                   int arttır=sc.nextInt();
                                   bisiklet.hizlan(arttır);
                                   System.out.println("yeni hızınız : "+bisiklet.getHiz());
                               }
                               if (b==2){
                                   System.out.println("hızı ne kadar azaltmak istersiniz : ");
                                   int azalt=sc.nextInt();
                                   bisiklet.hizlan(azalt);
                                   System.out.println("yeni hızınız : "+bisiklet.getHiz());
                               }
                               if (b==3){
                                   bisiklet.dur();
                                   System.out.println("yeni hızınız : "+bisiklet.getHiz());
                               }
                               bw.write("bisiklet        ID : "+karaTasitlaris[i].ID+"     Yolcu sayisi : "+bisiklet.getYolcuSayisi()+"       Hız : "+bisiklet.getHiz()+"       Uretim  yili : "+bisiklet.getUretimYili()+"       Marka : "+bisiklet.getMarka()+"       Renk : "+bisiklet.getRenk()+"       Fiyat : "+bisiklet.getFiyat()+"       Tekerlek sayisi : "+bisiklet.tekerlekSayisi+"\n");
                               bw.flush();
                               i++;

                               break;
                           case 3:
                               System.out.print("yolcu girin : ");
                               yolcuSayisi=sc.nextInt();
                               System.out.print("hiz girin : ");
                               hiz=sc.nextInt();
                               System.out.print("üretim yili girin : ");
                               UretimYili=sc.nextInt();
                               System.out.print("marka girin : ");
                               marka=sc.next();
                               System.out.print("renk girin : ");
                               renk=sc.next();
                               System.out.print("fiyat girin : ");
                               fiyat=sc.nextInt();
                               denizTasiti gemi =new denizTasiti(yolcuSayisi,hiz,UretimYili,marka,renk,fiyat);
                               denizTasitis[j]=gemi;
                               denizTasitis[j].ID=arac.üretilenNesne;
                               int c=sc.nextInt();
                               if (c==1){
                                   System.out.println("hızı ne kadar arttırmak istersiniz : ");
                                   int arttır=sc.nextInt();
                                   gemi.hizlan(arttır);
                                   System.out.println("yeni hızınız : "+gemi.getHiz());
                               }
                               if (c==2){
                                   System.out.println("hızı ne kadar azaltmak istersiniz : ");
                                   int azalt=sc.nextInt();
                                   gemi.hizlan(azalt);
                                   System.out.println("yeni hızınız : "+gemi.getHiz());
                               }
                               if (c==3){
                                   gemi.dur();
                                   System.out.println("yeni hızınız : "+gemi.getHiz());
                               }
                               bw.write("gemi        ID : "+arac.üretilenNesne+"     Yolcu sayisi : "+gemi.getYolcuSayisi()+"       Hız : "+gemi.getHiz()+"       Uretim  yili : "+gemi.getUretimYili()+"       Marka : "+gemi.getMarka()+"       Renk : "+gemi.getRenk()+"       Fiyat : "+gemi.getFiyat()+"\n");
                               bw.flush();
                               j++;

                               break;
                           case 4:
                               System.out.print("yolcu girin : ");
                               yolcuSayisi=sc.nextInt();
                               System.out.print("hiz girin : ");
                               hiz=sc.nextInt();
                               System.out.print("üretim yili girin : ");
                               UretimYili=sc.nextInt();
                               System.out.print("marka girin : ");
                               marka=sc.next();
                               System.out.print("renk girin : ");
                               renk=sc.next();
                               System.out.print("fiyat girin : ");
                               fiyat=sc.nextInt();
                               System.out.print("tekerlek sayisi girin : ");
                               tekerlekSayisi=sc.nextInt();
                               HavaTasitlari ucak =new HavaTasitlari(yolcuSayisi,hiz,UretimYili,marka,renk,fiyat,tekerlekSayisi);
                               havaTasitlaris[z]=ucak;
                               havaTasitlaris[z].ID=arac.üretilenNesne;
                               int d=sc.nextInt();
                               if (d==1){
                                   System.out.println("hızı ne kadar arttırmak istersiniz : ");
                                   int arttır=sc.nextInt();
                                   ucak.hizlan(arttır);
                                   System.out.println("yeni hızınız : "+ucak.getHiz());
                               }
                               if (d==2){
                                   System.out.println("hızı ne kadar azaltmak istersiniz : ");
                                   int azalt=sc.nextInt();
                                   ucak.hizlan(azalt);
                                   System.out.println("yeni hızınız : "+ucak.getHiz());
                               }
                               if (d==3){
                                   ucak.dur();
                                   System.out.println("yeni hızınız : "+ucak.getHiz());
                               }
                               bw.write("uçak        ID : "+arac.üretilenNesne+"     Yolcu sayisi : "+ucak.getYolcuSayisi()+"       Hız : "+ucak.getHiz()+"       Uretim  yili : "+ucak.getUretimYili()+"       Marka : "+ucak.getMarka()+"       Renk : "+ucak.getRenk()+"       Fiyat : "+ucak.getFiyat()+"       Tekerlek sayisi : "+ucak.tekerlekseyisi+"\n");
                               bw.flush();
                               z++;
                               break;
                           case 5:
                               System.out.print("yolcu girin : ");
                               yolcuSayisi=sc.nextInt();
                               System.out.print("hiz girin : ");
                               hiz=sc.nextInt();
                               System.out.print("üretim yili girin : ");
                               UretimYili=sc.nextInt();
                               System.out.print("marka girin : ");
                               marka=sc.next();
                               System.out.print("renk girin : ");
                               renk=sc.next();
                               System.out.print("fiyat girin : ");
                               fiyat=sc.nextInt();
                               System.out.print("tekerlek sayisi girin : ");
                               tekerlekSayisi=sc.nextInt();
                               ucangemi ucangemicik =new ucangemi(yolcuSayisi,hiz,UretimYili,marka,renk,fiyat);
                               ucangemis[t]=ucangemicik;
                               ucangemis[j].ID=arac.üretilenNesne;
                               int e=sc.nextInt();
                               if (e==1){
                                   System.out.println("hızı ne kadar arttırmak istersiniz : ");
                                   int arttır=sc.nextInt();
                                   ucangemicik.hizlan(arttır);
                                   System.out.println("yeni hızınız : "+ucangemicik.getHiz());
                               }
                               if (e==2){
                                   System.out.println("hızı ne kadar azaltmak istersiniz : ");
                                   int azalt=sc.nextInt();
                                   ucangemicik.hizlan(azalt);
                                   System.out.println("yeni hızınız : "+ucangemicik.getHiz());
                               }
                               if (e==3){
                                   ucangemicik.dur();
                                   System.out.println("yeni hızınız : "+ucangemicik.getHiz());
                               }
                               bw.write("uçangemi        ID : "+arac.üretilenNesne+"     Yolcu sayisi : "+ucangemicik.getYolcuSayisi()+"       Hız : "+ucangemicik.getHiz()+"       Uretim  yili : "+ucangemicik.getUretimYili()+"       Marka : "+ucangemicik.getMarka()+"       Renk : "+ucangemicik.getRenk()+"       Fiyat : "+ucangemicik.getFiyat()+"\n");
                               bw.flush();
                               t++;
                               break;
                           case 7:
                               System.exit(0);

                       }

                   }while (sayi2!=6);
                   break;
               case 2:
                   int sayi3=0;
                   do {
                       System.out.println("listelemek istediğiniz veri tipini seçiniz");
                       System.out.println("1. kara taşıtları");
                       System.out.println("2.deniz taşıtları");
                       System.out.println("3. hava taşıtları");
                       System.out.println("4. uçan gemi");
                       System.out.println("5. önceki menüye geri dön.");
                       System.out.println("6. çıkış");
                      sayi3=sc.nextInt();
                      switch (sayi3){
                          case 1:
                              for (int k = 0; karaTasitlaris[k]!=null ; k++) {
                              System.out.println("karataşıtı        ID : "+karaTasitlaris[k].ID+"     Yolcu sayisi : "+karaTasitlaris[k].getYolcuSayisi()+"       Hız : "+karaTasitlaris[k].getHiz()+"       Uretim  yili : "+karaTasitlaris[k].getUretimYili()+"       Marka : "+karaTasitlaris[k].getMarka()+"       Renk : "+karaTasitlaris[k].getRenk()+"       Fiyat : "+karaTasitlaris[k].getFiyat()+"       Tekerlek sayisi : "+karaTasitlaris[k].tekerlekSayisi);
                          }
                              break;
                          case 2:
                              for (int k = 0; denizTasitis[k]!=null ; k++) {
                                  System.out.println("gemi        ID : "+denizTasitis[k].ID+"     Yolcu sayisi : "+denizTasitis[k].getYolcuSayisi()+"       Hız : "+denizTasitis[k].getHiz()+"       Uretim  yili : "+denizTasitis[k].getUretimYili()+"       Marka : "+denizTasitis[k].getMarka()+"       Renk : "+denizTasitis[k].getRenk()+"       Fiyat : "+denizTasitis[k].getFiyat());
                              }
                              break;
                          case 3:
                              for (int k = 0; havaTasitlaris[k]!=null ; k++) {
                                  System.out.println("ucak        ID : "+havaTasitlaris[k].ID+"     Yolcu sayisi : "+havaTasitlaris[k].getYolcuSayisi()+"       Hız : "+havaTasitlaris[k].getHiz()+"       Uretim  yili : "+havaTasitlaris[k].getUretimYili()+"       Marka : "+havaTasitlaris[k].getMarka()+"       Renk : "+havaTasitlaris[k].getRenk()+"       Fiyat : "+havaTasitlaris[k].getFiyat()+"        Tekerlek sayisi : "+havaTasitlaris[k].tekerlekseyisi);
                              }
                              break;
                          case 4:
                              for (int k = 0; havaTasitlaris[k]!=null ; k++) {
                                  System.out.println("ucangemi        ID : "+ucangemis[k].ID+"     Yolcu sayisi : "+ucangemis[k].getYolcuSayisi()+"       Hız : "+ucangemis[k].getHiz()+"       Uretim  yili : "+ucangemis[k].getUretimYili()+"       Marka : "+ucangemis[k].getMarka()+"       Renk : "+ucangemis[k].getRenk()+"       Fiyat : "+ucangemis[k].getFiyat());
                              }
                              break;
                          case 6:
                              System.exit(0);
                      }
                   }while(sayi3!=5);
                   break;
               case 3:
                   System.out.println("güncellemek istediğiniz taşıt ID girin : ");
                   int id=sc.nextInt();
                   for (int k = 0; karaTasitlaris[k]!=null ; k++) {
                       if (karaTasitlaris[k].ID==id){
                           System.out.print("yolcu girin : ");
                           int yolcuSayisi=sc.nextInt();
                           karaTasitlaris[k].setYolcuSayisi(yolcuSayisi);
                           System.out.print("hiz girin : ");
                           int hiz=sc.nextInt();
                           karaTasitlaris[k].setHiz(hiz);
                           System.out.print("üretim yili girin : ");
                           int UretimYili=sc.nextInt();
                           karaTasitlaris[k].setUretimYili(UretimYili);
                           System.out.print("marka girin : ");
                           String marka=sc.next();
                           karaTasitlaris[k].setMarka(marka);
                           System.out.print("renk girin : ");
                           String renk=sc.next();
                           karaTasitlaris[k].setRenk(renk);
                           System.out.print("fiyat girin : ");
                           int fiyat=sc.nextInt();
                           karaTasitlaris[k].setFiyat(fiyat);
                           System.out.print("tekerlek sayisi girin : ");
                           int tekerlekSayisi=sc.nextInt();
                           karaTasitlaris[k].tekerlekSayisi=tekerlekSayisi;
                       }
                   }
                   for (int k = 0; denizTasitis[k]!=null ; k++) {
                       if (denizTasitis[k].ID==id){
                           System.out.print("yolcu girin : ");
                           int yolcuSayisi=sc.nextInt();
                           denizTasitis[k].setYolcuSayisi(yolcuSayisi);
                           System.out.print("hiz girin : ");
                           int hiz=sc.nextInt();
                           denizTasitis[k].setHiz(hiz);
                           System.out.print("üretim yili girin : ");
                           int UretimYili=sc.nextInt();
                           denizTasitis[k].setUretimYili(UretimYili);
                           System.out.print("marka girin : ");
                           String marka=sc.next();
                           denizTasitis[k].setMarka(marka);
                           System.out.print("renk girin : ");
                           String renk=sc.next();
                           denizTasitis[k].setRenk(renk);
                           System.out.print("fiyat girin : ");
                           int fiyat=sc.nextInt();
                           denizTasitis[k].setFiyat(fiyat);
                           System.out.print("tekerlek sayisi girin : ");

                       }
                   }

                   for (int k = 0; havaTasitlaris[k]!=null ; k++) {
                       if (havaTasitlaris[k].ID==id){
                           System.out.print("yolcu girin : ");
                           int yolcuSayisi=sc.nextInt();
                           havaTasitlaris[k].setYolcuSayisi(yolcuSayisi);
                           System.out.print("hiz girin : ");
                           int hiz=sc.nextInt();
                           havaTasitlaris[k].setHiz(hiz);
                           System.out.print("üretim yili girin : ");
                           int UretimYili=sc.nextInt();
                           havaTasitlaris[k].setUretimYili(UretimYili);
                           System.out.print("marka girin : ");
                           String marka=sc.next();
                           havaTasitlaris[k].setMarka(marka);
                           System.out.print("renk girin : ");
                           String renk=sc.next();
                           havaTasitlaris[k].setRenk(renk);
                           System.out.print("fiyat girin : ");
                           int fiyat=sc.nextInt();
                           havaTasitlaris[k].setFiyat(fiyat);
                           System.out.print("tekerlek sayisi girin : ");
                           int tekerlekSayisi=sc.nextInt();
                           havaTasitlaris[k].tekerlekseyisi=tekerlekSayisi;
                       }
                   }

                   for (int k = 0; ucangemis[k]!=null ; k++) {
                       if (ucangemis[k].ID==id){
                           System.out.print("yolcu girin : ");
                           int yolcuSayisi=sc.nextInt();
                           ucangemis[k].setYolcuSayisi(yolcuSayisi);
                           System.out.print("hiz girin : ");
                           int hiz=sc.nextInt();
                           ucangemis[k].setHiz(hiz);
                           System.out.print("üretim yili girin : ");
                           int UretimYili=sc.nextInt();
                           ucangemis[k].setUretimYili(UretimYili);
                           System.out.print("marka girin : ");
                           String marka=sc.next();
                           ucangemis[k].setMarka(marka);
                           System.out.print("renk girin : ");
                           String renk=sc.next();
                           ucangemis[k].setRenk(renk);
                           System.out.print("fiyat girin : ");
                           int fiyat=sc.nextInt();
                           ucangemis[k].setFiyat(fiyat);

                       }
                   }
                   for (int k = 0; karaTasitlaris[k]!=null ; k++) {
                       tempbw.write("karataşıtı        ID : "+karaTasitlaris[k].ID+"     Yolcu sayisi : "+karaTasitlaris[k].getYolcuSayisi()+"       Hız : "+karaTasitlaris[k].getHiz()+"       Uretim  yili : "+karaTasitlaris[k].getUretimYili()+"       Marka : "+karaTasitlaris[k].getMarka()+"       Renk : "+karaTasitlaris[k].getRenk()+"       Fiyat : "+karaTasitlaris[k].getFiyat()+"       Tekerlek sayisi : "+karaTasitlaris[k].tekerlekSayisi+"\n");
                       tempbw.flush();
                   }
                   for (int k = 0; denizTasitis[k]!=null ; k++) {
                       tempbw.write("gemi        ID : "+denizTasitis[k].ID+"     Yolcu sayisi : "+denizTasitis[k].getYolcuSayisi()+"       Hız : "+denizTasitis[k].getHiz()+"       Uretim  yili : "+denizTasitis[k].getUretimYili()+"       Marka : "+denizTasitis[k].getMarka()+"       Renk : "+denizTasitis[k].getRenk()+"       Fiyat : "+denizTasitis[k].getFiyat()+"\n");
                       tempbw.flush();
                   }
                   for (int k = 0; havaTasitlaris[k]!=null ; k++) {
                       tempbw.write("uçak        ID : "+havaTasitlaris[k].ID+"     Yolcu sayisi : "+havaTasitlaris[k].getYolcuSayisi()+"       Hız : "+havaTasitlaris[k].getHiz()+"       Uretim  yili : "+havaTasitlaris[k].getUretimYili()+"       Marka : "+havaTasitlaris[k].getMarka()+"       Renk : "+havaTasitlaris[k].getRenk()+"       Fiyat : "+havaTasitlaris[k].getFiyat()+"       Tekerlek sayisi : "+havaTasitlaris[k].tekerlekseyisi+"\n");
                       tempbw.flush();
                   }
                   for (int k = 0; ucangemis[k]!=null ; k++) {
                       tempbw.write("ucangemi        ID : "+ucangemis[k].ID+"     Yolcu sayisi : "+ucangemis[k].getYolcuSayisi()+"       Hız : "+ucangemis[k].getHiz()+"       Uretim  yili : "+ucangemis[k].getUretimYili()+"       Marka : "+ucangemis[k].getMarka()+"       Renk : "+ucangemis[k].getRenk()+"       Fiyat : "+ucangemis[k].getFiyat()+"\n");
                       tempbw.flush();
                   }
                   tempdosya.renameTo(dosya);
                   bw.close();
                   dosya.delete();
                    break;






           }
       }while (sayi!=4);



    }
}
