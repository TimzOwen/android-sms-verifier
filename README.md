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