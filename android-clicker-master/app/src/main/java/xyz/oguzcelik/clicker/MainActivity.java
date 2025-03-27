package xyz.oguzcelik.clicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    FrameLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("swipe_direction"); // UPDATED

        swipeLayout = (FrameLayout) findViewById(R.id.swipe_layout);

        swipeLayout.setOnTouchListener(new OnSwipeListener(getBaseContext()) {
            @Override
            public void onSwipe(String direction) {
                databaseReference.setValue(direction);
                databaseReference.setValue("0");
            }
        });

    }
}
