package id.sch.smktelkom_mlg.tugas01.xirpl6006.formpemesanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etNama;
    EditText etNomor;
    Button buttonpsn;
    TextView tvHasil;
    TextView tvHasil2, tvhasil3;
    TextView tvJudul;
    Spinner spMaskapai;
    RadioGroup kelas;
    CheckBox cbr, cbk, cbp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvhasil3 = (TextView) findViewById(R.id.textViewHasil3);
        etNama = (EditText) findViewById(R.id.etNama);
        etNomor = (EditText) findViewById(R.id.etNomor);
        buttonpsn = (Button) findViewById(R.id.buttonpsn);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvJudul = (TextView) findViewById(R.id.textViewJudul);
        tvHasil2 = (TextView) findViewById(R.id.textViewHasil2);
        spMaskapai = (Spinner) findViewById(R.id.spinnermaskapai);
        kelas = (RadioGroup) findViewById(R.id.radiogroupclass);
        cbr = (CheckBox) findViewById(R.id.checkBoxR);
        cbk = (CheckBox) findViewById(R.id.checkBoxK);
        cbp = (CheckBox) findViewById(R.id.checkBoxP);

        buttonpsn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                doProcess();
              /*  doCheckBox();
                doradio() ;
            */
            }
        });

    }
/*
    private void doCheckBox()
    {
        String hasil = "Hobi Anda:\n";
        int statlen = hasil.length();
        if(cbr,isChecked())
    }*/

/*
    private void doradio()
    {
        String hasil = null;

        if(kelas.getCheckedRadioButtonId()!=-1);
        {
            RadioButton rb = (RadioButton)
                    findViewById(kelas.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }

        if(hasil == null)
        {
            tvHasil2.setText("Belum memilih kelas!");
        }
        else
        {
            tvHasil2.setText("Kelas Penerbangan : " + hasil);
        }
    }
*/

    private void doProcess()
    {

        String hasil = "Barang bawaan Anda = ";
        int starlen = hasil.length();
        if (cbr.isChecked()) hasil += cbr.getText() + ", ";
        if (cbk.isChecked()) hasil += cbk.getText() + ", ";
        if (cbp.isChecked()) hasil += cbp.getText() + "";

        if (hasil.length() == starlen) hasil += "";

        tvhasil3.setText(hasil);


        if (isValid())
        {
            //tvJudul
            tvJudul.setText("DATA PEMESAN");

            //tvHasil
            String nama = etNama.getText().toString();
            String nomor = etNomor.getText().toString();
            String maskapai = spMaskapai.getSelectedItem().toString();

            tvHasil.setText("Nama : " + nama + "\nNomor Identitas : " + nomor + "\nMaskapai : " + maskapai);
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
