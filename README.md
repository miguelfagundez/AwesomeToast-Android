# AwesomeToast-Android 
<img src="images/05.png" width="200"/>

Simple library for managing awesome custom toast in Android SDK


**Status:** Document in progress..

## Abstract
    Awesome Toast is a simple and easy to use Toast library for Android. 
    The library provides some common toast message (Default, Success, Error, Warning, and Information), 
    but also you can create your own Toast message using the methods describe below. 
    You can use it to enhance the user experience and save developing time. Cheers!

Setup
-----

**Gradle** 

  -  Step 1. Add the the JitPack repository to your project level `build.gradle`:
 
```gradle
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```
  -  Step 2. Add this dependency to your app `build.gradle`:
 
```gradle
dependencies {
	implementation 'com.github.miguelfagundez:AwesomeToast-Android:1.0.1'
}
```

Usage
-----

**MainActivity.java** 

```java
// Common toast available into the library
AwesomeToast.infoGradient(this, " Awesome Toast! "); // Just one line 
```

```java
// Custom Toast
new AwesomeToast.Create(this, " Awesome Toast! ") // Create a new AwesomeToast, you need context and message
        .setImageValue(R.drawable.ic_clock_logo)  // You can (or cannot include an image)
        .setIsGradient(true)			  // Linear gradient (Top to Bottom) available
        .setTextBold(true)			  // Bold style available
        .setAllRadius(25)			  // Corner radius (recommended between 25 to 75)
        .setTextSize(Constants.TEXT_BIG_SIZE)	  // Text Size (options available SMALL, NORMAL, BIG, or DEFAULT)
        .setToastGravity(Gravity.BOTTOM)	  // Toast Gravity (BOTTOM, CENTER, or TOP)
        .show();				  // ALWAYS include .show method at the end.
```

**Toast Messages Available into the Library**

The library has some common Toast available just in one line. Each type has four options (Normal, Peak, Gradient, and PeakGradient). The table below shows a complete example with its pictures.

| Toast Name | Picture |
| ------------- | ------------- |
| `AwesomeToast.info(this, " This is an Info Message ");` | <img src="images/01.png" width="200"></img>  |
`AwesomeToast.infoPeak(this, " This is an Info Message (Peak) ");` | <img src="images/02.png" width="200"></img>  |
`AwesomeToast.infoGradient(this, " This is an Info Message (Gradient) ");` | <img src="images/03.png" width="200"></img>  |
`AwesomeToast.infoGradientPeak(this, " This is an Info Message (Both) ");` | <img src="images/04.png" width="200"></img>  |

Success, error, and warning follow the same patterns. For example, Success:

     AwesomeToast.success(this, " This is an Success Message ");
     AwesomeToast.successPeak(this, " This is an Success Message (Peak) ");
     AwesomeToast.successGradient(this, " This is an Success Message (Gradient) ");
     AwesomeToast.successGradientPeak(this, " This is an Success Message (Both) ");

For defaults are only available normal and peak options. For example:

Default White: `AwesomeToast.defaultWhite(this, " This is an Info Message ");`

Default White Peak: `AwesomeToast.defaultWhitePeak(this, " This is an Info Message ");`

Default Black: `AwesomeToast.defaultBlack(this, " This is an Info Message ");`

Default Black Peak: `AwesomeToast.defaultBlackPeak(this, " This is an Info Message ");`


Attributes
-----

|Attribute name|Type|Default value|Description|
|---|---|:---:|---|
|text|String|N/A|text shows in Toast|
|textColor|int|White|Text color|
|textSize|int|TEXT_NORMAL_SIZE = 16sp| Text Size|
|textBold|boolean|false|Text bold available|
|imageValue|int|0|Image in Toast (optional)|
|backgroundColor|int|Grey|Background color in Toast (plain option only)|
|borderColor|int|Black|Border color in Toast (plain or gradient option)|
|borderWidth|int|8|Border size in Toast|
|toastGravity|int|Gravity.BOTTOM|Toast position in Screen (TOP and CENTER available)|
|toastLength|int|Toast.LENGTH_SHORT|Toast duration (LENGHT_LONG available)|
|isGradient|boolean|false|Background color in gradient mode|
|gradientColorStart|int|Black|Start gradient color (Top) / isGradiente MUST be TRUE|
|gradientColorEnd|int|Grey|End gradient color (Bottom) / isGradiente MUST be TRUE|
|radiusTopLeft|int|0|Top left corner|
|radiusBottomLeft|int|0|Bottom left corner|
|radiusTopRight|int|0|Top right corner|
|radiusBottomRight|int|0|Bottom right corner|

Author
-----

**Miguel Fagundez** - [Miguel's website](https://miguelfagundez.weebly.com/)

## License
The work done has been licensed under MIT License. This means that you can use this library and its code without any restriction. The license file can be found
[here](LICENSE). You can find out more about the license at:

https://opensource.org/licenses/MIT

```
MIT License

Copyright (c) 2020 Miguel Fagundez

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
