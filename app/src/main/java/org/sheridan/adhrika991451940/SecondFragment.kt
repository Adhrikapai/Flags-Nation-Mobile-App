package org.sheridan.adhrika991451940
/**
 * Name: Adhrika Pai
 * Student No: 991451940
 * Midterm Exam - Variant A
 */
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import org.sheridan.adhrika991451940.R


class SecondFragment : Fragment() {
    companion object {
        fun newInstance(message: String): SecondFragment {
            val f = SecondFragment()
            val bdl = Bundle(1)
            bdl.putString(EXTRA_MESSAGE, message)
            f.setArguments(bdl)
            return f

        }
    }
    fun SecondFragment(){

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View? = inflater.inflate(R.layout.fragment_main, container, false);

        //  val message = arguments!!.getString(EXTRA_MESSAGE)
        var textView: TextView = view!!.findViewById(R.id.textView)
        val imageView = view!!.findViewById<ImageView>(R.id.imageView)
        var button: Button = view!!.findViewById(R.id.button)
        var textView2: TextView = view!!.findViewById(R.id.textView2)

        textView!!.text = "United States of America"
        imageView!!.setImageResource(R.drawable.america)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView2!!.text = "The United States of America (USA), commonly known as the United States (U.S. or US) or America, is a country comprising 50 states, a federal district, five major self-governing territories, and various possessions. "
            }

        })
        return view
    }


}