package edu.uph.uts_jason;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the verelangkasa LinearLayout by its ID
        LinearLayout verelangkasaLayout = findViewById(R.id.verelangkasa);

        // Set a click listener for the verelangkasa LinearLayout
        verelangkasaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to start MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Start MainActivity2
                startActivity(intent);
            }
        });
    }
}
