package net.kisacasi.clipboardmanagersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.ClipData
import android.content.ClipDescription.MIMETYPE_TEXT_PLAIN
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.CLIPBOARD_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var pasteData:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Kopyala(view:View) {
        var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(null,et_Text.text)
        clipboard.setPrimaryClip(clip)

    }
    fun Yapistir(view:View) {
        var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        try {
            val textToPaste = clipboard.primaryClip.getItemAt(0).text
            tv_Paste.text=textToPaste
        } catch (e: Exception) {
            return
        }

    }
}
