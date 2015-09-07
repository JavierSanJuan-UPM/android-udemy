package com.example.javi.intentdemo2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textView = (TextView)findViewById(R.id.textView);
        String intentData = getIntent().getStringExtra("data");
        textView.setText(intentData);
    }
}
