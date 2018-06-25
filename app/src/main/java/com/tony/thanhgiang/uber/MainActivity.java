package com.tony.thanhgiang.uber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tony.thanhgiang.uber.Drivers.DriverAuthActivity;

public class MainActivity extends AppCompatActivity {

    private Button mDriver, mCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDriver = findViewById(R.id.btnDriver);
        mCustomer = findViewById(R.id.btnCustomer);

        mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DriverAuthActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
