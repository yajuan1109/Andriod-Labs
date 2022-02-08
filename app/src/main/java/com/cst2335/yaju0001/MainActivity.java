package com.cst2335.yaju0001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button clickHere;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        clickHere = findViewById(R.id.button);
        clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toastMsg, Toast.LENGTH_LONG).show();
            }
        });
        
        checkBox = findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton cb, boolean b) {

                Snackbar snackBar;
                if (b){
                    snackBar = Snackbar.make(cb, R.string.snackBarOn, Snackbar.LENGTH_LONG);
                } else{
                    snackBar = Snackbar.make(cb, R.string.snackBarOff, Snackbar.LENGTH_LONG);
                }
                snackBar.setAction(R.string.undo, click->cb.setChecked(!b));
                snackBar.show();

            }
        });


    }




}
