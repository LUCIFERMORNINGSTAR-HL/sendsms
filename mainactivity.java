package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText phoneBox, messageBox;
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneBox = findViewById(R.id.phone_number_input);
        messageBox = findViewById(R.id.message_input);
        sendBtn = findViewById(R.id.send_sms_button);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = phoneBox.getText().toString();
                String message = messageBox.getText().toString();

                if (phoneNumber.isEmpty() || message.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a phone number and message.", Toast.LENGTH_SHORT)
                            .show();
                    return;
                }

                Uri uri = Uri.parse("smsto:" + phoneNumber);

                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);

                intent.putExtra("sms_body", message);

                startActivity(intent);
            }
        });
    }
}