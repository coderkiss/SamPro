package com.kisstools.sampro;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends Activity implements View.OnClickListener {

    public static final String TAG = "HomeActivity";

    private Button btAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btAction = (Button) findViewById(R.id.bt_action);
        btAction.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick " + view);
        Toast.makeText(this, "button clicked.", Toast.LENGTH_LONG).show();
    }
}
