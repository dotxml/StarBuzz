package com.htf.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO="drinkno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkno=(Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink= Drink.drinks[drinkno];

        ImageView photo=(ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getDescription());

        TextView name=(TextView)findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description =(TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
