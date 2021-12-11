package com.company;

public class Tea extends Food{
    String color;
    public Tea(String color){
        super("Чай");
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void consume(){
        System.out.println(this +" Выпит");
    }
    public String toString(){
        return super.toString()+" Цвета "+color;
    }


}
