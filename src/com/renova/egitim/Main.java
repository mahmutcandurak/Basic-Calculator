// MAHMUT CAN DURAK

package com.renova.egitim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int intChoice;
    public static int globalChoice;

    public static double gToplam, gCikarma,gCarpma,gBolme,gMod; // methodlardan dönen değerleri global olarak tutmak için tanımlanan değişkenler.
    public static double hafiza;


    public static void main(String[] args) {
        choose();
    }

    //Kullanıcıya yapmak istediği hesap işlemi seçtirilir.
    public static void choose() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
            menu();

            choice = scanner.nextLine();
            intChoice = Integer.parseInt(choice);
            switch (intChoice) {
                case 1:
                    System.out.println("Toplama işlemi yapılıyor");
                    toplama();
                    globalChoice = intChoice;
                    break;
                case 2:
                    System.out.println("Cikarma işlemi yapılıyor");
                    cikarma();
                    globalChoice = intChoice;
                    break;
                case 3:
                    System.out.println("Carpma işlemi yapılıyor");
                    carpma();
                    globalChoice = intChoice;
                    break;
                case 4:
                    System.out.println("Bölme işlemi yapılıyor");
                    bolme();
                    globalChoice = intChoice;
                    break;
                case 5:
                    System.out.println("Mod işlemi yapılıyor");
                    mod();
                    globalChoice = intChoice;
                    break;
                case 6:
                    System.out.println("Hafızaya alınıyor.");
                    hafiza();
                    break;

                case 7:
                    System.out.println("Hafızadaki işlem yazdırılıyor ve siliniyor.");
                    temizle();
                    break;
            }
        } while (intChoice!=0);
    }

    //hesap makinesinde yapılan işlemleri gösteren menü ekranı.
    private static void menu() {

        String[] Calc = {"[1] Toplama","[2] Çıkarma","[3] Çarpma","[4] Bölme","[5] Mod","[6] Hafızaya al","[7] Hafızadakini Yazdır ve Temizle","[0] Çıkış"};

        for (String x: Calc) {
            System.out.println(x);
        }
    }


    //kullanıcının girdiği sayıları toplayan toplama methodu.
    private static void toplama() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();


        System.out.println("İşlem yapacağınız sayı miktarını giriniz:");
        int miktar = scanner.nextInt();

        for (int i = 0; i< miktar; i++) {
            System.out.println("İşlem yapmak istediğiniz sayiyi giriniz:");
            int input = scanner.nextInt();
            numbers.add((double) input);
        }

        double toplam = 0;
        for (double a: numbers)
            toplam = toplam+a;

        System.out.println("Toplama işlemi sonucu: " + toplam);
        gToplam = toplam;

    }


    //kullanıcının girdiği sayıları çıkartan cikartma methodu.
    private static void cikarma() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();

        System.out.println("İşlem yapacağınız sayı miktarını giriniz:");
        int miktar = scanner.nextInt();

        for (int i = 0; i< miktar; i++) {
            System.out.println("İşlem yapmak istediğiniz sayiyi giriniz:");
            int input = scanner.nextInt();
            numbers.add((double) input);
        }

        double cikarma = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++){
            cikarma = cikarma - numbers.get(i);
        }

        System.out.println(cikarma);
        gCikarma= cikarma;
    }


    //kullanıcının girdiği sayıları çarpan carpma methodu.
    private static void carpma () {
        Scanner scanner = new Scanner(System.in);
        double carpim = 1;
        List<Double> numbers = new ArrayList<>();

        System.out.println("İşlem yapacağınız sayı miktarını giriniz:");
        int miktar = scanner.nextInt();

        for (int i = 0; i< miktar; i++) {
            System.out.println("İşlem yapmak istediğiniz sayiyi giriniz:");
            int input = scanner.nextInt();
            numbers.add((double) input);
        }

        for (int i = 0; i < numbers.size(); i++){
            carpim = carpim * numbers.get(i);
        }

        System.out.println(carpim);
        gCarpma = carpim;
    }


    //kullanıcının girdiği sayıları bölen bolme methodu.
    private static void bolme() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();

        System.out.println("İşlem yapacağınız sayı miktarını giriniz:");
        int miktar = scanner.nextInt();

        for (int i = 0; i< miktar; i++) {
            System.out.println("İşlem yapmak istediğiniz sayiyi giriniz:");
            int input = scanner.nextInt();
            numbers.add((double) input);
        }

        double bolum = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++){
            bolum = bolum / numbers.get(i);
        }

        System.out.println(bolum);
        gBolme = bolum;
    }

    //kullanıcının girdiği sayıların modunu alan mod methodu.
    private static void mod() {

        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();

        System.out.println("İşlem yapacağınız sayı miktarını giriniz:");
        int miktar = scanner.nextInt();

        for (int i = 0; i< miktar; i++) {
            System.out.println("İşlem yapmak istediğiniz sayiyi giriniz:");
            int input = scanner.nextInt();
            numbers.add((double) input);
        }

        double mod = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++){
            mod = mod % numbers.get(i);
        }

        System.out.println(mod);
        gMod = mod;
    }


    //kullanıcının yaptığı son işlemi hafızada tutan hafiza methodu.
    private static void hafiza() {

        switch (globalChoice) {
            case 1:
                System.out.println("en son toplama islemi yapildi. \n");
                hafiza = gToplam;
                break;
            case 2:
                System.out.println("en son cikartma islemi yapildi.\n");
                hafiza = gCikarma;
                break;
            case 3:
                System.out.println("en son carpma islemi yapildi. \n");
                hafiza = gCarpma;
                break;
            case 4:
                System.out.println("en son bolme islemi yapildi.\n");
                hafiza = gBolme;
                break;
            case 5:
                System.out.println("en son mod islemi yapildi. \n");
                hafiza = gMod;
                break;

        }
    }

    //hafızada tutulan işlemi silen temizle methodu.
    private static void temizle() {

        System.out.println("Hafızada tutulan son işlem sonucu :" + hafiza + "\n");

    }

}



