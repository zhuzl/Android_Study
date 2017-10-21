package com.example.zhuzl.zq;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class main_Blue extends AppCompatActivity implements View.OnClickListener {
    private Button blue_scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__blue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
     blue_scan = (Button) findViewById(R.id.blue_scan);
        blue_scan.setOnClickListener(this);
    }
    private List<String> getAllTeachers() {
        List<String> teachers = new ArrayList<String>();
        teachers.add("BLE1");
        teachers.add("BLE2");
        teachers.add("BLE3");

        return teachers;
    }

    public void onClick(View v)
    {
        switch(v.getId()) {
            case R.id.blue_scan:
                /*ArrayAdapter<String> device_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getAllTeachers());
                ListView device_list = (ListView)findViewById(R.id.blue_devices);
                device_list.setAdapter(device_adapter);*/
                Intent blue_srv = new Intent(this,BluetoothLeService.class);
                startService(blue_srv);

          //      Intent scan_intent = new Intent(main_Blue.this,DeviceScanActivity.class);
             //   startActivity(scan_intent);
                break;
            default:
                Toast.makeText(main_Blue.this,"hello",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
