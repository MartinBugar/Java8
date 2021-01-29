package com.martyx.generika;

import java.util.List;

public class UpperBounded {
    public static void main(String[] args) {

    }

    //standardna genericka metoda s obmedzenim
    public static <P extends Number> double sumOfList (List<P> list){
        double s = 0.0;
        for (P elem : list){
            s += elem.doubleValue();
        }
        P i = list.get(1); // vytahujem element s indexom 1
        list.add(i); // vkladam element i typu P - pri wildcard to nejde


        return s;
    }

    //Upperbounded wild card
    // pri taktomto type metody nemozem do kolecie list vkladat nic- takze sa pouziva len pri vytahovani
    public static double sumOfList2(List <? extends Number> list){ // nemusim uvadzat generiku pred navratovy typ
        double s = 0.0;
        for (Number elem : list){
            s += elem.doubleValue();
        }
        return s;
    }
}
