package com.devproject.miguelfagundez.awesometoast_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.devproject.miguelfagundez.awesome_toast.AwesomeToast;
import com.devproject.miguelfagundez.awesome_toast.Constants;

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
        AwesomeToast.defaultWhite(getApplicationContext(), "This is a Default Toast (White)");
        AwesomeToast.defaultWhitePeak(getApplicationContext(), "This is a Default Toast (White)");
        AwesomeToast.defaultBlack(getApplicationContext(), "This is a Default Toast (Black)");
        AwesomeToast.defaultBlackPeak(getApplicationContext(), "This is a Default Toast (Black)");

        // Success
        AwesomeToast.success(getApplicationContext(), "This is Success");
        AwesomeToast.successPeak(getApplicationContext(),"This is Success Peak");
        AwesomeToast.successGradient(getApplicationContext(),"This is Success Gradient");
        AwesomeToast.successGradientPeak(getApplicationContext(),"This is Success Gradient Peak");

        // Error
        AwesomeToast.error(getApplicationContext(), "This is Error");
        AwesomeToast.errorPeak(getApplicationContext(), "This is Error Peak");
        AwesomeToast.errorGradient(getApplicationContext(),"This is Error Gradient");
        AwesomeToast.errorGradientPeak(getApplicationContext(),"This is Error Gradient Peak");

        // Info
        AwesomeToast.info(getApplicationContext(), "This is Info");
        AwesomeToast.infoPeak(getApplicationContext(), "This is Info Peak");
        AwesomeToast.infoGradient(getApplicationContext(),"This is Info Gradient");
        AwesomeToast.infoGradientPeak(getApplicationContext(), "This is Info Gradient Peak");

        // Warning
        AwesomeToast.warning(getApplicationContext(), "This is Warning");
        AwesomeToast.warningPeak(getApplicationContext(), "This is Warning Peak");
        AwesomeToast.warningGradient(getApplicationContext(),"This is Warning Gradient");
        AwesomeToast.warningGradientPeak(getApplicationContext(), "This is Warning Gradient Peak");

        // Custom Toast
        new AwesomeToast.Create(this, "This is a Custom Toast")
                .setImageValue(R.drawable.ic_happy)
                .setIsGradient(true)
                .setToastGravity(Gravity.CENTER)
                .show();

    }
}