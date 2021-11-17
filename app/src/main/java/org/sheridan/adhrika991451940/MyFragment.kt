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


class MyFragment : Fragment() {
    companion object {
        fun newInstance(message: String): MyFragment {
            val f = MyFragment()
            val bdl = Bundle(1)
            bdl.putString(EXTRA_MESSAGE, message)
            f.setArguments(bdl)
            return f

        }
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

        textView!!.text = "Canada"
        imageView!!.setImageResource(R.drawable.canada)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textView2!!.text =
                    "Canada is a country in the northern part of North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres (3.85 million square miles), making it the world's second-largest country by total area. "

            }})
        return view
    }


}