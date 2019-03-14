package com.htf.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }else if(position==1){
                    CharSequence sequence="Oops! Food is currently unavailable";
                    int time= Toast.LENGTH_SHORT;

                    Toast toast=Toast.makeText(TopLevelActivity.this, sequence, time);
                    toast.show();
                }else if(position==2){
                    CharSequence sequence="Oops! Stores are currently unavailable";
                    int duration=Toast.LENGTH_SHORT;
                    Toast toast=Toast.makeText(TopLevelActivity.this, sequence,duration);
                    toast.show();
                }
            }
        };
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setOnItemClickListener(itemClickListener);
    }
}
