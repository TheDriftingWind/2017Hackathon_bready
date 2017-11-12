package charleszhu.qunnipiac.edu.a2017hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PoliceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);
    }

    public void ToggleViews(View v){
        LinearLayout Aggressor = (LinearLayout) findViewById(R.id.Aggressor);
        LinearLayout Theft = (LinearLayout) findViewById(R.id.Theft);

        switch(v.getId()){
            case R.id.ToggleAggressor:
                if(Aggressor.getVisibility() == View.VISIBLE){
                    Aggressor.setVisibility(View.GONE);
                } else {
                    Aggressor.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.ToggleTheft:
                if(Theft.getVisibility() == View.VISIBLE){
                    Theft.setVisibility(View.GONE);
                } else {
                    Theft.setVisibility(View.VISIBLE);
                }
                break;
        }
    }

}
