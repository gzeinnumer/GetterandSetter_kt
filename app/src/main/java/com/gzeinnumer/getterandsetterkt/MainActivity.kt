package com.gzeinnumer.getterandsetterkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p = Person()
        p.fname = "Zein"
        p.mname = "Zein"
        p.lname = "Pai"
        println({p.fname})
        println({p.mname})
        println({p.lname})
    }
}

class Person{
    var fname: String = "default value"
    get() = field

    set(value){
        field = value
    }

    var lname:String = "default value"

    var mname:String = "default value"

}
