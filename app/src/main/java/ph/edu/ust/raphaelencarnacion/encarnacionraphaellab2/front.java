package ph.edu.ust.raphaelencarnacion.encarnacionraphaellab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class front extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);

        Button consBtn = (Button)findViewById(R.id.cons);

        consBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(front.this, EncarnacionRaphaelLab2.class));
            }
        });

        Button linBtn = (Button)findViewById(R.id.lin);

        linBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(front.this, linear.class));
            }
        });

        Button relBtn = (Button)findViewById(R.id.rel);

        relBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(front.this, relative.class));
            }
        });


    }
}
