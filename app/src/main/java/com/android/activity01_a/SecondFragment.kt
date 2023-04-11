package com.android.activity01_a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class ResumeFragment : Fragment() {
    private var nameTextView: TextView? = null
    private var emailTextView: TextView? = null
    private var phoneTextView: TextView? = null
    private var educationTextView: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize the views
        nameTextView = view.findViewById(R.id.nameTextView)
        emailTextView = view.findViewById(R.id.emailTextView)
        phoneTextView = view.findViewById(R.id.phoneTextView)
        educationTextView = view.findViewById(R.id.educationTextView)



    }

}

