import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args){

        double armut ,elma , domates , muz , patlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut için ne kadar ödediniz ? : ");
        armut = input.nextDouble();
        System.out.print("Elma için ne kadar ödediniz ? : ");
        elma = input.nextDouble();
        System.out.print("Domates için ne kadar ödediniz ? : ");
        domates = input.nextDouble();
        System.out.print("Muz için ne kadar ödediniz ? : ");
        muz = input.nextDouble();
        System.out.print("Patlıcan için ne kadar ödediniz ? : ");
        patlican = input.nextDouble();

        System.out.println("Armut kaç kilo ? : " + armut/2.14);
        System.out.println("Elma kaç kilo ? : " + elma/3.67);
        System.out.println("Domates kaç kilo ? : " + domates/1.11);
        System.out.println("Muz kaç kilo ? : " + muz/0.95);
        System.out.println("Patlıcan kaç kilo ? : " + patlican/5);
        System.out.println("Toplam Tutar : " + (armut+elma+domates+muz+patlican)+ "TL");
    }
}
