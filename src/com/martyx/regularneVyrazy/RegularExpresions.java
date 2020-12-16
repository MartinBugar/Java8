package com.martyx.regularneVyrazy;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresions {
    public static void main(String[] args) {
       // uvod();
       // prehladavanie();
       // greedyReluctantPossesiveQuantifier();
       // boundaryMathers();
        splitRegex();





        // * 0-n krat
        // + 1-n krat
        // {} kolko krat ma bzt hladana vec vyskytovana sa
        // [] chceme hladat znaky
        // X? hladame x jeden krat alebo vobec
        // X* hladame x nula alebo viac krat
        // X+ hladame X raz alebo viac krat
        // X{n} hladame X n krat
        // X{n,} hladame X najmenej n krat
        // X{n,m} hladame X najmenej n krat ale nie viac ako m krat

        //BOUNDARY MATHERS
        // ^ zaciatok riadku
        // $ koniec riadku
        // \b slovna hranica
        // \B neslovna hranica


        //LOGICKE OPERACIE
        // XY X a za nim Y
        // X|Y X alebo Y
        //  \p{Lower} matchuje to male pismenka
        // \p{Upper} matchuje to velke pismenka


        // CHYBA je PatternSyntaxException
    }

    private static void splitRegex() {
        String regex = ":";
        String text = "jeden:dva:tri:styri:pat";
        Pattern pattern = Pattern.compile(regex);
        String [] items = pattern.split(text);
        for (String s : items){
            System.out.println(s);
        }

//        regex = "\\d";
//        text = "jeden4dva7tri9styri1pat";
//        pattern = Pattern.compile(regex);
//        items = pattern.split(text);
//        for (String s : items){
//            System.out.println(s);
//        }

        String[] s = text.split(regex); // vracia mi pole stringov
        System.out.println(s.length);


        System.out.println("martin".matches("martin"));


        //martin@martin.sk
        //  \w+@\w+\.sk
        regex = "\\w+@\\w+\\.sk";
        System.out.println("martin@martin.sk".matches(regex));

    }

    private static void boundaryMathers() {
       // displayResult("^hus", "Hus sa hra na pozemku"); // na zaciatku vety musi byt hus
      //  displayResult("^hus", "hus sa hra na pozemku"); // na zaciatku vety musi byt hus
       // displayResult("^[hH]us","Hus sa hra na pozemku"); // na zaciatku vety musi byt hus s velkym alebo malym Hh

        displayResult("\\bhus\\b", "Moja hus sa hra na pozemku"); //   \b prve znamena ze to musi byt samostatne slovo, druhe znamena koniec toho slova
        displayResult("\\bhus\\b", "Moja huska sa hra na pozemku");
        displayResult("\\bhus\\B", "Moja hus sa hra na pozemku");
        displayResult("\\bhus\\B", "Moja huska sa hra na pozemku"); //   \ velke B znamena ze to neni samostatne slovo


    }

    private static void greedyReluctantPossesiveQuantifier() {
        System.out.println("greedy");
        displayResult("foo.*bar","xfooxxbarxxxxfooxbarxxxx"); //hladam foo hociaky znak a bar - greedz berie co najvecsi retazec

        System.out.println("reluctant");
        displayResult("foo.*?bar", "xfooxxbarxxxxfooxbarxxxx");//hladam foo hociaky znak a bar - reluctant berie co najkratsi retazec

        System.out.println("possesive");
        displayResult("foo.*+bar","xfooxxbarxxxxfooxbarxxxx"); //  to iste co greedy ale pri vyhladavani sa nevracia naspet

        System.out.println("possesive2");
        displayResult("foo.*+bar","" +
                "fooxbar"); //  to iste co greedy ale pri vyhladavani sa nevracia naspet
    }

    private static void prehladavanie() {
        // displayResult("9*",""); //hladam cislo 9 ktore tam je nula az n krat
        //  displayResult("9*"," a a"); // hladam cislo 9 styri krat
        //  displayResult("9{4}","99999"); // zoberie prvy 4x9 potom to odstrihne a hlada vo zvysku
        // displayResult("[abc]{3}","abccabaaaccbbbc"); // hladam bud a alebo b alebo c 3 krat
    }

    private static void uvod() {
        Pattern pattern = Pattern.compile("[a-zA-z][a-zA-Z]vo");
        Matcher matcher = pattern.matcher("havo");
        System.out.println(matcher.matches());
        System.out.println("---------------------------------");
    }

    public static void displayResult (String p, String text){
        Pattern pattern = Pattern.compile(p); //na zaklade stringu, ktory si skompilujem sa mi vytvori nova instancia triedy pattern
        Matcher matcher = pattern.matcher(text); // zavolany mather mi bude prehladavat text a porovnavat to s paternom

        boolean found = false;
        //ak nebude na konzole nic tak sa nic nestalo

        while (matcher.find()){
            System.out.println("Nasiel som text : " + matcher.group()); //nasiel text ktory sedi patternu a je to tento text
            System.out.println("zaciatok : " + matcher.start()); // zacina na tomto indexe
            System.out.println("koniec : " + matcher.end()); // konci na tomto indexe
            System.out.println("---------------------------");
            found = true;
        }
        if (found == false){
            System.out.println("nic som nenasiel");
            System.out.println("---------------------------------");
        }
    }
}
