package zxh.com.kotlin_demo

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            button("客官请点菜谱") {
                backgroundResource=Color.TRANSPARENT
                textColor = Color.RED
                textSize = 24.0f
                onClick {
                    val seleList = listOf("西红柿", "红烧肉", "土豆丝","微辣火锅","干锅酱鸭","干锅土豆片")
                    selector("你想吃什么", seleList, { _, i ->
                        toast("客官请稍等,您要的" + seleList[i]+"马上出锅")
                    })
                }
            }
        }
    }

}
