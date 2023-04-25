package com.example.recyclerview



public class Modelclass {
    private var imageview:Int=0
    private var textview1:String = ""
    private var textview2:String = ""
    private var textview3:String = ""
    private var divider:String = ""

    constructor(textview1:String,textview2:String,textview3:String,divider:String,imageview:Int)
    {
        this.imageview=imageview
        this.textview1=textview1
        this.textview2=textview2
        this.textview3=textview3
        this.divider=divider
    }
    public fun getimageview() :Int
    {
        return imageview
    }
    public fun gettextview1() :String
    {
        return textview1
    }
    public fun gettextview2() :String
    {
        return textview2
    }
    public fun gettextview3() :String
    {
        return textview3
    }
    public fun getdivider() :String
    {
        return divider
    }

}