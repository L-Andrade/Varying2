package com.andradel.varying2

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

class ReleaseClickListener @Inject constructor() : VariantClickListener {
    override fun onClick(context: Context) {
        Toast.makeText(context, "This is a release toast!", Toast.LENGTH_LONG).show()
    }
}