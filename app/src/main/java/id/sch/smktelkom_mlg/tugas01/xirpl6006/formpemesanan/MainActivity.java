package id.sch.smktelkom_mlg.tugas01.xirpl6006.formpemesanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etNama;
    EditText etNomor;
    Button buttonpsn;
    TextView tvHasil;
    TextView tvJudul;
    Spinner spMaskapai;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        etNomor = (EditText) findViewById(R.id.etNomor);
        buttonpsn = (Button) findViewById(R.id.buttonpsn);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvJudul = (TextView) findViewById(R.id.textViewJudul);
        spMaskapai = (Spinner) findViewById(R.id.spinnermaskapai);

        buttonpsn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                doProcess();
            }
        });

    }

    private void doProcess()
    {
        if (isValid())
        {
            //tvJudul
            tvJudul.setText("DATA PEMESAN");

            //tvHasil
            String nama = etNama.getText().toString();
            String nomor = etNomor.getText().toString();
            tvHasil.setText("Nama : " + nama + "\nNomor Identitas : " + nomor + "\nMaskapai : " + spMaskapai.getSelectedItem().toString());
        }
    }

    private boolean isValid()
    {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String nomor = etNomor.getText().toString();

        if (nama.isEmpty())
        {
            etNama.setError("Nama belum diisi!");
            valid = false;
        } else if (nama.length() < 3)
        {
            etNama.setError("Nama minimal 3 karakter!");
            valid = false;
        } else
        {
            etNama.setError(null);
        }

        if (nomor.isEmpty())
        {
            etNomor.setError("Nomor Identitas belum diisi!");
            valid = false;
        } else
        {
            etNomor.setError(null);
        }

        return valid;
    }
}
