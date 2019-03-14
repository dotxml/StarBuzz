package com.htf.starbuzz;

public class Drink
{

    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks={
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.coffee_type1),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",R.drawable.coffee_type2),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",R.drawable.coffee_type3)


    };
    private Drink(String name, String description, int imageResourceId){
        this.name=name;
        this.description=description;
        this.imageResourceId=imageResourceId;

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;

    }

    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
