package com.raden.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtProdi, edtAlamat, edtHobi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);

        edtNpm = (EditText) findViewById(R.id.edtNPM);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtProdi = (EditText) findViewById(R.id.edtProdi);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtHobi = (EditText) findViewById(R.id.edtHobi);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strProdi = edtProdi.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strHobi = edtHobi.getText().toString();

                txtTampil.setText(strNpm + "\n" + strNama + "\n" + strProdi + "\n" + strAlamat + "\n" + strHobi);
            }
        });
    }
}