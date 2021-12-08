package com.team.proyectosmarthf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private TextView txtporcentaje;
    private TextView txtminimos;
    private TextView txtmaximos;

    private ProgressBar progreso;

    private SeekBar barraMinimos;
    private SeekBar barraMaximos;
    private int min;
    private int max;


    private FloatingActionButton btnActualizar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                actualizar();
            }
        });





        barraMaximos.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtmaximos.setText("maximo: "+progress);
                max = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        barraMinimos.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtminimos.setText("minimo: "+progress);
                min = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_app_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menuGuardar){
            /*Guardar Cambios*/
            Toast.makeText(MainActivity.this,"minimo "+min+"\nmaximo "+max, Toast.LENGTH_SHORT);


            Toast.makeText(this, "Cambios Aplicados correctamente",Toast.LENGTH_SHORT);
        }else{
            Toast.makeText(this, "Cambios No Aplicados correctamente",Toast.LENGTH_SHORT);

        }


        return true;
    }

    private void actualizar() {
        /*Actualizar porcentaje de la base de datos*/

    }

    private void inicializarComponentes(){
        txtminimos = (TextView) findViewById(R.id.txtmin);
        txtmaximos = (TextView) findViewById(R.id.txtmax);
        txtporcentaje = (TextView) findViewById(R.id.textView);
        progreso = (ProgressBar) findViewById(R.id.barraProgreso);
        barraMinimos = (SeekBar) findViewById(R.id.seekBarMinimo);
        barraMaximos = (SeekBar) findViewById(R.id.seekBarMax);
        btnActualizar = (FloatingActionButton) findViewById(R.id.btnRefresh);
    }



}