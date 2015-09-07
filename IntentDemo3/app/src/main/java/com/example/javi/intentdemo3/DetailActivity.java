package com.example.javi.intentdemo3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends Activity {
    public void buttonPressed(View view) {
        Button button = (Button)view;
        String buttonText = button.getText().toString();
        Intent intent = getIntent();
        intent.putExtra("choice", buttonText);
        this.setResult(Activity.RESULT_OK, intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
