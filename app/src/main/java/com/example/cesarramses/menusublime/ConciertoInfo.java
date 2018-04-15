package com.example.cesarramses.menusublime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ConciertoInfo extends AppCompatActivity {
    ImageView imgArtista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concierto_info);
        imgArtista=findViewById(R.id.imgArtista);

        //se obtinen los parametros del intent
        Intent intent=getIntent();
        int indiceArtista=intent.getIntExtra("posicion",-1);

        //se eavalua cual artiste debemos mostrar
        switch (indiceArtista){
            case 0:
                imgArtista.setImageResource(R.drawable.img14);
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
    }
}
