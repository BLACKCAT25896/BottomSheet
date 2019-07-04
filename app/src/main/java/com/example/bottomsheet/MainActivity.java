package com.example.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheetDialogFragment bottomSheetDialogFragment= new BottomSheetFragment();
                bottomSheetDialogFragment.show(getSupportFragmentManager(),"bottom sheet");

            }
        });



    }

    private void init() {
        button = findViewById(R.id.bottomSheetBtn);








    }
}
