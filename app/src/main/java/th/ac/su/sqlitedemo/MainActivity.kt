package th.ac.su.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import th.ac.su.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    var listStudent:List<Student> = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var student1 = Student( 124, "piyada", "Waengsothon_p@gmail.com")
        var student2 = Student( 124, "piyada", "Waengsothon_p@gmail.com")
        var student3 = Student( 124, "piyada", "Waengsothon_p@gmail.com")

        listStudent.

    }
}
