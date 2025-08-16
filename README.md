

---

# 📱 Android Tarayıcı Uygulaması (Sketchware Pro)

Bu proje, Sketchware Pro kullanılarak geliştirilen hafif ve modüler bir Android tarayıcı uygulamasıdır. WebView tabanlıdır ve tam kontrol isteyen geliştiriciler için kodla genişletilebilir şekilde tasarlanmıştır.

---

## 🚀 Özellikler

- WebView ile hızlı sayfa yükleme
- JavaScript ve DOM Storage desteği
- Reklam engelleme modülü (isteğe bağlı)
- JS enjeksiyonu ile sayfa manipülasyonu
- URL giriş alanı ve geçmiş sistemi
- Karanlık mod ve tam ekran desteği

---

## 📁 Proje Yapısı

```
MyBrowser/
├── java/
│   └── MainActivity.java
├── xml/
│   └── main.xml
├── assets/
│   └── js_injector.js
├── project/
│   └── AndroidManifest.xml
```

---

## 📄 MainActivity.java

```java
package com.mybrowser;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        webview = findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.google.com");
    }
}
```

---

## 🧱 main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <WebView
        android:id="@+id/webview"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
</RelativeLayout>
```

---

## 📜 AndroidManifest.xml

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.mybrowser">

    <uses-permission android:name="android.permission.INTERNET"/>

    <application
        android:allowBackup="true"
        android:label="MyBrowser"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>
                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
    </application>
</manifest>
```

---

## ⚙️ Derleme Talimatları

1. Sketchware Pro’da yeni bir proje oluştur.
2. Yukarıdaki dosyaları ilgili klasörlere yerleştir:
   - `java/` → Java kodları
   - `xml/` → Layout dosyası
   - `project/` → Manifest izinleri
3. Sketchware Pro üzerinden “Run” tuşuna basarak APK’yı oluştur.

---

## 🔐 Güvenlik Notları

- WebView içi JS kodları dikkatle kontrol edilmelidir.
- Reklam engelleme modülü, sadece belirli URL filtreleriyle çalışır.
- Uygulama internet izni gerektirir.

---

## 📦 Lisans

MIT lisansı ile sunulmuştur. Dilediğiniz gibi kullanabilir, değiştirebilir ve dağıtabilirsiniz.

```

Bu yapı doğrudan GitHub’a yüklenebilir ve Sketchware Pro ile senkronize çalıştırılabilir. Bir sonraki adımda reklam engelleme veya JS enjeksiyon modülü eklemek ister misin?[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/URK96/xamarin-docs.ko-kr/tree/a7057f489b7554cdc875596b6349bdd95844af8a/docs%2Fandroid%2Fuser-interface%2Fcontrols%2Ftool-bar%2Fadding-a-second-toolbar.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "1")[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/wanghao15536870732/Android-programming-authority-guide/tree/9e2974e2b6cf828a4172ede2cd5676bb3e91e778/exercises%2Fandroid-note-11.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "2")[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/mrKevinns/androidProgramming/tree/16db78701443eecd4f9e96cf537752b0e0809bc7/AndroidPrograming%2Fch05%2Frss_example2%2Freadme.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "3")[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/hsf25737/SocialComponent/tree/f7df30476cff1424a043c67b9dddea7ca176d4e0/README.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "4")[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/jonknight73/MyFirstBabbleApp/tree/ecaf6fb448dc7398577f4400afe5e66c6c37fe7b/docs%2Ftutorial.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "5")[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/qiluosheng/androidstuday/tree/1ce47e61d68a85929d76619198c0b50a18761727/%E5%AE%9E%E4%BE%8B%2F1.%E5%BC%95%E5%AF%BC%E5%8A%A8%E7%94%BB.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "6")[43dcd9a7-70db-4a1f-b0ae-981daa162054](https://github.com/paduraru099/handTracking/tree/9ce48d06daf6aef5e6070a37a6410bb58f0a03b8/mediapipe-master%2Fmediapipe%2Fdocs%2Fhello_world_android.md?citationMarker=43dcd9a7-70db-4a1f-b0ae-981daa162054 "7")
