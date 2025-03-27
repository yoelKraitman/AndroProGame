# Android Clicker

A simple clicker app made with Firebase & Java

## How to use this project

’ve been giving talks and making presentations for a while and sometimes you may need a remote controller for your presentation.

Clickers provide a solution to this problem but I don’t really like carrying that little thing to everywhere with me and they are generally expensive.

So my idea was to control the presentation from my android phone. I searched for an app in Play Store and ended up not liking any of the apps that are available.

I wanted a simple controller with two actions : next , previous

So I thought I could make an app for myself.
My app simply works like this :
We have a firebase database set for this app. It holds only one single value which is either l, r or 0 as in left, right or none. I will explain the zero later :)
We have one Java desktop app for listening to the changes at the database and using Java’s Robot framework this program will simulate a press of either the left arrow button or the right arrow button.
And finally we have our Android app which acts as a controller. Simply this app listens to swipe gestures and on gestures it writes to the database accordingly.



## Authors

YSK
