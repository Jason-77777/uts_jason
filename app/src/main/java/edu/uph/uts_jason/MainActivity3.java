package edu.uph.uts_jason;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button ferelaaaLayout = findViewById(R.id.ferelaaa);


        ferelaaaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText studentIdEditText = findViewById(R.id.editTextText);
                EditText namaEditText = findViewById(R.id.editTextText2);
                EditText jurusanEditText = findViewById(R.id.editTextText3);
                EditText tahunMasukEditText = findViewById(R.id.editTextText4);

                String studentId = studentIdEditText.getText().toString();
                String nama = namaEditText.getText().toString();
                String jurusan = jurusanEditText.getText().toString();
                String tahunMasuk = tahunMasukEditText.getText().toString();


                String toastMessage = "Student ID: " + studentId + "\nNama: " + nama +
                        "\nJurusan: " + jurusan + "\nTahun Masuk: " + tahunMasuk;

                Toast.makeText(MainActivity3.this, toastMessage, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        }

        );
    }
}
