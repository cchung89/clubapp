package club.polyappdev.clubapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*
 * Created by USER on 3/4/2017.
 */

public class MySetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_setting);
        Button cp = (Button) findViewById(R.id.C_P_but);
        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent (MySetting.this, Pop.class));
            }
        });
    }

    public void sendMessage(View view)
    {
        Log.w("test","test");
        Intent intent = new Intent(MySetting.this, EditProfile.class);
        startActivity(intent);
    }
}
