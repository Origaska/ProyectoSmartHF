package com.team.proyectosmarthf.modelo;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ConnectionDB {

    private DatabaseReference dbref;
    private Tabla valores;



    public void iniciarConexion (Context cntx){
        FirebaseApp.initializeApp(cntx);
        dbref = FirebaseDatabase.getInstance().getReference();
        DatabaseReference ref = dbref.child("Usuario1");
        ref.child("arduino1").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                valores = snapshot.getValue(Tabla.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {}
        });
    }

    public void setValues(Tabla datos){
        dbref.child("Usuario1").child(datos.getId()).setValue(datos);
    }

    public Tabla getValues(String id){
        return valores;
    }



}
