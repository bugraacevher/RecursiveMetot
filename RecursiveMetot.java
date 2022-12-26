package Giris;

import java.util.Scanner;

public class RecursiveMetot {
    static int metot (int number,int tempNumber, int stop){
        if (number > 0){
            System.out.print(number + " ");
            return metot(number - 5,tempNumber - 5,stop);
        }
        if (tempNumber <= stop) {
            System.out.print(tempNumber + " ");
            return metot(number, tempNumber + 5, stop);
        }
        return stop;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.println("N sayisi : ");
            number = input.nextInt();
            metot(number,number,number);
            System.out.println();
        }while (number>0);
    }
}
