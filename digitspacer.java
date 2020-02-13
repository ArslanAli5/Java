package javaapplication1;

import java.util.Scanner;


class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n1,n2,n3,n4,n5;
        n1 = num%10;
        num = num/10;
        n2 = num%10;
        num = num/10;
        n3 = num%10;
        num = num/10;
        n4 = num%10;
        num = num/10;
        n5 = num%10;
        System.out.printf("%d   %d   %d   %d   %d",n5,n4,n3,n2,n1);
    }
    
}
