package com.example.romulo.recursosandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnSMS);
        final EditText editText = (EditText) findViewById(R.id.editTextSMS);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSMS = new Intent(Intent.ACTION_VIEW);
                intentSMS.setData(Uri.parse("sms:" + editText.getText()));
                startActivity(intentSMS);
            }
        });


        final Button buttonSite = (Button) findViewById(R.id.btnSite);
        final EditText editTextSite = (EditText) findViewById(R.id.editTextSite);
        buttonSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String site = editTextSite.getText().toString();
                if (!site.startsWith("http://")) {
                    site = "http://" + site;
                }
                Intent intentSite = new Intent(Intent.ACTION_VIEW);
                intentSite.setData(Uri.parse(site));
                startActivity(intentSite);

            }
        });

        final Button buttonLocalizacao = (Button) findViewById(R.id.btnLocalizacao);
        final EditText editTextLocalizacao = (EditText) findViewById(R.id.editTextLocalizacao);
        final EditText editTextLocalizacao2 = (EditText) findViewById(R.id.editTextLocalizacao2);
        buttonLocalizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentMapa = new Intent(Intent.ACTION_VIEW);
                intentMapa.setData(Uri.parse("geo:" + editTextLocalizacao.getText()+","+editTextLocalizacao2.getText()));
                startActivity(intentMapa);

            }
        });



    }


}
