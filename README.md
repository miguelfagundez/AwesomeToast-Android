# AwesomeToast-Android 
<img src="images/05.png" width="200"/>

Simple library for managing awesome custom toast in Android SDK


**Status:** Document in progress..

## Abstract
    Awesome Toast is a simple and easy to use Toast library for Android. 
    The library provides some common toast message (Default, Success, Error, Warning, and Information), but also you can 
    create your own Toast message using the methods describe below. 
    You can use it to enhance the user experience and save developing time. Cheers!

### Setup
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

### Usage
-----

**MainActivity.java** 

```java
// Common toast available into the library
AwesomeToast.infoGradient(this, " Awesome Toast! "); // Just one line 
```

```java
// Custom Toast
new AwesomeToast.Create(this, " Awesome Toast! ") // Create a new AwesomeToast, you need context and message
        .setImageValue(R.drawable.ic_clock_logo)  // You can ( or cannot include an image)
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


Setup
-----

## License
The work done has been licensed under MIT License 2.0. The license file can be found
[here](LICENSE). You can find out more about the license at:

https://opensource.org/licenses/MIT

**Status:** Document in progress..
