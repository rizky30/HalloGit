package id.sch.smktelkom_mlg.tugas01.xirpl6006.formpemesanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etNama;
    EditText etNomor;
    Button buttonpsn;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        etNomor = (EditText) findViewById(R.id.etNomor);
        buttonpsn = (Button) findViewById(R.id.buttonpsn);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        buttonpsn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nama = etNama.getText().toString();
                String nomor = etNomor.getText().toString();
                tvHasil.setText("Nama anda : " + nama + ", Nomor Identitas anda : " + nomor);
            }
        });

    }
}
