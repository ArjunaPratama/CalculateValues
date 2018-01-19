package com.arjuna.calculatevalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnilai;
    TextView txthasil;
    Button btnhasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnilai = (EditText) findViewById(R.id.etnilai);
        txthasil = (TextView) findViewById(R.id.txthasil);
        btnhasil = (Button) findViewById(R.id.btnhasil);

       btnhasil.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String nnilai = etnilai.getText().toString();

               int anilai = Integer.parseInt(nnilai);

               if (anilai % 2 == 1){
                   txthasil.setText("Bialngan ini adalah Ganjil");
               }else{
                   txthasil.setText("Bilangan ini adalah Genap");
               }
           }
       });




    }
}
