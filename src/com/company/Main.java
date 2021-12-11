package com.company;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) throws Exception {

            Food[] breakfast = new Food[20];


            int itemsSoFar = 0;
            for (String arg: args) {
                String[] parts = arg.split("/");
                if (parts[0].equals("Cheese")) {
                    breakfast[itemsSoFar] = new Cheese();
                } else
                if (parts[0].equals("Apple")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                } else
                if(parts[0].equals("Tea")){
                    breakfast[itemsSoFar]=new Tea(parts[1]);
                }
                itemsSoFar++;
            }
            Apple j=new Apple("ma");
            int apples=0;
            Cheese l=new Cheese();
            int Cheeses=0;
            int Teas=0;
            Tea f=new Tea("ma");
            for (Food item: breakfast){
                if (f.equals(item)){
                   Teas++;
                }
                if (l.equals(item)){
                   Cheeses++;
                }
                if (j.equals(item)){
                    apples++;
                }
            }

            System.out.println("Яблок Съедено:  "+apples);
            System.out.println("Стаканов чая выпито: "+Teas);
            System.out.println("Сыра Съедено: "+Cheeses);

            for (Food item: breakfast)
                if (item!=null)
                    item.consume();
                else

                    break;
            System.out.println("Всего хорошего!");
        }
}
