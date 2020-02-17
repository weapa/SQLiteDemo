package th.ac.su.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.su.sqlitedemo.adapter.ListStudentAdapter
import th.ac.su.sqlitedemo.dbhelper.DBHelper
import th.ac.su.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    var listStudent = ArrayList<Student>()

    lateinit var listViewStudent:ListView

    lateinit var dbHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        dbHelper = DBHelper(this)

        listViewStudent =  findViewById<ListView>(R.id.listStudent)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val edtId = findViewById<EditText>(R.id.edtId)
        val edtName = findViewById<EditText>(R.id.edName)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)

        btnAdd.setOnClickListener {
            val student= Student(edtId.text.toString().toInt(),edtName.text.toString(),edtEmail.text.toString())

            dbHelper.addStudunt(student)
            reloadData()

        }

        reloadData()
    }

    fun reloadData(){

        listStudent = dbHelper.allStudent
        val adapter = ListStudentAdapter(this@MainActivity,listStudent)
        listViewStudent.adapter = adapter
    }


}