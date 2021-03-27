package com.shm.cluedoapp

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatCheckBox
import com.shm.cluedoapp.R


class TriStatesCheckBox : AppCompatCheckBox {
    private var state = 0

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
            context,
            attrs
    ) {
        init()
    }

    constructor(
            context: Context?,
            attrs: AttributeSet?,
            defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        state = UNCHECKED
        updateBtn()
        setOnCheckedChangeListener { buttonView, isChecked ->
            // checkbox status is changed from uncheck to checked.
            state = when (state) {
                INDETERMINATE -> CHECKED
                ANSWER -> INDETERMINATE
                UNCHECKED -> ANSWER
                CHECKED -> UNCHECKED
                else -> CHECKED
            }
            updateBtn()
        }
    }

    private fun updateBtn() {
        var btnDrawable = R.drawable.ic_indeterminate
        btnDrawable = when (state) {
            INDETERMINATE -> R.drawable.ic_indeterminate
            UNCHECKED -> R.drawable.ic_unchecked
            CHECKED -> R.drawable.ic_checked
            ANSWER -> R.drawable.ic_answer
            else -> R.drawable.ic_unchecked
        }
        setButtonDrawable(btnDrawable)
    }

    fun getState(): Int {
        return state
    }

    fun setState(state: Int) {
        this.state = state
        updateBtn()
    }

    companion object {
        private const val UNCHECKED = 0
        private const val INDETERMINATE = 1
        private const val CHECKED = 2
        private const val ANSWER = 3
    }
}