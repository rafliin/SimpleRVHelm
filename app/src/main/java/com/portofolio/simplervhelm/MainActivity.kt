package com.portofolio.simplervhelm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.portofolio.simplervhelm.Data.Helm
import com.portofolio.simplervhelm.RecycleView.HelmAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listHelm = listOf(
            Helm(image = "https://firebasestorage.googleapis.com/v0/b/aplikasihelm.appspot.com/o/gambar%2FMT%20Blade%202SV%2089%20Motorcycle%20Helmet_2.jpg?alt=media&token=db71d3b5-cbf9-4558-848d-3d437ad6304c", name = "MT Blade 2SV 89 Motorcycle Helmet", harga = "Rs. 7,999.00")
        )

        val helmsAdapter = HelmAdapter(listHelm)

        rvHelm.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = helmsAdapter
        }
    }
}
