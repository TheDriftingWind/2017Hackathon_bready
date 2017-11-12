package charleszhu.qunnipiac.edu.a2017hackathon;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.app.Activity;


public class SearchActivity extends Activity {
    private String userType, backgroundColor;
    private TextFragment textFragment;
    //share action provider to sending share intents
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //if i.getString == "customer" put customerfragment in fragment container
        //if i.getString == "owner" put ownerfragment in the fragment container
        View fragmentContainer = findViewById(R.id.all);
        if (fragmentContainer != null) {
            FragmentTransaction ft = getFragmentManager().beginTransaction();

            /*
            Exclude addToBackStack. Want to go straight back to MainActivity if
            backbutton is pressed
             */
//            ft.addToBackStack(null); -- Do not need to add to backstack.
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();


        }
    }

    public SearchActivity(String phoneNo, String description) {
        textFragment = new TextFragment();
        onStart();
    }

//    public void onFragmentInteraction(){
//
//    }


}
