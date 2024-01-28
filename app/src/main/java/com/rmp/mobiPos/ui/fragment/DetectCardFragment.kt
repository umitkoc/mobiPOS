package com.rmp.mobiPos.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.rmp.emvnfcdemo.R
import com.rmp.mobiPos.ui.UiAction

class DetectCardFragment(
    private val amount: String,
    private val cb: (UiAction) -> Unit
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detect_card, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tv_amount).text = amount
        view.findViewById<Button>(R.id.btn_cancel).setOnClickListener {
            cb.invoke(UiAction.CANCEL)
        }

    }
}