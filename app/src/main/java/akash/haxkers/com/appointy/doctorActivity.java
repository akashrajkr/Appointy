package akash.haxkers.com.appointy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class doctorActivity extends AppCompatActivity
{

//    FirebaseAuth mAuth;
//    TextView name =(TextView) findViewById(R.id.name);
//    ListView listview = (ListView) findViewById(R.id.list);
//    ArrayList<String> list = new ArrayList<String>();
//    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

//        list.add("Slot 1");
//        list.add("Slot2");
//        list.add("Slot3");
//        list.add("Slot4");
//
//        adapter = new ArrayAdapter<String>(doctorActivity.this, android.R.layout.simple_expandable_list_item_1,list);
//        listview.setAdapter(adapter);
//        mAuth = FirebaseAuth.getInstance();
//        loadUserInformation();
    }

//    private void loadUserInformation() {
//        FirebaseUser user = mAuth.getCurrentUser();
//        name.setText(user.getEmail());
//    }

}
