package com.example.priya.optionmenuprogramatically;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // initialization

    private static final int item1 = 1;
    private static final int item2 = 2;
    private static final int item3 = 3;
    private static final int item4 = 4;
    private static final int item5 = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //creating menu options programmatically

        menu.add(Menu.NONE, item1, Menu.NONE, "Computer");
        menu.add(Menu.NONE, item2, Menu.NONE, "GamePad");
        menu.add(Menu.NONE, item3, Menu.NONE, "Camera");
        menu.add(Menu.NONE, item4, Menu.NONE, "Video");
        menu.add(Menu.NONE, item5, Menu.NONE, "Email");
        return true;

    }

    @Override
    //handles item selection
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

                    case item1:

                        Toast.makeText(getApplicationContext(), "Clicked on Computer option", Toast.LENGTH_LONG).show();
                        break;
                    case item2:
                        Toast.makeText(getApplicationContext(), "Clicked on GamePad option", Toast.LENGTH_LONG).show();
                        break;
                    case item3:
                        Toast.makeText(getApplicationContext(), "Clicked on Camera option", Toast.LENGTH_LONG).show();
                        break;
                    case item4:
                        Toast.makeText(getApplicationContext(), "Clicked on Video option", Toast.LENGTH_LONG).show();
                        break;
                    case item5:
                        Toast.makeText(getApplicationContext(), "Clicked on Email option", Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }
    }



