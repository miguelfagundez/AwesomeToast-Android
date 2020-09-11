package com.devproject.miguelfagundez.awesometoast_example;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;

import com.devproject.miguelfagundez.awesome_toast.AwesomeToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //********************
    //  Library Testing
    //********************
    public void showToast(View view) {

        // Default
        /*AwesomeToast.defaultWhite(getApplicationContext(), "This is a Default Toast (White)");
        AwesomeToast.defaultWhitePeak(getApplicationContext(), "This is a Default Toast (White)");
        AwesomeToast.defaultBlack(getApplicationContext(), "This is a Default Toast (Black)");
        AwesomeToast.defaultBlackPeak(getApplicationContext(), "This is a Default Toast (Black)");

        // Success
        AwesomeToast.success(getApplicationContext(), "This is a Success Message");
        AwesomeToast.successPeak(getApplicationContext(),"This is a Success Message (Peak)");
        AwesomeToast.successGradient(getApplicationContext(),"This is a Success Message (Gradient)");
        AwesomeToast.successGradientPeak(getApplicationContext(),"This is a Success Message (Both)");

        // Error
        AwesomeToast.error(getApplicationContext(), "This is an Error Message");
        AwesomeToast.errorPeak(getApplicationContext(), "This is an Error Message (Peak)");
        AwesomeToast.errorGradient(getApplicationContext(),"This is an Error Message (Gradient)");
        AwesomeToast.errorGradientPeak(getApplicationContext(),"This is an Error Message (Both)");*/

        // Info
        /*AwesomeToast.info(getApplicationContext(), "This is an Info Message");
        AwesomeToast.infoPeak(getApplicationContext(), "This is an Info Message (Peak)");
        AwesomeToast.infoGradient(getApplicationContext(),"This is an Info Message (Gradient)");
        AwesomeToast.infoGradientPeak(getApplicationContext(), "This is an Info Message (Both)");*/

        // Warning
        /*AwesomeToast.warning(getApplicationContext(), "This is a Warning Message");
        AwesomeToast.warningPeak(getApplicationContext(), "This is a Warning Message (Peak)");
        AwesomeToast.warningGradient(getApplicationContext(),"This is a Warning Message (Gradient)");
        AwesomeToast.warningGradientPeak(getApplicationContext(), "This is a Warning Message (Both)");*/

        // Custom Toast
        new AwesomeToast.Create(this, " Awesome Toast! ")
                .setImageValue(R.drawable.ic_clock_logo)
                .setIsGradient(true)
                .setGradientColorStart(this.getResources().getColor(R.color.yellow))
                .setGradientColorEnd(this.getResources().getColor(R.color.colorAccent))
                .setTextBold(true)
                .setAllRadius(25)
                .setShape(GradientDrawable.OVAL)
                .setTextSize(AwesomeToast.TEXT_BIG_SIZE)
                .setToastGravity(AwesomeToast.TOAST_BOTTOM_POSITION)
                .show();

    }
}