package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView= (RecyclerView)findViewById(R.id.breakfast);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] Breakfast={"Dosa","Idly","Masala Dosa","Onion Dosa","Utappam","Vada","Poori","Carrot Dosa","Special Dosa","Paneer Dosa"};
        recyclerView.setAdapter(new BreakfastAdapter(Breakfast));


    }
}
