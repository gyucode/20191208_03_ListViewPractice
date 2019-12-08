package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tempUser = User("ㅇ","ㄴㄴ",false)

        Log.d("사용자주소",tempUser.address)


    }
}
