package com.example.fragmentmanager12;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnfrg1 = findViewById(R.id.btnfrag1);
        Button btnfr2 = findViewById(R.id.btnfrag2);
        btnfrg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new fragment1();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.displayfragment, fragment);
                ft.commit();
            }
        });
        btnfr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new fragment2();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.displayfragment, fragment);
                ft.commit();
            }
        });
    }
}
