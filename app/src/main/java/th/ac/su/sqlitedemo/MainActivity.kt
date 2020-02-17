package th.ac.su.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import th.ac.su.sqlitedemo.adapter.ListStudentAdapter
import th.ac.su.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    var listStudent = ArrayList<Student>()

    lateinit var listViewStudent:ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var student1 = Student(111,"piyada","piyada@gmail.com")
        var student2 = Student(222,"waepa","waepa@gmail.com")
        var student3 = Student(333,"ppra","ppra@gmail.com")
        var student4 = Student(444,"ppra","ppra@gmail.com")
        var student5 = Student(555,"ppra","ppra@gmail.com")
        var student6 = Student(666,"ppra","ppra@gmail.com")
        var student7 = Student(777,"ppra","ppra@gmail.com")
        var student8 = Student(888,"ppra","ppra@gmail.com")

        listStudent.add(student1)
        listStudent.add(student2)
        listStudent.add(student3)
        listStudent.add(student4)
        listStudent.add(student5)
        listStudent.add(student6)
        listStudent.add(student7)
        listStudent.add(student8)


        listViewStudent =  findViewById<ListView>(R.id.listStudent)


        reloadData()
    }

    fun reloadData(){

        val adapter = ListStudentAdapter(this@MainActivity,listStudent)
        listViewStudent.adapter = adapter
    }


}