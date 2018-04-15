package com.example.cesarramses.menusublime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lsvMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvMenu=findViewById(R.id.lsvMenu);
        ArrayList<String> artistas=new ArrayList<String>();
        artistas.add("Carvajal en concierto");
        artistas.add("Metallica en concierto");
        artistas.add("Ice Cube en concierto");
        artistas.add("Angus Young en concierto");
        artistas.add("Iron Maiden en concierto");

        //se establece un puente entre el ArrayList y el Listview
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,artistas);
        lsvMenu.setAdapter(adaptador);
    }
}
