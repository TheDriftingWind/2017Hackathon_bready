package charleszhu.qunnipiac.edu.a2017hackathon;

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
                break;
            case R.id.FireButton:
                break;
            case R.id.MedicalButton:
                break;
        }
    }
}
