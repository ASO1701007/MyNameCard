package jp.ac.asojuku.st.mynamecard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.ac.asojuku.st.mynamecard.R.id.btn_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main.setOnClickListener(){
            textView4.text = "moyo";
        }

    }


}
