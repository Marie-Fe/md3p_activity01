package com.android.activity01_a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.android.activity01_a.databinding.ActivityMainBinding
import com.android.activity01_a.databinding.FragmentFirstBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding = null!!



    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setContentView(R.layout.fragment_first)

        val constraintlayout = view.findViewById<ConstraintLayout>(R.id.constraintLayout0)
        val text1=view.findViewById<TextView>(R.id.textView)
        text1.text
        val textinput1 = view.findViewById<TextInputLayout>(R.id.textInputLayout)
        val textInputEditText1 = view.findViewById<TextInputEditText>(R.id.first)
        textInputEditText1.editableText
        val text2 = view.findViewById<TextView>(R.id.textView3)
        text2.text
        val textInputEditText2 = view.findViewById<TextInputEditText>(R.id.inputtext)
        textInputEditText2.text
        val text3 = view.findViewById<TextView>(R.id.third)
        text3.text
        val editText = view.findViewById<EditText>(R.id.editTextDate)
        editText.editableText
        val text4 = view.findViewById<TextView>(R.id.textView2)
        text4.text
        val textInputEditText3 = view.findViewById<TextInputEditText>(R.id.ln)
        textInputEditText3.editableText
        val textInputEditText4 = view.findViewById<TextInputEditText>(R.id.fn)
        textInputEditText4.editableText
        val textInputEditText5 = view.findViewById<TextInputEditText>(R.id.m)
        textInputEditText5.editableText
        val textInputEditText6 = view.findViewById<TextInputEditText>(R.id.address)
        textInputEditText6.editableText
        val textInputEditText7 = view.findViewById<TextInputEditText>(R.id.city)
        textInputEditText7.editableText
        val textInputEditText8 = view.findViewById<TextInputEditText>(R.id.state)
        textInputEditText8.editableText
        val textInputEditText9 = view.findViewById<TextInputEditText>(R.id.zip)
        textInputEditText9.editableText
        val editText1 = view.findViewById<EditText>(R.id.editTextPhone)
        editText1.editableText
        val editText2 = view.findViewById<EditText>(R.id.editTextPhone1)
        editText2.editableText
        val text5 = view.findViewById<TextView>(R.id.textView4)
        text5.text
        val editText3 = view.findViewById<EditText>(R.id.editTextPhone2)
        editText3.editableText
        val text6 = view.findViewById<TextView>(R.id.textView5)
        text6.text
        val radio = view.findViewById<RadioButton>(R.id.radioButton)
        val radio1 = view.findViewById<RadioButton>(R.id.radioButton1)
        val text7 = view.findViewById<TextView>(R.id.textView6)
        text7.text
        val radio2 = view.findViewById<RadioButton>(R.id.radioButton2)
        val radio3 = view.findViewById<RadioButton>(R.id.radioButton3)
        val text8 = view.findViewById<TextView>(R.id.textView7)
        text8.text
        val radio4 = view.findViewById<RadioButton>(R.id.radioButton4)
        val radio5 = view.findViewById<RadioButton>(R.id.radioButton5)
        val table1 = view.findViewById<TableLayout>(R.id.tableLayout1)
        val horiview = view.findViewById<HorizontalScrollView>(R.id.hsv)
        val linearlayout = view.findViewById<LinearLayout>(R.id.linearLayout)
        val text9 = view.findViewById<TextView>(R.id.textView11)
        text9.text
        val tableRow = view.findViewById<TableRow>(R.id.tabrow1)
        val text10 = view.findViewById<TextView>(R.id.textView19)
        text10.text
        val text11 = view.findViewById<TextView>(R.id.textView20)
        text11.text
        val text12 = view.findViewById<TextView>(R.id.textView21)
        text12.text
        val text13 = view.findViewById<TextView>(R.id.textView22)
        text13.text
        val text14 = view.findViewById<TextView>(R.id.textView23)
        text14.text
        val tableRow1 = view.findViewById<TableRow>(R.id.tabrow2)
        val textInputEditText10 = view.findViewById<TextInputEditText>(R.id.editText2)
        textInputEditText10.editableText
        val textInputEditText11 = view.findViewById<TextInputEditText>(R.id.editText3)
        textInputEditText11.editableText
        val textInputEditText12 = view.findViewById<TextInputEditText>(R.id.editText4)
        textInputEditText12.editableText
        val textInputEditText13 = view.findViewById<TextInputEditText>(R.id.editText)
        textInputEditText13.editableText
        val textInputEditText14 = view.findViewById<TextInputEditText>(R.id.edittext)
        textInputEditText14.editableText
        val text15 = view.findViewById<TextView>(R.id.textView24)
        text15.text
        val editText4 = view.findViewById<EditText>(R.id.editTextTextPersonName)
        editText4.editableText
        val table2 = view.findViewById<TableLayout>(R.id.tableLayout2)
        val text16 = view.findViewById<TextView>(R.id.textView25)
        text16.text
        val text17 = view.findViewById<TextView>(R.id.textView26)
        text17.text
        val editText5 = view.findViewById<EditText>(R.id.editTextTextPersonName3)
        editText5.editableText
        val text18 = view.findViewById<TextView>(R.id.textView28)
        text18.text
        val editText6 = view.findViewById<EditText>(R.id.editTextDate2)
        editText6.editableText
        val text19 = view.findViewById<TextView>(R.id.textView29)
        text19.text
        val editText7 = view.findViewById<EditText>(R.id.editTextPhone3)
        editText7.editableText
        val text20 = view.findViewById<TextView>(R.id.textView30)
        text20.text
        val editText8 = view.findViewById<EditText>(R.id.editTextNumber2)
        editText8.editableText
        val text21 = view.findViewById<TextView>(R.id.textView32)
        text21.text
        val editText9 = view.findViewById<EditText>(R.id.editTextNumber3)
        editText9.editableText
        val editText10 = view.findViewById<EditText>(R.id.editTextTextPostalAddress)
        editText10.editableText
        val editText11 = view.findViewById<EditText>(R.id.editTextTextPersonName4)
        editText11.editableText
        val editText12 = view.findViewById<EditText>(R.id.editTextTextPersonName5)
        editText12.editableText
        val editText13 = view.findViewById<EditText>(R.id.editTextNumber4)
        editText13.editableText
        val textinput2 = view.findViewById<TextInputLayout>(R.id.textInputLayout0)
        textinput2.editText
        val textInputEditText15 = view.findViewById<TextInputEditText>(R.id.position)
        textInputEditText15.editableText
        val textInputEditText16 = view.findViewById<TextInputEditText>(R.id.dutiesperformed)
        textInputEditText16.editableText
        val text22 = view.findViewById<TextView>(R.id.textView31)
        text22.text
        val textinput3 = view.findViewById<TextInputLayout>(R.id.tiu)
        textinput3.editText
        val textInputEditText17 = view.findViewById<TextInputEditText>(R.id.supAndpos)
        textInputEditText17.editableText
        val textinput4 = view.findViewById<TextInputLayout>(R.id.tui1)
        textinput4.editText
        val textInputEditText18 = view.findViewById<TextInputEditText>(R.id.leaving)
        textInputEditText18.text
        val text23 = view.findViewById<TextView>(R.id.textView33)
        text23.text
        val radio6 = view.findViewById<RadioButton>(R.id.radioButton8)
        val radio7 = view.findViewById<RadioButton>(R.id.radioButton7)
        val table3 = view.findViewById<TableLayout>(R.id.tableLayout4)
        val text24 = view.findViewById<TextView>(R.id.textView34)
        text24.text
        val tableRow6 = view.findViewById<TableRow>(R.id.tab1)
        val text25 = view.findViewById<TextView>(R.id.textView35)
        text25.text
        val text26 = view.findViewById<TextView>(R.id.textView37)
        text26.text
        val text27 = view.findViewById<TextView>(R.id.textView36)
        text27.text
        val text28 = view.findViewById<TextView>(R.id.textView38)
        text28.text
        val tableRow7 = view.findViewById<TableRow>(R.id.tab2)
        val textinput5 = view.findViewById<TextInputLayout>(R.id.a)
        textinput5.editText
        val textInputEditText19 = view.findViewById<TextInputEditText>(R.id.ab)
        textInputEditText19.text
        val textinput6 = view.findViewById<TextInputLayout>(R.id.b)
        textinput6.editText
        val textInputEditText20 = view.findViewById<TextInputEditText>(R.id.ba)
        textInputEditText20.text
        val textinput7 = view.findViewById<TextInputEditText>(R.id.c)
        textinput7.text
        val textInputEditText21 = view.findViewById<TextInputEditText>(R.id.ca)
        textInputEditText21.text
        val textinput8 = view.findViewById<TextInputEditText>(R.id.d)
        textinput8.text
        val textInputEditText22 = view.findViewById<TextInputEditText>(R.id.da)
        textInputEditText22.editableText
        val tableRow8 = view.findViewById<TableRow>(R.id.tab3)
        val textinput9 = view.findViewById<TextInputLayout>(R.id.e)
        textinput9.editText
        val textInputEditText23 = view.findViewById<TextInputEditText>(R.id.ea)
        textInputEditText23.editableText
        val textinput10 = view.findViewById<TextInputLayout>(R.id.f)
        textinput10.editText
        val textInputEditText24 = view.findViewById<TextInputEditText>(R.id.fa)
        textInputEditText24.editableText
        val textinput11 = view.findViewById<TextInputEditText>(R.id.g)
        textinput11.editableText
        val textInputEditText25 = view.findViewById<TextInputEditText>(R.id.ga)
        textInputEditText25.editableText
        val textinput12 = view.findViewById<TextInputEditText>(R.id.h)
        textinput12.editableText
        val textInputEditText26 = view.findViewById<TextInputEditText>(R.id.ha)
        textInputEditText26.editableText
        val table4 = view.findViewById<TableLayout>(R.id.tableLayout5)
        val text29 = view.findViewById<TextView>(R.id.textView40)
        text29.text
        val checkbox = view.findViewById<CheckBox>(R.id.checkBox)
        val text30 = view.findViewById<TextView>(R.id.textView39)
        text30.text
        val checkbox1 = view.findViewById<CheckBox>(R.id.checkBox1)
        val text31 = view.findViewById<TextView>(R.id.textView49)
        text31.text
        val checkbox2 = view.findViewById<CheckBox>(R.id.checkBox2)
        val text32 = view.findViewById<TextView>(R.id.textView69)
        text32.text
        val editText15 = view.findViewById<EditText>(R.id.editTextDate3)
        editText15.editableText
        val text33 = view.findViewById<TextView>(R.id.textView42)
        text33.text
        val text34 = view.findViewById<TextView>(R.id.textView41)
        text34.text
        val textinput20 = view.findViewById<TextInputLayout>(R.id.yui3)
        val textInputEditText39 = view.findViewById<TextInputEditText>(R.id.tie)
        textInputEditText39.editableText
    }

    private fun setContentView(fragmentFirst: Int) {

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null!!
    }
}