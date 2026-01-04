
# Ex.No:3 Design an android application Send SMS using Intent.


## AIM:

To create and design an android application Send SMS using Intent using Android Studio.

## EQUIPMENTS REQUIRED:

Android Studio(Latest Version)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as smsintent and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Send SMS and Display details give in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```java
/*
Program to create and design an android application Send SMS using Intent.
Developed by: R K JAYA KRISNAA
Registeration Number : 212223223002
*/

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
```

## OUTPUT

Code part : 
![alt text](<imgs/Screenshot 2025-09-21 142421.png>)

Design part : 
![alt text](<imgs/Screenshot 2025-09-21 142432.png>)

App : 

<img src="./imgs/IMG_20251029_090505.jpg" height=400>

<img src="./imgs/Screenshot_2025-09-21-14-23-41-10_0ce57feeccaa51fb7deed04b4dbda235.jpg" height=400>

## RESULT
Thus a Simple Android Application create and design an android application Send SMS using Intent using Android Studio is developed and executed successfully.
