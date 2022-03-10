package com.example.vladivostok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vladivostok.Adapter.TripAdapter
import com.example.vladivostok.DataModel.TripData
import kotlinx.android.synthetic.main.activity_trip.*

class TripActivity : AppCompatActivity() {

    val DataList = arrayListOf(
        TripData("금각교", "금각만을 가로지르는 대교로" +
                "\n블라디보스토크의 마스코트다.", R.drawable.trip1,
            "금각교\n\n" +
                    "> 금각만을 가로지르는 대교로 블라디보스토크의 마스코트다. \n" +
                    "> 주소 : Bridge across Goldern Horn Bay, Vladivostok Russia \n" +
                    "> 전화 : +7 914 791-15-88\n"),
        TripData("에게르쉘드", "극동 지역에서 가장 오래된 등대", R.drawable.trip2,
            "에게르쉘드\n\n" +
                    "> 극동 지역에서 가장 오래된 등대\n" +
                    "> 주소 : Tokarevsky Cape, Vladivostok 690065 Russia\n"),
        TripData("독수리 전망대", "블라디보스토크에서 가장 높은 곳.\n" +
                "도시의 전망대 역할을 하는 관광 명소다.", R.drawable.trip3,
            "독수리 전망대\n\n" +
                    "> 블라디보스토크에서 가장 높은 곳. 도시의 전망대 역할을 하는 관광 명소\n" +
                    "> 주소 : Vladivostok 28-13 Russia\n"),
        TripData("블라디보스토크 기차역", "17세기 러시아 양식으로" +
                "\n 지어진 화려한 기차역", R.drawable.trip4,
            "블라디보스토크 기차역\n\n" +
                    "> 17세기 러시아 양식으로 지어진 화려한 기차역\n" +
                    "> 주소 : Railroad Square, Vladivostok Russia\n" +
                    "> 가격 : 150~250 RUB\n" +
                    "> 전화 : +7 800 775-00-00"),
        TripData("체사레비치 제방", "금각교를 가장 가까이" +
                "\n감상할 수 있는 젊은 휴식처", R.drawable.trip5,
            "체사레비치 제방\n\n" +
                    "> 금각교를 가장 가까이 감상할 수 있는 젊은 휴식처\n" +
                    "> 주소 : Dalzavodskaya St., Vladivostok Russia\n" +
                    "> 전화 : +7 914 791-15-88\n"),
        TripData("블라디보스토크 개선문", "니콜라이 2세를 기리는 개선문", R.drawable.trip6,
            "블라디보스토크 개선문\n\n" +
                    "> 금각교를 가장 가까이 감상할 수 있는 젊은 휴식처\n" +
                    "> 주소 : Petra Velikogo St., 6, Vladivostok 690091 Russia\n" +
                    "> 공식 홈페이지 : https://vladivostok-city.com/places/all/all/893\n")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip)

        recycler_trip.layoutManager = LinearLayoutManager(this)
        recycler_trip.adapter = TripAdapter(DataList)

    }
}