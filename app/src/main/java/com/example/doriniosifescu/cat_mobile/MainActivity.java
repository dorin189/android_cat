package com.example.doriniosifescu.cat_mobile;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    final static int COD_CERERE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Acest dispizitiv nu are adaptor Bluetooth!", Toast.LENGTH_LONG).show();
            finish();
            return;
        } else if (!bluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, COD_CERERE);
        } else {
            Toast.makeText(getApplicationContext(),
                    "am putut accesa bluethoot-ul",
                    Toast.LENGTH_LONG)
                    .show();

        }
    }




//        Button sendButton = (Button) findViewById(R.id.button);
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //declare our intent object which takes two parameters, the context and the new activity name
//
//                // the name of the receiving activity is declared in the Intent Constructor
//               Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
//                String sendMessage = "hello world";
//                Toast.makeText(getApplicationContext(), sendMessage,
//                        Toast.LENGTH_SHORT).show();
//                //put the text inside the intent and send it to another Activity
//               intent.putExtra(EXTRA_MESSAGE, sendMessage);
//                //start the activity
//                startActivity(intent);
//
//
//            }
//        });




//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (resultCode == RESULT_OK && requestCode == COD_CERERE) {
//            Toast.makeText(this, "Bluethooth-ul a fost activat cu succes.", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(this, "Bluethoht-ul nu a putut fi activat", Toast.LENGTH_LONG).show();
//        }
//    }

//        Button prod = (Button) findViewById(R.id.button2);
//        prod.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
//                startActivity(intent2);
//            }
//        });


//        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
//        if (mBluetoothAdapter == null) {
//            Toast.makeText(getApplicationContext(),
//                    "nu am putut accesa bluethoot-ul",
//                    Toast.LENGTH_LONG)
//                    .show();
//        } else {
//            Toast.makeText(getApplicationContext(),
//                    "am putut accesa bluethoot-ul",
//                    Toast.LENGTH_LONG)
//                    .show();
//        }



}
