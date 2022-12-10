package git.rainpedia.bahasapemrograman

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val daftarBahasaPemrograman =
        arrayOf("C", "C++", "C#", "Dart", "Golang", "Java", "JavaScript", "Kotlin", "Ruby", "Swift")

    private val deskripsiBahasaPemrograman = arrayOf(
        "Bahasa Pemrograman C adalah bahasa pemrograman procedural programming yang dibuat oleh Dennis Ritchie.",
        "Bahasa Pemrograman C++ adalah bahasa pemrograman object oriented programming (OOP) yang dibuat oleh Bjarne Stroustrup.",
        "Bahasa Pemrograman C# adalah bahasa pemrograman berorientasi objek yang dibuat oleh Anders Hejlsberg.",
        "Bahasa Pemrogaman Dart adalah bahasa pemrograman berorientasi objek yang dibuat oleh Lars Bak dan Kasper Lund.",
        "Bahasa Pemrograman Golang adalah bahasa pemrograman procedural, fungsional dan concurrent yang dibuat oleh Robert Griesemer, Rob Pike, dan Ken Thompson.",
        "Bahasa Pemrograman Java adalah bahasa pemrograman berorientasi objek yang dibuat oleh James Gosling.",
        "Bahasa Pemrograman JavaScript adalah bahasa pemrograman imperatif, fungsional, dan berorientasi objek yang dibuat oleh Brendan Eich.",
        "Bahasa Pemrograman Kotlin adalah bahasa pemrograman berorientasi objek yang dibuat oleh JetBrains.",
        "Bahasa Pemrograman Ruby adalah bahasa pemrograman berorientasi objek yang dibuat oleh Yukihiro Matsumoto.",
        "Bahasa Pemrograman Swift adalah bahasa pemrograman multi-paradigma yang dibuat oleh Apple."
    )

    private val gambarBahasaPemrograman = arrayOf(
        R.drawable.image_c,
        R.drawable.image_cplusplus,
        R.drawable.image_csharp,
        R.drawable.image_dart,
        R.drawable.image_golang,
        R.drawable.image_java,
        R.drawable.image_javascript,
        R.drawable.image_kotlin,
        R.drawable.image_ruby,
        R.drawable.image_swift
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this, daftarBahasaPemrograman, deskripsiBahasaPemrograman, gambarBahasaPemrograman)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            Toast.makeText(
                this,
                "Kamu mengklik bahasa pemrograman $itemAtPos",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}