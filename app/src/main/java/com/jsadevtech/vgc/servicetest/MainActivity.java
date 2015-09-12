package com.jsadevtech.vgc.servicetest;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    NotificationManager nt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nt = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        TextView hora = (TextView) findViewById(R.id.hora);

        hora.setText(Time.fechaHoraActual());

        //Notifications not = new Notifications(MainActivity.this, "Notificacion de prueba", "HORA ACTUAL", (String) hora.getText(),
        //        R.drawable.iconoprincipal30x30, true, true, 4);
        //nt.notify(5, not.getNotificacion());

        //Intent i = new Intent(MainActivity.this, MyService.class);
        //i.putExtra("key1", "Esto es un servicio de prueba");
        //startService(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
