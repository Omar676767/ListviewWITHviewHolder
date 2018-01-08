package com.example.hp.listviewwithviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<UserInfo> list = new ArrayList<UserInfo>();
    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 100; i++) {
            list.add(new UserInfo("omar"+i,"0324663473"+i));
        }

        listview = (ListView) findViewById(R.id.contactsList);
        listview.setAdapter(new CustomAdapter(this,list));
    }


}
