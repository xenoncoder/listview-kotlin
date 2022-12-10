package git.rainpedia.bahasapemrograman

import android.annotation.SuppressLint
import android.app.Activity
import android.view.*
import android.widget.*

class MyListAdapter(private val context: Activity, private val judul: Array<String>, private val deskripsi: Array<String>, private val gambar: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.custom_list, judul) {

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.description) as TextView

        titleText.text = judul[position]
        imageView.setImageResource(gambar[position])
        subtitleText.text = deskripsi[position]

        return rowView
    }
}