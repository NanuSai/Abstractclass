package com.saiproject.androidapk9;

import android.content.pm.LauncherApps;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtDesktopComputer = findViewById(R.id.txtDesktopComputer);
        TextView txtLaptopComputer = findViewById(R.id.txtLaptopComputer);
        TextView txtSmartPhone = findViewById(R.id.txtSmartPhone);
        TextView txtTablet = findViewById(R.id.txtTablet);


        TextView txtDesktopComputerPerformance = findViewById(R.id.txtDesktopComputerPerformace);
        TextView txtLaptopComputerPerformace = findViewById(R.id.txtLaptopComputerPerformance);
        TextView txtSmartPhonePerformace = findViewById(R.id.txtSmartPhonePerformance);
        TextView txtTabletPerformace = findViewById(R.id.txtTabletPerformance);

        DesktopComputer desk1 = new DesktopComputer("iMac","High quality","Physical Keyboard","Physical",199,399);
        Laptop lap1 = new Laptop("MacBook Pro","High quality","Physical Keyboard","High quality",200,400);
        SmartPhone phone1 = new SmartPhone("iPhoneX","High quality","Virtual Keyboard","Jelly Bean",19,39);
        Tablet tab1 = new Tablet("iPad","Highy quality","Physical Keyboard","Physical",199,399,500);


        txtDesktopComputerPerformance.setText("Performance: "+ desk1.evaluatePerformance() );
        txtLaptopComputerPerformace.setText("Performance: "+lap1.evaluatePerformance());
        txtSmartPhonePerformace.setText("Performance: "+ phone1.evaluatePerformance() );
        txtTabletPerformace.setText("Performance: "+ tab1.evaluatePerformance() );



        Computer[] computers = new Computer[4];

        computers[0] = desk1;
        computers[1] = lap1;
        computers[2] = phone1;
        computers[3] = tab1;

        for(Computer computer : computers){

//If the object is an instance of Desktop
            if(computer instanceof DesktopComputer){
                DesktopComputer current = (DesktopComputer)computer;      //Down casting super class -> sub class
                txtDesktopComputer.setText(current.toString());
            }

            if(computer instanceof Laptop){
                Laptop current = (Laptop)computer;
                txtLaptopComputer.setText(current.toString());
            }

            if(computer instanceof SmartPhone){
                if(!(computer instanceof Tablet)) {
                    SmartPhone current = (SmartPhone) computer;
                    txtSmartPhone.setText(current.toString());
                }
            }


            if(computer instanceof Tablet){
                Tablet current = (Tablet) computer;
                txtTablet.setText(current.toString());
            }




        }





    }


}
