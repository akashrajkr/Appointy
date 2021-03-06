package akash.haxkers.com.appointy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.doctorbutton).setOnClickListener(this);
        findViewById(R.id.patientbutton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.doctorbutton :
                startActivity(new Intent(this, doctorLogin.class));
                break;
            case R.id.patientbutton:
                startActivity(new Intent(MainActivity.this, patientActivity.class));
                break;
        }
    }
}
