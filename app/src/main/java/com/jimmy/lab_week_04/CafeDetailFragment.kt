package com.jimmy.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val TAB_CONTENT = "TAB_CONTENT"
class CafeDetailFragment : Fragment() {
    private var contentResId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            contentResId = it.getInt(TAB_CONTENT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.content_description)?.text = getString(contentResId)
    }

    companion object {
        fun newInstance(contentResId: Int) =
            CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(TAB_CONTENT, contentResId)
                }
            }
    }
}