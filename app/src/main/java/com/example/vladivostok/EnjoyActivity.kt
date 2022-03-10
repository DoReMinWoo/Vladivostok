package com.example.vladivostok

import EnjoyAdapter
import com.example.vladivostok.DataModel.EnjoyData
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_enjoy.*

class EnjoyActivity : AppCompatActivity() {
    val DataList = arrayListOf(
        EnjoyData(R.drawable.enjoy1, R.drawable.enjoy1_1, R.drawable.enjoy1_2, "마트료시카",
            "마트료시카는 '어머니 인형'이라는 뜻의 러시아 전통 목각인형으로 인형 속에 인형이 들어있고, 그 안에 또 인형이 들어있고, 그 안에 또 인형이 들어 있다. 행운과 다산, 부유함을 상징하여 인테리어 소품이나 러시아 여행 선물로도 인기가 많다."),
        EnjoyData(R.drawable.enjoy2, R.drawable.enjoy2_1, R.drawable.enjoy2_2, "마약 반야(Mayak banya)",
            "블라디보스톡 마약 반야라는 지역에 위치한 러시아식 사우나 시설이다. 마약 반야는 사우나 앞에 바다가 있기 때문에 '바다 반야'로도 불리우며, 마약(Mayak)은 러시아어로 등대를 뜻한다.\n" +
                    "Small banya -> 1시간당 1500루블(한화 25000원)\n " +
                    "Big banya -> 1시간당 2000루블(한화 33000원"),
        EnjoyData(R.drawable.enjoy3, R.drawable.enjoy3_1, R.drawable.enjoy3_2,
                "러시아 공연예술", "블라디보스톡 마린스키극장에서는 발레를 기반으로 한 러시아식 공연예술을 관람할 수 있다." +
                    "많은 공연 가운데 유명하다고 생각하는 백조의 호수를 관람할 수 있다." +
                    "가격은 한화로 4만원 정도면 관람 가능하다.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enjoy)

        recycler_enjoy.layoutManager = LinearLayoutManager(this)
        recycler_enjoy.adapter = EnjoyAdapter(DataList)

    }
}

