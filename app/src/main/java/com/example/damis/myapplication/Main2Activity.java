package com.example.damis.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        ListView lista = (ListView) findViewById(R.id.listView);

        Student[] st = {
                new Student("Lukasz", "Jakis"),
                new Student("Ricotta", "Frycz"),
                new Student("Jan", "Kowalski"),
                new Student("Adrian", "Nowak"),
        };

        ArrayAdapter<Student> adapter;
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.addAll(Arrays.asList(st));
        adapter = new ArrayAdapter<Student>(this, R.layout.one_student, studenci);
        lista.setAdapter(adapter);

        Button btn = new Button(getApplicationContext());
        onClick(btn);
    }


    public void onClick(View v){
        final int id = v.getId();

        switch(id) {
            case R.id.button2:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
