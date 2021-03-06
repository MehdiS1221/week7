package algonquin.cst2335.inclassexamples_s21;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.nextPageButton);
        Log.w("MainActivity", "In onCreate() - Loading Widgets" );

        loginBtn.setOnClickListener( clk -> {
            EditText et = findViewById(R.id.inputEditText);
            Intent nextPage = new Intent(MainActivity.this, SecondActivity.class);

            nextPage.putExtra("SomeInfo", et.getText().toString());
            startActivity( nextPage );
        });
    }

}