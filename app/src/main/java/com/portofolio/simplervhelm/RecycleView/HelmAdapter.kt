package com.portofolio.simplervhelm.RecycleView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.portofolio.simplervhelm.Data.Helm
import com.portofolio.simplervhelm.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_helm.view.*

class HelmAdapter(private val helms: List<Helm>): RecyclerView.Adapter<HelmAdapter.HelmHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelmHolder {
        return HelmHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_helm, parent, false))
    }

    override fun getItemCount(): Int {
        return helms.size
    }

    override fun onBindViewHolder(holder: HelmHolder, position: Int) {
        holder.bindHelm(helms[position])
    }

    inner class HelmHolder(view: View): RecyclerView.ViewHolder(view) {
        private val imgView = view.imgViewHelm
        private val tvNamaHelm = view.tv_namaHelm
        private val tvHargaHelm = view.tv_hargaHelm

        fun bindHelm(helm: Helm){
            tvNamaHelm.text = helm.name
            tvHargaHelm.text = helm.harga

            //get Image from url
            Picasso.get().load(helm.image).into(imgView)
        }
    }

}

