android-iconkit
===

An Android library that help you to build app with vector icon(font icon).

**With ```iconkit```you`ll never need to copy different dpi images (ldpi, mdpi, hdpi, xhdpi, xxhdpi..) for each icon you want to use in your app. you can also change their color or size easily.The code use Font-Awesome for showing.You can create other icon fonts by [icomoon](https://icomoon.io)**

**using icon font (like fontawesome.ttf) 400+ icons only ```112KB``` with all kind of color and size。[All Font-Awesom available icons](http://fortawesome.github.io/Font-Awesome/icons)**

**[All Demo available icons](https://github.com/Tank000/android-iconkit/blob/master/iconkit/res/values/icons.xml)**


### About

**iconkit** allows you to use any of the icon font like **[FontAwesome 4.1.0 icons by Dave Gandy](http://fortawesome.github.io/Font-Awesome/icons)** in your android app. Icons are infinitely **scalable**, and **customizable** with shadows and everything you can do on texts.

### How to Use(CustomView) #1 

If you need icons on a ```TextView```, find string in string.xml.

```xml
<IconTextView
    android:text="@string/fa_github"
    android:shadowColor="#22000000"
    android:shadowDx="3"
    android:shadowDy="3"
    android:shadowRadius="1"
    android:textSize="90dp"
    android:textColor="#FF33B5E5"
    ... />
```

> You can either use ```IconTextView``` / ```IconButton``` or use any ```TextView``` and then programmatically call ```setTypeface(Util.getTypeFace(getContext()));``` and ```setText(R.id.xxxx)```.


### How to Use(IconDrawable) #2

If you need an icon in an ```ImageView``` or in your ```ActionBar```, then you should use ```IconDrawable```. Again, icons are infinitely scalable and will never get fuzzy!

```java
// Set an icon in the ActionBar
getMenuInflater().inflate(R.menu.main, menu);
MenuItem github = menu.findItem(R.id.action_github);
		IconDrawable ic = new IconDrawable(this, R.string.fa_github);
		ic.setDPSize(this, 48);
		ic.setColor(Color.WHITE);
		github.setIcon(ic);
```

-----


## License

```
Copyright 2014 tank

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

It uses FontAwesome font by Dave Gandy, licensed under OFL 1.1, which is compatible
with this library's license.

    http://scripts.sil.org/cms/scripts/render_download.php?format=file&media_id=OFL_plaintext&filename=OFL.txt
    
```
