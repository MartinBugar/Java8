package com.martyx;

public class Numbers {
    public static void main(String[] args) {
       // basic();
       // modulo();
       // basicMathOperations();
        randomNumbers();
    }

    private static void modulo() {
        for (int i = 0; i < 32; i++){
            rozdajHracoviKartu(i%4, i);
        }
    }

    private static void rozdajHracoviKartu (int hrac, int karta){
        System.out.println("rozdavam hracovi " + hrac + ". kartu cislo " + karta);
    }

    private static void basic() {
        Byte b = 127;
       // Byte b2 = 128; max 127 moze byt

        int ji = b.intValue();//integerova hodnota b
        System.out.println(ji);

        String decimal = "2.5";
        double d = Double.parseDouble(decimal); //premeni string na double
        System.out.println(d);


    }

    private static void basicMathOperations() {

        double a = -191.635;
        double b = 43.24;
        int c = 16;
        int d = 45;

        System.out.println(Math.PI);
        System.out.println( "a : " + a + ", abs a = " + Math.abs(a));
        System.out.println("b : " + b + ", ceil b : " + Math.ceil(b));
        System.out.println("b : " + b + ", floor b : " + Math.floor(b));
        System.out.println("b : " + b + ", rint b : " + Math.rint(b)); // klasicke zaokruhlovanie - vracia double hodnotu intu
        System.out.println("b : " +b+", round b : "+ Math.round(b)); // klasicke zaokruhlovanie - vracia int alebo long
        System.out.println("c : " + c + " a d : " + d + ", max hodnota je : " + Math.max(c , d));
        System.out.println("c : " + c + " a d : " + d + ", min hodnota je : " + Math.min (c , d));
    }

    private static void randomNumbers(){
        int number = (int) (Math.random() * 10); // hodnota od 0 po 1 / preto nasobime
        System.out.println(number);
    }

    public static void vypis () {
        System.out.println("ahoj som staticka");
    }

}
