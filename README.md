# MyCustomToast-Android-Custom-Toast-With-Icon-and-color

A simple way to customize your toast with different colors and icon!
<br>


## Installation

1. To modify your toast you have to copy a class in your project which I created called <a href="https://github.com/meet30997/MyCustomToast-Android-Custom-Toast-With-Icon-and-color/blob/master/app/src/main/java/com/backendme/customtoast/Mytoast.kt">Mytoast</a>

2. And You have to copy a custom layout for toast, Which I created called <a href="https://github.com/meet30997/MyCustomToast-Android-Custom-Toast-With-Icon-and-color/blob/master/app/src/main/res/layout/toast_layout.xml">toast_layout.xml</a>

## Usage
<br>

There is a only one standard method to display customized toast, This method returns a customized toast!

```
Mytoast().make(
                this,
                "Please Check Your Internet Connection!",
                Toast.LENGTH_SHORT,
                "#f44336",     // Toast BackgroundColor
                #ffffff,      // Toast TextColor
                R.drawable.ic_warning_black_24dp   // Drawable Int
            ).show()
```
<br>

As You can see this method takes 3 extra values to make a toast.

1.  It takes string value of color for toast <b>background.</b>

2.  It takes string value of color for toast <b>textcolor.</b>

3.  It takes drawable Int to display icon in Toast.

<b>Please call `show()` method to display the toast.</b><br><br>

<p align="center">
<img src="https://drive.google.com/uc?id=1bcjKQMFSUVagwAKH6vOZMnrdLdvsFY4W"/>
</p>

## How to contribute?
1. Fork the project.
2. Make required changes and commit.
3. Generate pull request. Mention all the required description regarding changes you made. Happy coding.:-)
