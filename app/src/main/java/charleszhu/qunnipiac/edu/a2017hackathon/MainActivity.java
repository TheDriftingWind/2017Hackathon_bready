package charleszhu.qunnipiac.edu.a2017hackathon;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchAction(View v){
        if(v.getId() == R.id.searchBtn){
            Intent s = new Intent(this, SearchActivity.class);
            EditText edit = (EditText)findViewById(R.id.searchText);
            s.putExtra("search", edit.getText().toString());
            switch(edit.getText().toString()){
                case "Domestic Abuse":
                    s.putExtra("number", "Please Call: 911");
                    s.putExtra("tips", "In the event of domestic abuse.........");
                    break;
                case "Wild Animal":
                    s.putExtra("number", "Please Call: (203)-230-4090 ");
                    s.putExtra("tips", "In the event a wild animal.........");
                    break;
                default:
                    s.putExtra("number", "Please Call: 911");
                    s.putExtra("tips", "In the event of this emergency.........");
                    break;
            }
            startActivity(s);
        }
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
