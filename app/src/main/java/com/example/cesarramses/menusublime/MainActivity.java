package com.example.cesarramses.menusublime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lsvMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvMenu=findViewById(R.id.lsvMenu);
        ArrayList<String> artistas=new ArrayList<String>();
        artistas.add("Bruno Mars en concierto");
        artistas.add("Metallica en concierto");
        artistas.add("Ice Cube en concierto");
        artistas.add("Angus Young en concierto");
        artistas.add("Iron Maiden en concierto");


        //se establece un puente entre el ArrayList y el Listview
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,artistas);

        //puenteamos el ArrayList con el listview
        lsvMenu.setAdapter(adaptador);

        lsvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent intent=new Intent(getApplicationContext(),ConciertoInfo.class);
                        intent.putExtra("posicion",position);
                        startActivity(intent);
                    break;
                    case 1:

                    break;
                    case 2:

                    break;
                    case 3:

                    break;
                    case 4:

                    break;
                }
                    Toast.makeText(getApplicationContext(),lsvMenu.getItemAtPosition(position)+"",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
