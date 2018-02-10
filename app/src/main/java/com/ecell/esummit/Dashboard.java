package com.ecell.esummit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends Activity {
    Button tech,startup,business,innovation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tech=(Button)findViewById(R.id.tech);
        startup=(Button)findViewById(R.id.startup);
        business=(Button)findViewById(R.id.business);
        innovation=(Button)findViewById(R.id.innovation);
        business.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i = new Intent(Dashboard.this,Business.class);
                                        startActivity(i);
                                    }
                                }
        );
    }
}
