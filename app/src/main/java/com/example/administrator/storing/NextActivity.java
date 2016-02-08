package com.example.administrator.storing;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class NextActivity extends AppCompatActivity {
    public EditText username2;
    public EditText password2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        username2 = (EditText) findViewById(R.id.editText3);
        password2 = (EditText) findViewById(R.id.editText4);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
public void load(View view){
    SharedPreferences sharedPreferences =getSharedPreferences("csc425data", Context.MODE_PRIVATE);
    String uname=sharedPreferences.getString("uname","NOTHING");
    String passwd=sharedPreferences.getString("passwd", "NOTHING");
    //SharedPreferences.Editor editor=sharedPreferences.edit();
    username2.setText(uname);
    password2.setText(passwd);


}
}
