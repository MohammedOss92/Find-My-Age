package com.example.mfindmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        buGetAge.setOnClickListener({
//           val  yearOfbirth:Int = etUserYearBirth.text.toString().toInt()
//            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//            val age = currentYear - yearOfbirth
//            tvShowAge.text="Your age is " + age + " Years"
//        });

        buGetAge.setOnClickListener(this)

    }

    private fun validate(): Boolean {
        if (etUserYearBirth.text.toString().isEmpty()) {
            etUserYearBirth.error = "الرجاء إدخال سنة ميلادك"
            return false
        }
        return true
    }

//    fun buClickEvent(view:View){
//        val  yearOfbirth:Int = etUserYearBirth.text.toString().toInt()
//        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//        val age = currentYear - yearOfbirth
//        tvShowAge.text="Your age is $age "+"Years"
//    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.buGetAge->{
                if (validate()){
                    Toast.makeText(applicationContext,"Done",Toast.LENGTH_LONG).show()
                    val  yearOfbirth:Int = etUserYearBirth.text.toString().toInt()
                    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                    val age = currentYear - yearOfbirth
                    tvShowAge.text="Your age is $age "+"Years"
                }
            }
        }
    }
}
