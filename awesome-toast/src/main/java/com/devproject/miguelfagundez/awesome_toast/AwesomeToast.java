package com.devproject.miguelfagundez.awesome_toast;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


//********************************************************
// AwesomeToast Library
// Author: Miguel Fagundez
// Date: September 01st, 2020
// Version 1.0.0
//********************************************************
public class AwesomeToast {

    //************************************
    //        Main library class
    //************************************
    public AwesomeToast(Create create){

        // Taking context and getting Layout Inflater Service
        Context context = create.context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate custom toast layout and ViewGroup is null
        View layout = inflater.inflate(R.layout.custom_toast, null);

        // Setup views: TextView and ImageView
        TextView textView = (TextView) layout.findViewById(R.id.textView);
        ImageView imageView = (ImageView) layout.findViewById(R.id.imageView);

        // Set some TextView values (text, color, size, style)
        textView.setText(create.text);
        textView.setTextColor(create.textColor);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, create.textSize);
        if (create.textBold) textView.setTypeface(null, Typeface.BOLD);
        else textView.setTypeface(null, Typeface.NORMAL);

        // Set some ImageView values
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setImageResource(create.imageValue);

        // Set some shape values
        GradientDrawable drawable;

        // If gradient then apply linear option
        if (create.isGradient){
             drawable = new GradientDrawable(
                    GradientDrawable.Orientation.TOP_BOTTOM,
                    new int[]{create.gradientColorStart,
                            create.gradientColorStart,
                            create.gradientColorEnd,
                            create.gradientColorEnd}
            );
            drawable.setGradientType(GradientDrawable.LINEAR_GRADIENT);
        }else{

            //If not, apply plain color
            drawable = new GradientDrawable();
            drawable.setColor(create.backgroundColor);
        }

        drawable.setShape(create.shape);
        drawable.setCornerRadii(new float[]{create.radiusTopLeft,create.radiusTopLeft,
                create.radiusTopRight,create.radiusTopRight,create.radiusBottomRight,create.radiusBottomRight,
                create.radiusBottomLeft,create.radiusBottomLeft});

        drawable.setStroke(create.borderWidth, create.borderColor);

