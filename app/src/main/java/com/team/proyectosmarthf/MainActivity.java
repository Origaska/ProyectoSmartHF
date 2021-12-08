package com.team.proyectosmarthf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
    private BottomAppBar menu;



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
        menu.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuGuardar:
                        /*Guardar Cambios*/
                        Toast.makeText(MainActivity.this,"minimo "+min+"\nmaximo "+max, Toast.LENGTH_SHORT).show();


                        Toast.makeText(MainActivity.this, "Cambios Aplicados correctamente",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                    Toast.makeText(MainActivity.this, "Cambios No Aplicados correctamente",Toast.LENGTH_SHORT).show();

                }


                return true;
            }
        });
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
        menu = (BottomAppBar) findViewById(R.id.Appmenu);
    }



}