package com.alexkong.groceries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SpecialsFragment: Fragment() {

    companion object {
        fun newInstance(): SpecialsFragment {
            val frag = SpecialsFragment()
            val args = Bundle()
            frag.arguments = args
            return frag
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_specials, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeUi(view)
    }

    private fun initializeUi(root: View) {
        val recyclerView: RecyclerView = root.findViewById(R.id.rv_specials)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = SpecialsAdapter()
    }
}