        // Include the shape into layout and show it
        layout.setBackground(drawable);
        Toast toast = new Toast(create.context);
        toast.setView(layout);
        toast.setDuration(create.toastLength);
        toast.setGravity(create.toastGravity, 0, 100);
        toast.show();
    }

    //*********************************************
    //
    //        --- Toast Default ---
    //
    //*********************************************
    // Black background
    public static void defaultBlack(Context context, String text){
        new Create(context, "   " + text + "   ")
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setBackgroundColor(context.getResources().getColor(R.color.colorBlack))
                .setTextColor(context.getResources().getColor(R.color.colorWhite))
                .setAllRadius(80)
                .show();
    }

    public static void defaultBlackPeak(Context context, String text){
        new Create(context, "   " + text + "   ")
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setBackgroundColor(context.getResources().getColor(R.color.colorBlack))
                .setTextColor(context.getResources().getColor(R.color.colorWhite))
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }
    // White background
    public static void defaultWhite(Context context, String text){
        new Create(context, "   " + text + "   ")
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setBackgroundColor(context.getResources().getColor(R.color.colorWhite))
                .setTextColor(context.getResources().getColor(R.color.colorBlack))
                .setAllRadius(80)
                .show();
    }

    public static void defaultWhitePeak(Context context, String text){
        new Create(context, "   " + text + "   ")
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setBackgroundColor(context.getResources().getColor(R.color.colorWhite))
                .setTextColor(context.getResources().getColor(R.color.colorBlack))
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }

    //*********************************************
    //
    //        --- Toast Success ---
    //
    //*********************************************
    // Simple
    public static void success(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorGreen))
                .setBorderColor(context.getResources().getColor(R.color.colorGreenDark))
                .setImageValue(R.drawable.ic_success)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak
    public static void successPeak(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorGreen))
                .setBorderColor(context.getResources().getColor(R.color.colorGreenDark))
                .setImageValue(R.drawable.ic_success)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }
    // Gradient
    public static void successGradient(Context context, String text){
        /*GradientDrawable gradient = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM,
                new int[]{context.getResources().getColor(R.color.colorGreenDark),
                        context.getResources().getColor(R.color.colorGreenDark),
                        context.getResources().getColor(R.color.colorGreen),
                        context.getResources().getColor(R.color.colorGreen)}
        );*/

        new Create(context, text)
                //.setGradientDrawable(gradient)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorGreenDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorGreen))
                .setBorderColor(context.getResources().getColor(R.color.colorGreenDark))
                .setImageValue(R.drawable.ic_success)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak-Gradient
    public static void successGradientPeak(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorGreenDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorGreen))
                .setBorderColor(context.getResources().getColor(R.color.colorGreenDark))
                .setImageValue(R.drawable.ic_success)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }

    //*********************************************
    //
    //        --- Toast Error ---
    //
    //*********************************************
    // Simple
    public static void error(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorRed))
                .setBorderColor(context.getResources().getColor(R.color.colorRedDark))
                .setImageValue(R.drawable.ic_error)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak
    public static void errorPeak(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorRed))
                .setBorderColor(context.getResources().getColor(R.color.colorRedDark))
                .setImageValue(R.drawable.ic_error)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }
    // Gradient
    public static void errorGradient(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorRedDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorRed))
                .setBorderColor(context.getResources().getColor(R.color.colorRedDark))
                .setImageValue(R.drawable.ic_error)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }

    // Peak-Gradient
    public static void errorGradientPeak(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorRedDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorRed))
                .setBorderColor(context.getResources().getColor(R.color.colorRedDark))
                .setImageValue(R.drawable.ic_error)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }

    //*********************************************
    //
    //        --- Toast Warning ---
    //
    //*********************************************
    // Simple
    public static void warning(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorOrange))
                .setBorderColor(context.getResources().getColor(R.color.colorOrangeDark))
                .setImageValue(R.drawable.ic_warning)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak
    public static void warningPeak(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorOrange))
                .setBorderColor(context.getResources().getColor(R.color.colorOrangeDark))
                .setImageValue(R.drawable.ic_warning)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }
    // Gradient
    public static void warningGradient(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorOrangeDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorOrange))
                .setBorderColor(context.getResources().getColor(R.color.colorOrangeDark))
                .setImageValue(R.drawable.ic_warning)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak-Gradient
    public static void warningGradientPeak(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorOrangeDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorOrange))
                .setBorderColor(context.getResources().getColor(R.color.colorOrangeDark))
                .setImageValue(R.drawable.ic_warning)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }

    //*********************************************
    //
    //        --- Toast Info ---
    //
    //*********************************************
    // Simple
    public static void info(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorBlue))
                .setBorderColor(context.getResources().getColor(R.color.colorBlueDark))
                .setImageValue(R.drawable.ic_info)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak
    public static void infoPeak(Context context, String text){
        new Create(context, text)
                .setBackgroundColor(context.getResources().getColor(R.color.colorBlue))
                .setBorderColor(context.getResources().getColor(R.color.colorBlueDark))
                .setImageValue(R.drawable.ic_info)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }
    // Gradient
    public static void infoGradient(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorBlueDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorBlue))
                .setBorderColor(context.getResources().getColor(R.color.colorBlueDark))
                .setImageValue(R.drawable.ic_info)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setAllRadius(100)
                .show();
    }
    // Peak-Gradient
    public static void infoGradientPeak(Context context, String text){
        new Create(context, text)
                .setIsGradient(true)
                .setGradientColorStart(context.getResources().getColor(R.color.colorBlueDark))
                .setGradientColorEnd(context.getResources().getColor(R.color.colorBlue))
                .setBorderColor(context.getResources().getColor(R.color.colorBlueDark))
                .setImageValue(R.drawable.ic_info)
                .setTextSize(Constants.TEXT_NORMAL_SIZE)
                .setRadiusTopLeft(70)
                .setRadiusBottomRight(70)
                .show();
    }

    //*****************************************
    //   Inner library class -- Create
    //*****************************************
    public static class Create{

        private Context context;

        private String text;
        private int textColor;
        private int textSize;
        private boolean textBold;

        private int imageValue;

        private int backgroundColor;
        private int borderColor;
        private int shape;
        private int borderWidth;

        private int toastGravity;
        private int toastLength;

        private boolean isGradient;
        private int gradientColorStart;
        private int gradientColorEnd;

        private int radiusTopLeft;
        private int radiusBottomLeft;
        private int radiusTopRight;
        private int radiusBottomRight;

        public Create(Context context, String text){
            this.context = context;
            this.text = text;

            // Text values
            setTextSize(Constants.TEXT_NORMAL_SIZE);
            textBold = false;

            // Default Colors
            this.backgroundColor = context.getResources().getColor(R.color.colorGrey);
            this.borderColor = context.getResources().getColor(R.color.colorBlack);
            this.textColor = context.getResources().getColor(R.color.colorWhite);
            this.gradientColorStart = context.getResources().getColor(R.color.colorBlack);
            this.gradientColorEnd = context.getResources().getColor(R.color.colorGrey);

            // Image
            this.imageValue = 0;

            // Default shape
            this.shape = GradientDrawable.RECTANGLE;

            // Radius
            radiusTopLeft = 0;
            radiusBottomLeft = 0;
            radiusTopRight = 0;
            radiusBottomRight = 0;

            // Gradient option
            isGradient = false;

            // Border Width
            borderWidth = 8;

            // Toast values
            toastGravity = Gravity.BOTTOM;
            toastLength = Toast.LENGTH_SHORT;

        }

        // Setter section

        public Create setText(String text) {
            this.text = text;
            return this;
        }

        public Create setImageValue(int imageValue) {
            this.imageValue = imageValue;
            return this;
        }

        public Create setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Create setBorderColor(int borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Create setTextColor(int textColor) {
            this.textColor = textColor;
            return this;
        }

        public Create setIsGradient(boolean gradient) {
            isGradient = gradient;
            return this;
        }

        public Create setGradientColorStart(int gradientColorStart) {
            this.gradientColorStart = gradientColorStart;
            return this;
        }

        public Create setGradientColorEnd(int gradientColorEnd) {
            this.gradientColorEnd = gradientColorEnd;
            return this;
        }

        public Create setTextSize(int textSize) {
            switch (textSize){
                case Constants.TEXT_SMALL_SIZE:
                    this.textSize = 12;
                    break;
                case Constants.TEXT_BIG_SIZE:
                    this.textSize = 24;
                    break;
                case Constants.TEXT_NORMAL_SIZE:
                    this.textSize = 16;
                    break;
                default:
                    this.textSize = 20;
                    break;
            }
            return this;
        }

        public Create setTextBold(boolean textBold) {
            this.textBold = textBold;
            return this;
        }

        public Create setShape(int shape) {
            this.shape = shape;
            return this;
        }

        public Create setToastGravity(int toastGravity) {
            this.toastGravity = toastGravity;
            return this;
        }

        public Create setBorderWidth(int borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Create setToastLength(int toastLength) {
            switch (toastLength){
                case Constants.TOAST_LONG_DURATION:
                    this.toastLength = Toast.LENGTH_LONG;
                    break;
                default:
                    this.toastLength = Toast.LENGTH_SHORT;
                    break;
            }
            return this;
        }

        public Create setRadiusTopLeft(int radiusTopLeft) {
            this.radiusTopLeft = radiusTopLeft;
            return this;
        }

        public Create setRadiusBottomLeft(int radiusBottomLeft) {
            this.radiusBottomLeft = radiusBottomLeft;
            return this;
        }

        public Create setRadiusTopRight(int radiusTopRight) {
            this.radiusTopRight = radiusTopRight;
            return this;
        }

        public Create setRadiusBottomRight(int radiusBottomRight) {
            this.radiusBottomRight = radiusBottomRight;
            return this;
        }

        public Create setAllRadius(int radius){
            this.radiusTopLeft = radius;
            this.radiusTopRight = radius;
            this.radiusBottomLeft = radius;
            this.radiusBottomRight = radius;
            return this;
        }

        // Show Awesome Toast in Screen
        public void show(){
            new AwesomeToast(this);
        }

    }
}
