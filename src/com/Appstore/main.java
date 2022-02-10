package com.Appstore;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        projekty projekt = new projekty();
        pracownicy praca= new pracownicy();
        int pracowniksp=0;
        int pralicz=0;
        int nieroblicz= 0;
        boolean podwyko1=false;
        boolean podwyko2=false;
        boolean podwyko3=false;
        boolean uko=false;
        int nndz=1;
        int zarobek=0;
        int dztyg=3;
        int mie=1;
        int rok=2020;
        int ex=0;
        int kasa=1000;
        int prog= 0;
        int sprze= 0;
        int test= 0;
        int projektyl=0;
        boolean zaj=true;
        boolean opoz=false;
        int current=0;
        int zus=2;
        boolean bug=false;
        int wypl=0;
        boolean dzpracy=false;
        boolean za1 = false;
        boolean za2 = false;
        boolean za3 = false;
        boolean za4 = false;
        boolean za5 = false;
        boolean za6 = false;
        boolean za7 = false;
        boolean za8 = false;
        boolean za9 = false;
        boolean za10 = false;
        double progres_front;
        double progres_back;
        double progres_baza;
        double progres_mobile;
        double progres_word;
        double progres_pres;
        int wm=500;
        int wa=500;
        int wp=500;
        int wg=500;
        int klient=5;
        int dzien=1;
        int timer_ogl=0;
        int timer_pro=0;
        boolean oddanie=false;




        int randomNum1 = (int)(Math.random() * 3);
        int randomNum2 = (int)(Math.random() * 3);
        int randomNum3 = (int)(Math.random() * 3);


        System.out.println("Wybierz projekt:");
        System.out.println("1 "+projekt.nazwa[randomNum1]);
        System.out.println("2 "+projekt.nazwa[randomNum2]);
        System.out.println("3 "+projekt.nazwa[randomNum3]);

        String pr = scan.nextLine();


        if(pr.equals("1"))
        {
            System.out.println("Wybrałeś "+projekt.nazwa[randomNum1]);
            current= randomNum1;

        }
        else if(pr.equals("2"))
        {
            System.out.println("Wybrałeś "+projekt.nazwa[randomNum2]);
            current= randomNum2;
        }
        else if(pr.equals("3"))
        {
            System.out.println("Wybrałeś "+projekt.nazwa[randomNum3]);
            current= randomNum3;
        }
        else
        {
            System.out.println("Tak to sobie nie pograsz.");
            ex=1;
        }


        progres_front=projekt.front[current];
        progres_back=projekt.back[current];
        progres_baza=projekt.baza[current];
        progres_mobile=projekt.mobile[current];
        progres_word=projekt.word[current];
        progres_pres=projekt.pres[current];







        while(ex==0)
        {



            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);


            if(dztyg==1)
            {
                System.out.println("Jest poniedziałek");
                dzpracy=true;
            }
            if(dztyg==2)
            {
                System.out.println("Jest wtorek");
                dzpracy=true;
            }
            if(dztyg==3)
            {
                System.out.println("Jest środa");
                dzpracy=true;
            }
            if(dztyg==4)
            {
                System.out.println("Jest czwartek");
                dzpracy=true;
            }
            if(dztyg==5)
            {
                System.out.println("Jest piątek");
                dzpracy=true;
            }
            if(dztyg==6)
            {
                System.out.println("Jest sobota");
                dzpracy=false;
            }
            if(dztyg==7)
            {
                System.out.println("Jest niedziela");
                dzpracy=false;
            }




            if(mie==1) {
                System.out.println(dzien+" Stycznia "+rok);

            }
            if(mie==2) {
                System.out.println(dzien+" Lutego "+rok);

            }
            if(mie==3) {
                System.out.println(dzien+" Marca "+rok);

            }
            if(mie==4) {
                System.out.println(dzien+" Kwietnia "+rok);

            }
            if(mie==5) {
                System.out.println(dzien+" Maja "+rok);

            }
            if(mie==6) {
                System.out.println(dzien+" Czerwca "+rok);

            }
            if(mie==7) {
                System.out.println(dzien+" Lipca "+rok);

            }
            if(mie==8) {
                System.out.println(dzien+" Sierpnia "+rok);

            }
            if(mie==9) {
                System.out.println(dzien+" Września "+rok);

            }
            if(mie==10) {
                System.out.println(dzien+" Października "+rok);

            }
            if(mie==11) {
                System.out.println(dzien+" Listopada "+rok);

            }
            if(mie==12) {
                System.out.println(dzien+" Grudnia "+rok);

            }








            System.out.println("Co robisz");


            System.out.println("1-Nowy projekt");
            System.out.println("2-Szukaj klientów");
            System.out.println("3-Programuj");
            System.out.println("4-Testowanie");
            System.out.println("5-Oddaj gotowy kod");
            System.out.println("6-Zatrudnij");
            System.out.println("7-Zwolnij");
            System.out.println("8-Rozliczenie z ZUS, jeszcze "+zus+" dni w tym miesiącu");
            System.out.println("9-Staty");
            System.out.println("end-Koniec");




            String czynn = scan.nextLine();


            if(czynn.equals("end"))
            {
                ex=1;
            }
            else if(czynn.equals("1"))//nowy projekt
            {
                if(zaj==false) {
                    System.out.println("1-Dla firmy ");
                    System.out.println("2-Dla podwykonawcy ");
                    String jaoni = scan.nextLine();
                    if (jaoni.equals("1")) {
                        System.out.println("Wybierz projekt");

                        int x=0;
                        for(int i=0;i<5;i++)
                        {
                            System.out.println((x+1)+" projekt-"+projekt.nazwa[current]);

                            x++;

                        }
                        String proj1 = scan.nextLine();
                    }
                    if (jaoni.equals("2")) {
                        System.out.println("Wybierz projekt");
                        String proj2 = scan.nextLine();
                    }
                }
                else {
                        System.out.println("Jesteś zajęty projektem");
                    }

            }
            else if(czynn.equals("2"))//szukanie klientów
            {
                System.out.println("1-Szukaj klienta");
                System.out.println("2-cofnij");
                String szuk = scan.nextLine();
                if(szuk.equals("1"))
                {
                    if(randomNum>33)
                    {


                    }
                    if(randomNum>66)
                    {


                    }
                    if(randomNum<33)
                    {


                    }
                    System.out.println("Znalazłeś klienta");
                    System.out.println(" ");

                }

                if(szuk.equals("3"))
                {
                    dzien--;
                    dztyg--;
                }

            }
            else if(czynn.equals("3"))//programowanie
            {
                nieroblicz= 0;
                if(uko==true)
                {
                    System.out.println("Projekt Ukończony");
                dzien--;
                dztyg--;
                }
                else
                {
                    progres_front = progres_front - 50;
                    progres_back = progres_back - 50;
                    progres_baza = progres_baza - 50;
                    progres_word = progres_word - 50;
                    progres_pres = progres_pres - 50;
                }

            }
            else if(czynn.equals("4"))//testowanie
            {
                nieroblicz= 0;
                if (uko==true)
                {
                     if(bug==false)
                     {
                         System.out.println("Można wysyłać");
                     }
                     else
                     {
                         System.out.println("Do poprawy");
                         if(projekt.front[current]>0)
                         {
                             progres_front=progres_front+50;

                         }
                         if(projekt.back[current]>0)
                         {
                             progres_back=progres_back+50;

                         }
                         if(projekt.baza[current]>0)
                         {
                             progres_baza=progres_baza+50;

                         }
                         if(projekt.mobile[current]>0)
                         {
                             progres_mobile=progres_mobile+50;

                         }
                         if(projekt.word[current]>0)
                         {
                             progres_word=progres_word+50;

                         }
                         if(projekt.pres[current]>0)
                         {
                             progres_pres=progres_pres+50;

                         }

                     }
                }
                else
                {
                    System.out.println("Projekt nieukończony");
                }


            }
            else if(czynn.equals("5"))//oddanie kodu
            {
                if (uko==true&&zaj == true)
                {

                    zaj = false;
                    oddanie=true;
                    int losowanie = (int)(Math.random() * 101);
                    if(opoz==false)
                    {

                        if(projekt.klient[current]=="wyluzowany") {

                            if(losowanie>70)
                            {
                                System.out.println("Zapłata opóźniona o tydzień ");
                                if(projekt.poziom[current]=="duży")
                                {
                                    nieroblicz++;
                                }
                            }
                            else
                            {
                                kasa = kasa + projekt.zar[current];
                                zarobek = zarobek + projekt.zar[current] / 10;
                                System.out.println("Zarobiłeś "+projekt.zar[current]);
                                if(projekt.poziom[current]=="duży")
                                {
                                    nieroblicz++;
                                }
                            }

                        }

                        if(bug==true)

                        {
                            if(projekt.klient[current]=="wymagający"&&losowanie>50) {

                                kasa = kasa + projekt.zar[current];
                                zarobek = zarobek + projekt.zar[current] / 10;
                                System.out.println("Zarobiłeś "+projekt.zar[current]);
                            }
                            if(projekt.klient[current]=="wymagający"&&losowanie<=50) {

                                System.out.println("Nie działa to nie płacę ");
                            }
                            if(projekt.klient[current]=="skrwy") {

                                System.out.println("Jak nie działa to mie płacę");
                            }
                        }
                        if(bug==false)
                        {

                            if(projekt.klient[current]=="wymagający") {

                                kasa = kasa + projekt.zar[current];
                                zarobek = zarobek + projekt.zar[current] / 10;
                                System.out.println("Zarobiłeś "+projekt.zar[current]);
                                if(projekt.poziom[current]=="duży")
                                {
                                    nieroblicz++;
                                }
                            }
                            if(projekt.klient[current]=="skrwy") {

                                if(losowanie>70&&losowanie<95)
                                {
                                    System.out.println("Zapłata opóźniona o tydzień ");
                                    if(projekt.poziom[current]=="duży")
                                    {
                                        nieroblicz++;
                                    }

                                }
                                if(losowanie>95&&losowanie>100)
                                {
                                    System.out.println("Zapłata opóźniona o miesiąc ");
                                    if(projekt.poziom[current]=="duży")
                                    {
                                        nieroblicz++;
                                    }
                                }
                                if(losowanie==100)
                                {
                                    System.out.println("Może kiedyś ");
                                }

                            }
                        }
                    }
                    if(opoz==true)
                    {

                        if(losowanie>80)
                        {

                            if(projekt.klient[current]=="wyluzowany") {

                                if(losowanie>70)
                                {
                                    System.out.println("Zapłata opóźniona o tydzień ");
                                }
                                else
                                {
                                    kasa = kasa + projekt.zar[current];
                                    zarobek = zarobek + projekt.zar[current] / 10;
                                    System.out.println("Zarobiłeś "+projekt.zar[current]);
                                }

                            }
                        }
                        else
                        {

                            if(projekt.klient[current]=="wyluzowany") {

                                if(losowanie>70)
                                {
                                    System.out.println("Zapłata opóźniona o tydzień ");
                                }
                                else
                                {
                                    kasa = kasa + projekt.zar[current]-projekt.kara[current];
                                    zarobek = zarobek + projekt.zar[current] / 10;
                                    System.out.println("Zarobiłeś "+projekt.zar[current]+" ale płacisz karę "+projekt.kara[current]);
                                }

                            }
                        }

                        if(bug==true)

                        {
                            if(projekt.klient[current]=="wymagający"&&losowanie>50) {

                                kasa = kasa + projekt.zar[current]-projekt.kara[current];
                                zarobek = zarobek + projekt.zar[current] / 10;
                                System.out.println("Zarobiłeś "+projekt.zar[current]+" ale płacisz karę "+projekt.kara[current]);
                            }
                            if(projekt.klient[current]=="wymagający"&&losowanie<=50) {

                                System.out.println("Nie działa to nie płacę ");
                            }
                            if(projekt.klient[current]=="skrwy") {

                                System.out.println("Jak nie działa to mie płacę");
                            }
                        }
                        if(bug==false)
                        {
                            if(projekt.klient[current]=="wymagający") {

                                kasa = kasa + projekt.zar[current]-projekt.kara[current];
                                zarobek = zarobek + projekt.zar[current] / 10;
                                System.out.println("Zarobiłeś "+projekt.zar[current]+" ale płacisz karę "+projekt.kara[current]);
                            }
                            if(projekt.klient[current]=="skrwy") {

                                if(losowanie>70&&losowanie<95)
                                {
                                    System.out.println("Zapłata opóźniona o tydzień ");
                                }
                                if(losowanie>95&&losowanie>100)
                                {
                                    System.out.println("Zapłata opóźniona o miesiąc ");
                                }
                                if(losowanie==100)
                                {
                                    System.out.println("Może kiedyś ");
                                }

                            }
                        }
                    }
                }
                if(uko==false&&zaj == true)
                {
                    System.out.println("Nie ma czego oddawać ");
                }


            }
            else if(czynn.equals("6"))//zatrudnianie
            {
                System.out.println("Mam "+prog+" programistów");
                System.out.println("Mam "+sprze+" sprzedawców");
                System.out.println("Mam "+test+" testerów");

                System.out.println("Co robisz");
                System.out.println("1-Zobacz aplikantów");
                System.out.println("2-cofnij");
                String zatr = scan.nextLine();

                if(zatr.equals("1"))
                {
                    System.out.println("Zatrudnij aplikanta (opłata wynagrodzenia z góry) ");
                    int contr=1;

                    if(za1 ==false)
                    {
                        System.out.println("1-Marek front-end-"+praca.Marek[0]+", backend-"+praca.Marek[1]+", bazy danych-"+praca.Marek[2]+", mobile-"+praca.Marek[3]+", wordpress-"+praca.Marek[4]+", prestashop-"+praca.Marek[5]+", wynagrodzenie-"+praca.Marek[6]);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Marka");
                    }
                    if(za2 ==false)
                    {
                        System.out.println("2-Marcin front-end-"+praca.Marcin[0]+", backend-"+praca.Marcin[1]+", bazy danych-"+praca.Marcin[2]+", mobile-"+praca.Marcin[3]+", wordpress-"+praca.Marcin[4]+", prestashop-"+praca.Marcin[5]+", wynagrodzenie-"+praca.Marcin[6]);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Marcina");
                    }
                    if(za3 ==false)
                    {
                        System.out.println("3-Jan front-end-"+praca.Jan[0]+", backend-"+praca.Jan[1]+", bazy danych-"+praca.Jan[2]+", mobile-"+praca.Jan[3]+", wordpress-"+praca.Jan[4]+", prestashop-"+praca.Jan[5]+", wynagrodzenie-"+praca.Jan[6]);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Jana");
                    }
                    if(za4 ==false)
                    {
                        System.out.println("4-Sławek front-end-"+praca.Sławek[0]+", backend-"+praca.Sławek[1]+", bazy danych-"+praca.Sławek[2]+", mobile-"+praca.Sławek[3]+", wordpress-"+praca.Sławek[4]+", prestashop-"+praca.Sławek[5]+", wynagrodzenie-"+praca.Sławek[6]);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Sławka");
                    }
                    if(za5 ==false)
                    {
                        System.out.println("5-Kamil front-end-"+praca.Kamil[0]+", backend-"+praca.Kamil[1]+", bazy danych-"+praca.Kamil[2]+", mobile-"+praca.Kamil[3]+", wordpress-"+praca.Kamil[4]+", prestashop-"+praca.Kamil[5]+", wynagrodzenie-"+praca.Kamil[6]);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Kamila");
                    }
                    if(za6 ==false)
                    {
                        System.out.println("6-Adam front-end-"+praca.Adam[0]+", backend-"+praca.Adam[1]+", bazy danych-"+praca.Adam[2]+", mobile-"+praca.Adam[3]+", wordpress-"+praca.Adam[4]+", prestashop-"+praca.Adam[5]+", wynagrodzenie-"+praca.Adam[6]);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Adama");
                    }
                    if(za7 ==false)
                    {
                        System.out.println("7-Magda-Testerka, wynagrodzenie-"+wm);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Magdę");
                    }
                    if(za8 ==false)
                    {
                        System.out.println("8-Asia-Testerka wynagrodzenie-"+wa);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Asię");
                    }
                    if(za9 ==false)
                    {
                        System.out.println("9-Piotr-Sprzedawca wynagrodzenie-"+wp);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Piotra");
                    }
                    if(za10 ==false)
                    {
                        System.out.println("10-Gabriel-Sprzedawca wynagrodzenie-"+wg);

                    }
                    else
                    {
                        System.out.println("Zatrudniasz Gabriela");
                    }
                    System.out.println("11-Cofnij");

                    String apl = scan.nextLine();

                    if(apl.equals("1"))
                    {

                        if(za1 ==false)
                        {
                            za1 = true;
                            kasa = kasa - praca.Marek[6];
                            wypl=wypl+praca.Marek[6];
                            prog++;
                        }
                    }
                    if(apl.equals("2"))
                    {
                        if(za2 ==false){
                        za2 =true;
                        kasa=kasa-praca.Marcin[6];
                        wypl=wypl+praca.Marcin[6];}
                        prog++;
                    }
                    if(apl.equals("3"))
                    {
                        if(za3 ==false){
                        za3 =true;
                        kasa=kasa-praca.Jan[6];
                            wypl=wypl+praca.Jan[6];}
                        prog++;
                    }
                    if(apl.equals("4"))
                    {
                        if(za4 ==false){
                        za4 =true;
                        kasa=kasa-praca.Sławek[6];
                            wypl=wypl+praca.Sławek[6];}
                        prog++;
                    }
                    if(apl.equals("5"))
                    {
                        if(za5 ==false){
                        za5 =true;
                        kasa=kasa-praca.Kamil[6];
                            wypl=wypl+praca.Kamil[6];}
                        prog++;
                    }
                    if(apl.equals("6"))
                    {
                        if(za6 ==false){
                        za6 =true;
                        kasa=kasa-praca.Adam[6];
                            wypl=wypl+praca.Adam[6];}
                        prog++;
                    }
                    if(apl.equals("7"))
                    {
                        if(za7 ==false) {
                            za7 = true;
                            kasa = kasa - wm;
                            wypl=wypl+wm;
                            test++;
                        }
                    }
                    if(apl.equals("8"))
                    {
                        if(za8 ==false) {
                            za8 = true;
                            kasa = kasa - wa;
                            wypl=wypl+wa;
                            test++;
                        }
                    }
                    if(apl.equals("9"))
                    {
                        if(za9==false) {
                            za9 = true;
                            kasa = kasa - wp;
                            wypl=wypl+wp;
                            sprze++;
                        }
                    }
                    if(apl.equals("10"))
                    {
                        if(za10 ==false) {
                            za10 = true;
                            kasa = kasa - wg;
                            wypl=wypl+wg;
                            sprze++;

                        }
                    }
                    if(apl.equals("11"))
                    {
                        dzien--;
                        dztyg--;
                    }


                }
                if(zatr.equals("2"))
                {
                    dzien--;
                    dztyg--;
                }

            }
            else if(czynn.equals("7"))//zwalnianie
            {
                System.out.println("Przy zwolnieniu wypłacasz dodadkowo całość wypłaty");
                if(za1==true)
                {
                    System.out.println("1-Zwolnij Marka");

                }
                if(za2==true)
                {
                    System.out.println("2-Zwolnij Marcina");

                }
                if(za3==true)
                {
                    System.out.println("3-Zwolnij Jana");

                }
                if(za4==true)
                {
                    System.out.println("4-Zwolnij Sławka");

                }
                if(za5==true)
                {
                    System.out.println("5-Zwolnij Kamila");

                }
                if(za6==true)
                {
                    System.out.println("6-Zwolnij Adama");

                }
                if(za7==true)
                {
                    System.out.println("7-Zwolnij Magdę");

                }
                if(za8==true)
                {
                    System.out.println("8-Zwolnij Asię");

                }
                if(za9==true)
                {
                    System.out.println("9-Zwolnij Piotra");

                }
                if(za10==true)
                {
                    System.out.println("10-Zwolnij Gabriela");

                }

                String zwo = scan.nextLine();

                 if(zwo.equals("1")&&za1==true)
                 {
                     kasa=kasa-praca.Marek[6];
                     za1=false;
                 }
                if(zwo.equals("2")&&za2==true)
                {
                    kasa=kasa-praca.Marcin[6];
                    za2=false;
                }
                if(zwo.equals("3")&&za3==true)
                {
                    kasa=kasa-praca.Jan[6];
                    za3=false;
                }
                if(zwo.equals("4")&&za4==true)
                {
                    kasa=kasa-praca.Sławek[6];
                    za4=false;
                }
                if(zwo.equals("5")&&za5==true)
                {
                    kasa=kasa-praca.Kamil[6];
                    za5=false;
                }
                if(zwo.equals("6")&&za6==true)
                {
                    kasa=kasa-praca.Adam[6];
                    za6=false;
                }
                if(zwo.equals("7")&&za7==true)
                {
                    kasa=kasa-wm;
                    za7=false;
                    test--;
                }
                if(zwo.equals("8")&&za8==true)
                {
                    kasa=kasa-wa;
                    za8=false;
                    test--;
                }
                if(zwo.equals("9")&&za9==true)
                {
                    kasa=kasa-wp;
                    za9=false;
                    sprze--;
                }
                if(zwo.equals("10")&&za10==true)
                {
                    kasa=kasa-wg;
                    za10=false;
                    sprze--;
                }



            }
            else if(czynn.equals("8"))//Zus
            {
                if(zus==0)
                {
                    System.out.println("Mam spokuj w tym miesiącu");
                    dzien--;
                    dztyg--;
                }
                else
                {
                    zus--;
                    System.out.println("Dzień w plecy");
                }



            }
            else if(czynn.equals("9"))//staty
            {

                System.out.println();
                System.out.println("Mam "+kasa+"zł");
                System.out.println("Mam "+prog+" programistów");
                System.out.println("Mam "+sprze+" sprzedawców");
                System.out.println("Mam "+test+" testerów");
                System.out.println("Mam "+klient+" klientów");
                System.out.println("Mam "+projektyl+" projektów");
                System.out.println("Wypłacam "+wypl+" miesięcznie");

                System.out.println("Front ma  "+progres_front+" na "+ projekt.front[current]);
                System.out.println("Back ma  "+progres_back+" na "+ projekt.back[current]);
                System.out.println("Baza ma  "+progres_baza+" na "+ projekt.baza[current]);
                System.out.println("Mobile ma  "+progres_mobile+" na "+ projekt.mobile[current]);
                System.out.println("Word ma  "+progres_word+" na "+ projekt.word[current]);
                System.out.println("Pres ma  "+progres_pres+" na "+ projekt.pres[current]);

                dzien--;
                dztyg--;
            }
            else
            {
                dzien--;
                dztyg--;
            }




            //naliczanie postępu

            if(dzpracy==true) {
                pralicz=0;

                if (za1 == true) {
                    progres_front = progres_front - praca.Marek[0];
                    progres_back = progres_back - praca.Marek[1];
                    progres_baza = progres_baza - praca.Marek[2];
                    progres_mobile = progres_mobile - praca.Marek[3];
                    progres_word = progres_word - praca.Marek[4];
                    progres_pres = progres_pres - praca.Marek[5];
                    pralicz++;
                }
                if (za2 == true) {
                    progres_front = progres_front - praca.Marcin[0];
                    progres_back = progres_back - praca.Marcin[1];
                    progres_baza = progres_baza - praca.Marcin[2];
                    progres_mobile = progres_mobile - praca.Marcin[3];
                    progres_word = progres_word - praca.Marcin[4];
                    progres_pres = progres_pres - praca.Marcin[5];
                    pralicz++;
                }
                if (za3 == true) {
                    progres_front = progres_front - praca.Jan[0];
                    progres_back = progres_back - praca.Jan[1];
                    progres_baza = progres_baza - praca.Jan[2];
                    progres_mobile = progres_mobile - praca.Jan[3];
                    progres_word = progres_word - praca.Jan[4];
                    progres_pres = progres_pres - praca.Jan[5];
                    pralicz++;
                }
                if (za4 == true) {
                    progres_front = progres_front - praca.Sławek[0];
                    progres_back = progres_back - praca.Sławek[1];
                    progres_baza = progres_baza - praca.Sławek[2];
                    progres_mobile = progres_mobile - praca.Sławek[3];
                    progres_word = progres_word - praca.Sławek[4];
                    progres_pres = progres_pres - praca.Sławek[5];
                    pralicz++;
                }
                if (za5 == true) {
                    progres_front = progres_front - praca.Kamil[0];
                    progres_back = progres_back - praca.Kamil[1];
                    progres_baza = progres_baza - praca.Kamil[2];
                    progres_mobile = progres_mobile - praca.Kamil[3];
                    progres_word = progres_word - praca.Kamil[4];
                    progres_pres = progres_pres - praca.Kamil[5];
                    pralicz++;
                }
                if (za6 == true) {
                    progres_front = progres_front - praca.Adam[0];
                    progres_back = progres_back - praca.Adam[1];
                    progres_baza = progres_baza - praca.Adam[2];
                    progres_mobile = progres_mobile - praca.Adam[3];
                    progres_word = progres_word - praca.Adam[4];
                    progres_pres = progres_pres - praca.Adam[5];
                    pralicz++;
                }

                if(za9==true)
                {
                    projektyl++;
                }
                if(za9==true)
                {
                    projektyl++;
                }

            }
            //spr gotowości
            if(
            progres_front<=0&&
            progres_back <=0&&
            progres_baza <=0&&
            progres_mobile <=0&&
            progres_word <=0&&
            progres_pres <=0
            )
            {

                uko=true;
            }


            //testerzy
            if(prog<=3&&test==1)
            {
                if (uko==true)
                {
                    if(bug==false)
                    {
                        System.out.println("Można wysyłać");
                    }
                    else
                    {
                        System.out.println("Do poprawy");
                        if(projekt.front[current]>0)
                        {
                            progres_front=progres_front+50;

                        }
                        if(projekt.back[current]>0)
                        {
                            progres_back=progres_back+50;

                        }
                        if(projekt.baza[current]>0)
                        {
                            progres_baza=progres_baza+50;

                        }
                        if(projekt.mobile[current]>0)
                        {
                            progres_mobile=progres_mobile+50;

                        }
                        if(projekt.word[current]>0)
                        {
                            progres_word=progres_word+50;

                        }
                        if(projekt.pres[current]>0)
                        {
                            progres_pres=progres_pres+50;

                        }

                    }
                }
            }
            if(prog<=6&&test==2)
            {
                if (uko==true)
                {
                    if(bug==false)
                    {
                        System.out.println("Można wysyłać");
                    }
                    else
                    {
                        System.out.println("Do poprawy");
                        if(projekt.front[current]>0)
                        {
                            progres_front=progres_front+50;

                        }
                        if(projekt.back[current]>0)
                        {
                            progres_back=progres_back+50;

                        }
                        if(projekt.baza[current]>0)
                        {
                            progres_baza=progres_baza+50;

                        }
                        if(projekt.mobile[current]>0)
                        {
                            progres_mobile=progres_mobile+50;

                        }
                        if(projekt.word[current]>0)
                        {
                            progres_word=progres_word+50;

                        }
                        if(projekt.pres[current]>0)
                        {
                            progres_pres=progres_pres+50;

                        }

                    }
                }
            }





            if(timer_ogl>0)
            {
                timer_ogl--;
            }


            if(projektyl==6)//limit projektów
            {
                projektyl--;
            }

            dzien++;

            dztyg++;
            if(dztyg==8)
            {
                dztyg=1;
            }

            // zmiana miesiąca + zus + opłaty
            if(mie==1&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=2;
                zus=2;
            }
            if(mie==2&&dzien==29&&rok%4!=0)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=3;
                zus=2;
            }
            if(mie==2&&dzien==30&&rok%4==0)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=3;
                zus=2;
            }
            if(mie==3&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=4;
                zus=2;
            }
            if(mie==4&&dzien==31)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=5;
                zus=2;
            }
            if(mie==5&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=6;
                zus=2;
            }
            if(mie==6&&dzien==31)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=7;
                zus=2;
            }
            if(mie==7&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=8;
                zus=2;
            }
            if(mie==8&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=9;
                zus=2;
            }
            if(mie==9&&dzien==31)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=10;
                zus=2;
            }
            if(mie==10&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=11;
                zus=2;
            }
            if(mie==11&&dzien==31)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=12;
                zus=2;
            }
            if(mie==11&&dzien==32)
            {
                if(zus!=0)
                {
                    System.out.println("Skarbówka zamyka ci firmę");
                    break;
                }
                kasa=kasa-zarobek;
                zarobek=0;
                kasa=kasa-wypl;
                if(kasa<1)
                {
                    System.out.println("Jesteś nie wypłacalny");
                    break;
                }
                dzien=1;
                mie=1;
                rok++;
                zus=2;

            }
            zarobek=0;

            //koniec gry
            if(pracowniksp<0)
            {pracowniksp=0;}
            pracowniksp=pracowniksp-1;
            if(kasa>=10000&&nieroblicz>=3&&pracowniksp>=1)
            {
                System.out.println("Wygrałeś");
                break;
            }
            if(oddanie==true)
            {
                pracowniksp=pracowniksp-1;
            }


        }


    }
}

