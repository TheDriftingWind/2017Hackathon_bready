package charleszhu.qunnipiac.edu.a2017hackathon;


import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class SearchActivity extends Activity {
    private TextFragment textFragment;
    String s, n, t;
    //share action provider to sending share intents
    public SearchActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        s = getIntent().getStringExtra("search");
        n = getIntent().getStringExtra("number");
        t = getIntent().getStringExtra("tips");
    }


    @Override
    protected void onStart() {
        super.onStart();

        TextView search = (TextView)findViewById(R.id.search);
        TextView number = (TextView)findViewById(R.id.number);
        TextView tips = (TextView)findViewById(R.id.tips);

        search.setText(s);
        tips.setText(t);
        number.setText(n);

        View fragmentContainer = findViewById(R.id.fragmentContainer);
        if (fragmentContainer != null) {
            textFragment = new TextFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragmentContainer, textFragment);

//            ft.addToBackStack(null); -- Do not need to add to backstack.
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();

        }
    }

//    public void onFragmentInteraction(){
//
//    }


}