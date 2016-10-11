package com.example.alfre.datos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText dato1,dato2,dato3;
    private TextView mostrardatos;
    private Button mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        dato1= (EditText)  findViewById (R.id.txtDato1);
        dato2= (EditText) findViewById(R.id.txtDato2) ;
        dato3= (EditText) findViewById(R.id.txtDato3);
        mostrardatos= (TextView) findViewById(R.id.txtSalida) ;
        mostrar=(Button) findViewById(R.id.btnDatos) ;

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d1,d2,d3=null;
                d1=dato1.getText().toString();
                d2=dato2.getText().toString();
                d3=dato3.getText().toString();
                mostrardatos.setText(d1);
                mostrardatos.setText(d2);
                mostrardatos.setText(d3);
            }
        });






        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








    }
}
