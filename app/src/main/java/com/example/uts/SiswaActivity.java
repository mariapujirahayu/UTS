package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SiswaActivity extends AppCompatActivity {
    private Button Submit;
    private EditText Nis;
    private EditText Nama;
    private EditText Alamat;
    private EditText Hp;
    private EditText Ket;
    String txtNis, txtNama, txtAlamat, txtHp, txtKet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);
        Nis = findViewById(R.id.edtNis);
        Nama = findViewById(R.id.edtNama);
        Alamat = findViewById(R.id.edtAlamat);
        Hp = findViewById(R.id.edtHp);
        Ket = findViewById(R.id.edtKet);
    }

    public void tampilData(View view) {
        txtNis = Nis.getText().toString();
        txtNama = Nama.getText().toString();
        txtAlamat = Alamat.getText().toString();
        txtHp = Hp.getText().toString();
        txtKet = Ket.getText().toString();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Nis : " + txtNis + "\nNama : " + txtNama + "\nAlamat : " + txtAlamat + "\nHandphone : " + txtHp + "\nKeterangan : " + txtKet)
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
