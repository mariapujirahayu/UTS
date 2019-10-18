package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

public class SiswaActivity extends AppCompatActivity {
    private Button Submit;
    private EditText Nis;
    private EditText Nama;
    private EditText Alamat;
    private EditText Hp;
    private EditText Ket;
    private Spinner agm;
    String txtNis, txtNama, txtAlamat, txtHp, txtKet, txtAgama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        Nis = findViewById(R.id.edtNis);
        Nama = findViewById(R.id.edtNama);
        Alamat = findViewById(R.id.edtAlamat);
        Hp = findViewById(R.id.edtHp);
        Ket = findViewById(R.id.edtKet);
        agm = findViewById(R.id.pilAgama);

        final Spinner List = findViewById(R.id.pilAgama);

    }

    public void tampilData(View view) {
        txtNis = Nis.getText().toString();
        txtNama = Nama.getText().toString();
        txtAlamat = Alamat.getText().toString();
        txtHp = Hp.getText().toString();
        txtKet = Ket.getText().toString();
        txtAgama = agm.getSelectedItem().toString();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Nis : " + txtNis + "\nNama : " + txtNama + "\nAlamat : " + txtAlamat + "\nHandphone : " + txtHp + "\nKeterangan : " + txtKet + "\nAgama : " + txtAgama)
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        SiswaActivity.this.finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
