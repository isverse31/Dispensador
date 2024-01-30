package com.example.dispensador;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class Interfaz extends AppCompatActivity {


    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz);


        CardView cardView1 = findViewById(R.id.cardView1);
        CardView cardView2 = findViewById(R.id.cardView2);
        CardView cardView4 = findViewById(R.id.cardView4);
        CardView cardView3 = findViewById(R.id.cardView3);

        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Manejar el clic de la imagen 1
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Manejar el clic de la imagen 2
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Manejar el clic de la imagen 3
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Manejar el clic de la imagen 4
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.Compartir) {
            // Manejar clic en la opción de compartir
            return true;
        } else if (itemId == R.id.Admin) {
            // Manejar clic en la opción de administración
            return true;
        }
        // Puedes agregar más condiciones según tus necesidades

        // Si no coincide con ninguna opción conocida, llama al método en la superclase
        return super.onOptionsItemSelected(item);
    }

}
