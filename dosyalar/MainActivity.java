LinearLayout layout = new LinearLayout(this);
layout.setOrientation(LinearLayout.VERTICAL);

WebView webview = new WebView(this);
layout.addView(webview, new LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.MATCH_PARENT));

setContentView(layout);

WebSettings settings = webview.getSettings();
settings.setJavaScriptEnabled(true);
settings.setDomStorageEnabled(true);
settings.setAllowFileAccess(false);
settings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);

webview.setWebViewClient(new WebViewClient());
webview.loadUrl("file:///android_asset/index.html");
// bu kodda import gibi gibi özellikler yok bu kod sketchware pro içindir eğer farklı platformlarda geliştirecekseniz bunları kod ekleyimiz
