package com.example.bindingadapter
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter

@BindingAdapter("toast")
fun getToast(view: View, text: String?) {
    Toast.makeText(view.context, text,Toast.LENGTH_SHORT).show()
}
