package com.example.vladivostok

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleralbum.adapter.FoodAdapter
import com.example.vladivostok.DataModel.FoodData

class FoodActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: FoodAdapter? = null
    private var FoodList: MutableList<FoodData>? = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        recyclerView = findViewById(R.id.recycler_food)
        adapter = FoodAdapter(FoodList)
        recyclerView?.layoutManager = GridLayoutManager(this, 3)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter
        prepareAlbums()
    }
    private fun prepareAlbums() {
        val covers = intArrayOf(
            R.drawable.food1,
            R.drawable.food2_2,
            R.drawable.food3_2,
            R.drawable.food4,
            R.drawable.food5,
            R.drawable.food6,
            R.drawable.food7,
            R.drawable.food8,
            R.drawable.food9)
        var a = FoodData("우흐뜨 블린", "Ulitsa Admirala Fokina, 7, Vladivostok, Primorsky Krai", covers[0],
            "우흐뜨블린\n\n" +
                    "> 영업시간 : 매일 10:00~21:00\n" +
                    "> 주소 : Ulitsa Admirala Fokina, 7, Vladivostok, Primorsky Krai\n" +
                    "> 가격 : 햄치즈버섯 블린(245루블), 바나나 초콜릿 블린(190루블)")
        FoodList!!.add(a)
        a = FoodData("수프라", "Ulitsa Admirala Fokina, 1 б, Vladivostok, Primorsky Krai", covers[1],
            "수프라\n\n" +
                    "> 영업시간 : 매일 12:00~24:00\n" +
                    "> 주소 : Ulitsa Admirala Fokina, 1 б, Vladivostok, Primorsky Krai\n" +
                    "> 연락처 : +7 423 227-77-22\n" +
                    "> 가격 : 하차푸리 290루블(한화 약 4,500원), 힌깔리 105루블(한화 약 1,600원)")
        FoodList!!.add(a)
        a = FoodData("댑버거", "Ulitsa Aleutskaya, 21, Vladivostok, Primorsky Krai", covers[2],
            "댑버거\n\n" +
                    "> 영업시간 : 일~목요일 12:00~24:00, 금~토요일 12:00~06:00\n" +
                    "> 주소 : Ulitsa Aleutskaya, 21, Vladivostok, Primorsky Krai\n" +
                    "> 연락처 : +7 423 262-01-70\n" +
                    "> 가격 : 버거브라더스 380루블(한화 약 6,000원)")
        FoodList!!.add(a)
        a = FoodData("로즈키 플로스키", "Svetlanskaya St, 7, Vladivostok, Primorsky Krai", covers[3],
            "로즈키 플로스키\n\n" +
                    "> 영업시간 : 월~금요일 11:00~22:00, 토~일요일 12:00~23:00\n" +
                    "> 주소 : Svetlanskaya St, 7, Vladivostok, Primorsky Krai" +
                    "> 연락처 : +7 423 260-57-37\n" +
                    "> 가격 : 펠메니 150루블~(한화 약 2,300원~)")
        FoodList!!.add(a)
        a = FoodData("해적커피", "Vladivostok, Primorsky Krai", covers[4],
            "해적커피(알리스커피)\n\n" +
                    "> 영업시간 : 매일 09:00~22:00\n" +
                    "> 주소 : Vladivostok, Primorsky Krai\n" +
                    "> 연락처 : +7 800 333-29-30\n" +
                    "> 가격 : 아메리카노 50루블(한화 약 1,000원)")
        FoodList!!.add(a)
        a = FoodData("파이브 오 클락", "Ulitsa Admirala Fokina, 6, Vladivostok, Primorsky Krai", covers[5],
            "파이브 오 클락\n\n" +
                    "> 영업시간 : 월~금요일 08:00~21:00, 토요일 09:00~21:00, 일요일 11:00~09:00\n" +
                    "> 주소 : Ulitsa Admirala Fokina, 6, Vladivostok, Primorsky Krai)\n" +
                    "> 연락처 : +7 908 994-55-31\n" +
                    "> 가격 : 차 45루블~(한화 약 700원~), 디저트 50루블~(한화 약 1,000원~)")
        FoodList!!.add(a)
        a = FoodData("오그뇩", "Partizanskiy Prospekt, 44 к 6, Vladivostok, Primorsky Krai", covers[6],
            "오그뇩\n\n" +
                    "> 영업시간 : 매일 11:00~01:00\n" +
                    "> 주소 : Partizanskiy Prospekt, 44 к 6, Vladivostok, Primorsky Krai\n" +
                    "> 연락처 : +7 423 230-20-45\n" +
                    "> 가격 : 킹크랩 1kg 약2,000루블(한화 약 31,000원), 토마호크 스테이크 1kg 약3,000루블(한화 약 46,000원~)")
        FoodList!!.add(a)
        a = FoodData("주마", "Fontannaya Ulitsa, 2, Vladivostok, Primorsky Krai", covers[7],
            "주마\n\n" +
                    "> 영업시간 : 매일 11:00~02:00\n" +
                    "> 주소 : Fontannaya Ulitsa, 2, Vladivostok, Primorsky Krai\n" +
                    "> 연락처 : +7 423 222-26-66\n" +
                    "> 가격 : 킹크랩 1kg 2,000루블(한화 약 31,000원), 주마 롤 530루블(한화 약 8,200원~), 게살 튀김 750루블(한화 약 11,600원)")
        FoodList!!.add(a)
        a = FoodData("퍼스트시티", "Svetlanskaya St, 33, стр. 2, Vladivostok, Primorsky Krai", covers[8],
            "퍼스트시티\n\n" +
                    "> 영업시간 : 매일 08:30~20:00\n" +
                    "> 주소 : Svetlanskaya St, 33, стр. 2, Vladivostok, Primorsky Krai\n" +
                    "> 연락처 : +7 423 208-07-98\n" +
                    "> 가격 : 에끌레어 200루블~(한화 약 3,100원)")
        FoodList!!.add(a)

        adapter!!.notifyDataSetChanged()
    }
}