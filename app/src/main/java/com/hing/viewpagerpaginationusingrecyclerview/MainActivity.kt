package com.hing.viewpagerpaginationusingrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import com.hing.viewpagerpaginationusingrecyclerview.adapers.ImageListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ImageListAdapter
    private val recyclerView: RecyclerView by lazy { recycler_view }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        adapter = ImageListAdapter(mockImageURLList(), applicationContext)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }

    private fun mockImageURLList(): ArrayList<String> {
        val imageList = arrayListOf<String>()
        imageList.add("https://i.ytimg.com/vi/i_FbQzQQQLI/maxresdefault.jpg")
        imageList.add("https://twinfinite.net/wp-content/uploads/2016/05/naruto-600x338.jpg")
        imageList.add("https://i.ytimg.com/vi/eFBHBVPS5j0/maxresdefault.jpg")
        imageList.add("https://genk23.genkcdn.vn/DlBlzccccccccccccE5CT3hqq3xN9o/Image/2013/11/ava-10874.jpg")
        imageList.add("http://epicwallpaperz.com/wallpaper-hd/naruto-wallpapers-background-On-wallpaper-hd.jpg")
        imageList.add("http://4.bp.blogspot.com/_dz35Om6ou5w/TCasHNZDkjI/AAAAAAAAACw/2mRLN1jSPfQ/s1600/Naruto+sasuke+with+sharingan.jpg")
        imageList.add("https://cinepremiere-impresionesaerea.netdna-ssl.com/noticias/2017/03-marzo/borutoserie.jpg")
        imageList.add("https://i.pinimg.com/736x/55/01/ea/5501ead1986b2cbcd9be573fa1ad9aa5--naruto-art-naruto-uzumaki.jpg")
        imageList.add("https://cdn.idntimes.com/content-images/community/2018/03/75187-listicle-20180103214811-1-e8a9143d76d97f246f52e3f2c5f60e4c_600x400.jpg")
        imageList.add("https://cdn.wccftech.com/wp-content/uploads/2018/02/Naruto-Shippuden-Ultimate-Ninja-Storm-Trilogy-Switch.jpeg")

        imageList.add("http://1.bp.blogspot.com/-8-TR5COHhKY/VKa_m0zIaUI/AAAAAAAALko/Qrk9ccgGlFc/s1600/naruto-shippuden1.jpg")
        imageList.add("https://img1.ak.crunchyroll.com/i/spire3/196455c782f97caa8db82bf7bee67a691532006222_full.jpg")
        imageList.add("http://static.phimmoi.net/post/2015/09/12/x.jpg")
        imageList.add("http://static.gamehub.vn/img/files/2017/05/09/GameHubVN-Tac-gia-vua-Naruto-xac-nhan-mot-nhan-vat-cuc-ky-quan-trong-se-chet-3.jpg")
        imageList.add("https://news.xbox.com/en-us/wp-content/uploads/01-110-hero.jpg")
        imageList.add("http://media.comicbook.com/2018/06/boruto-naruto-1116049-1280x0.jpeg")
        imageList.add("https://i.ytimg.com/vi/FZpPFiDVKaM/maxresdefault.jpg")
        imageList.add("http://cdn.atomix.vg/wp-content/uploads/2017/01/RoadToBoruto_HokageNaruto.jpg")
        imageList.add("https://i.pinimg.com/originals/26/1c/de/261cde8ce70f991fab41d0eded7a7b78.jpg")
        imageList.add("https://i.pinimg.com/originals/63/c2/02/63c2025c99f5c7d80619a1c07a67226b.jpg")
        imageList.add("https://upload.wikimedia.org/wikipedia/en/thumb/9/9c/BorutoNarutoNextGenerationshomemedia.png/220px-BorutoNarutoNextGenerationshomemedia.png")

        return imageList
    }
}
