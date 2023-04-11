package com.mateuspanji_192102109.webviewlanjutan;


import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;

public class WebAppInterface
{
    private Activity _activity;
    private Context _context;

    public WebAppInterface(Context context, Activity activity)
    {
        _context = context;
        _activity = activity;
    }

    @JavascriptInterface
    public void showToast(String message)
}
