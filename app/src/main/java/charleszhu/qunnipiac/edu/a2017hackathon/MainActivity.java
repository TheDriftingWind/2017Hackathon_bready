package charleszhu.qunnipiac.edu.a2017hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.PoliceButton:
                Intent i = new Intent(this, PoliceActivity.class);
                startActivity(i);
                break;
            case R.id.FireButton:
                Intent j = new Intent(this, FireActivity.class);
                startActivity(j);
                break;
            case R.id.MedicalButton:
                Intent k = new Intent(this, MedicalActivity.class);
                startActivity(k);
                break;
        }
    }
}
