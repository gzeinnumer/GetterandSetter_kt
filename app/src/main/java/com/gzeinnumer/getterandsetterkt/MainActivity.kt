package com.gzeinnumer.getterandsetterkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val p = Person()
        p.umurAsli =15
        p.umur=15
        p.name="Zein"
        println("P : umur = ${p.umur}")
        println("P : umurAsli = ${p.umurAsli}")
        println("P : name = ${p.name}")

        val q = Person()
        q.umurAsli =35
        q.umur=35
        println("Q : umur = ${q.umur}")
        println("Q : umurAsli = ${q.umurAsli}")
    }
}

class Person{
    var umur: Int = 0
    get() = field

    set(value){
        field = value
    }

    var umurAsli:Int = 0

    var name:String = "default value"

}
