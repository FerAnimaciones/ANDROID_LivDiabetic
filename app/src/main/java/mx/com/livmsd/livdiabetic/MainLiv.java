package mx.com.livmsd.livdiabetic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLiv extends AppCompatActivity {
Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_liv);
        boton= (Button) findViewById(R.id.btn1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLiv.this,
                        Inicio.class);
                startActivity(intent);
            }
        });

    }
}
