import java.util.Scanner;

public class DikÜcgendeAlanHesaplama {
    public static void main(String[] args) {
        int a,b,c,u,cevre,hesap;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenarı giriniz:");
        a = input.nextInt();
        System.out.print("2. kenarı giriniz:");
        b = input.nextInt();
        System.out.print("3. kenarı giriniz:");
        c = input.nextInt();
        u = (a+b+c)/2;
        cevre = 2*u;
        hesap = u * (u-a)* (u-b) * (u-c);
        alan = Math.sqrt(hesap);
        System.out.println("Alan: " + alan);
