package com.example.afternoonsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the elements on the user interface as variables
    lateinit var mAnswer:TextView
    lateinit var mFnum:EditText
    lateinit var msnum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFnum = findViewById(R.id.mEdtFnum)
        msnum = findViewById(R.id.mEdtSnum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mDiv = findViewById(R.id.mbtnDiv)
        mMul = findViewById(R.id.mBtnMul)
        // Set on click listeners on buttons
        mAdd.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
                // Display an error message on textview answer
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                // Display the result on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
                // Display an error message on textview answer
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() - secondNumber.toDouble()
                // Display the result on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
                // Display an error message on textview answer
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() / secondNumber.toDouble()
                // Display the result on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstNumber = mFnum.text.toString().trim()
            var secondNumber = msnum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
                // Display an error message on textview answer
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var jibu = firstNumber.toDouble() * secondNumber.toDouble()
                // Display the result on the textview answer
                mAnswer.text = jibu.toString()
            }
        }
    }
}