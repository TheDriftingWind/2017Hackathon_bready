package charleszhu.qunnipiac.edu.a2017hackathon;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MedicalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
    }

    public void ToggleViews(View v){
        LinearLayout Sting = (LinearLayout) findViewById(R.id.Stings);
        LinearLayout Burn = (LinearLayout) findViewById(R.id.Burn);
        LinearLayout OpenWound = (LinearLayout) findViewById(R.id.OpenWound);

        switch(v.getId()){
            case R.id.ToggleBurn:
                if(Burn.getVisibility() == View.VISIBLE){
                    Burn.setVisibility(View.GONE);
                } else {
                    Burn.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.ToggleOpenWound:
                if(OpenWound.getVisibility() == View.VISIBLE){
                    OpenWound.setVisibility(View.GONE);
                } else {
                    OpenWound.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.ToggleSting:
                if(Sting.getVisibility() == View.VISIBLE){
                    Sting.setVisibility(View.GONE);
                } else {
                    Sting.setVisibility(View.VISIBLE);
                }
        }
    }
}
