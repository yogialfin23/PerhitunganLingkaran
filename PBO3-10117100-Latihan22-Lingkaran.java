package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Double diameter, r, l, k;
	String d;

	Scanner sc = new Scanner(System.in);

        System.out.println("=====Perhitungan Lingkaran=====");

       do{
           System.out.print("Masukkan Nilai Diameter : ");
           d = sc.nextLine();

           System.out.println((!d.matches("[0-9]*"))
                   ?"Nilai Diameter Tidak Sesuai\n":"");
       } while (d.matches("0-9*"));

           System.out.println("\n======Hasil Perhitungan Lingkaran======");
            diameter = Double.parseDouble(d);
            r = diameter/2;
            System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
            l = Math.PI*r*r;
            System.out.printf("Luas Lingkaran = %.2f cm %n",l);
            k = 2*Math.PI*r;
            System.out.printf("Keliling Lingkaran = %.2f cm %n",k);

        }

    }

