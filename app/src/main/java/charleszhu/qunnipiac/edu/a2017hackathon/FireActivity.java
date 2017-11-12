package charleszhu.qunnipiac.edu.a2017hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }

    public void ToggleViews(View v){
        LinearLayout Electrical = (LinearLayout) findViewById(R.id.Electrical);
        LinearLayout Oil = (LinearLayout) findViewById(R.id.Oil);


        switch(v.getId()){
            case R.id.ToggleElectrical:
                if(Electrical.getVisibility() == View.VISIBLE){
                    Electrical.setVisibility(View.GONE);
                } else {
                    Electrical.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.ToggleOil:
                if(Oil.getVisibility() == View.VISIBLE){
                    Oil.setVisibility(View.GONE);
                } else {
                    Oil.setVisibility(View.VISIBLE);
                }
                break;
        }
    }



}
