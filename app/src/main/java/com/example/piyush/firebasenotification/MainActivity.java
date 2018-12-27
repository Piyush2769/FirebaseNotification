package com.example.piyush.firebasenotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Title,Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title=findViewById(R.id.text_title);
        Message=findViewById(R.id.text_message);

        if(getIntent().getExtras()!=null)
        {
            for(String key: getIntent().getExtras().keySet())
            {
                if(key.equals("title"))
                    Title.setText(getIntent().getExtras().getString(key));
                else if (key.equals("message"))
                    Message.setText(getIntent().getExtras().getString(key));
            }
        }
    }
}
