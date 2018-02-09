# Android SMS Verifier

This is a simple Android library I built for fun to help implement the interception of SMS with a verification code using a few lines of code in your Android project.

## Getting Started

These instructions will help you set up this library easily on your current project and working in no time. You only need a few configurations to start working!

## Installing

To be able to use the following library, you will need to add the following gradle dependency in your build.gradle(module:app) file

```
implementation 'com.androidstudy:sms-verifier:0.0.1'
```
That is the basic set up needed to be able to use the library in your applications!

## Permissions

First, we need to add these permission to our Android Manifest file :

```
<uses-permission android:name="android.permission.RECEIVE_SMS" />
<uses-permission android:name="android.permission.READ_SMS" />
```

If you are using this Library, this means your Application might be using Internet, so don't forget the following permission also:

```
<uses-permission android:name="android.permission.INTERNET"/>
```

Also, for android M and above, you must request the runtime permission.

That's it, you have set up the required permissions and ready to go!

## Quick Example

Initialize SmsVerifyCatcher in method like onCreate activity:

```java
  //Initialize the SmsVerifyCatcher
        smsVerifyCatcher = new SmsVerifyCatcher(this, new OnSmsCatchListener<String>() {
            @Override
            public void onSmsCatch(String message) {
                String code = parseCode(message);//Parse verification code
                etCode.setText(code);//set code in edit text

                //TODO Send the Verification Code to the Server
            }
        });
```

Override activity lifecicle methods:

```java
 @Override
    protected void onStart() {
        super.onStart();
        smsVerifyCatcher.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        smsVerifyCatcher.onStop();
    }

    /**
     * need for Android 6 real time permissions
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        smsVerifyCatcher.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
```

You can set phone number filter:

```
smsVerifyCatcher.setPhoneNumberFilter("2547");
```
Take a look at this sample project which has a sample implementation of the library.

## Contributing and Issues

Please feel free to contribute or open issues, if any and I will be happy to help out!

## License

This project is licensed under the MIT License.