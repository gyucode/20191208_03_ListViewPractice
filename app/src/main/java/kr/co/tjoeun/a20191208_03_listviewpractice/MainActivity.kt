package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    val studentList = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var tempUser = User("ㅇ","ㄴㄴ",false)
//
//        Log.d("사용자주소",tempUser.address)
//
//        val tempUser2 = User()
//        Log.d("사용자주소",tempUser2.address)
//
//        val tempUser3 = User()
//        Log.d("사용자주소",tempUser3.address)

//        학생 목록을 추가.
        addStudents()

    }

    fun addStudents(){
        studentList.add(User("계석준","도봉",false))
        studentList.add(User("김미현","군포",true))
        studentList.add(User("김영호","은평",false))
        studentList.add(User("노혜진","강동",true))
        studentList.add(User("류찬울","어딘",false))
        studentList.add(User("양성심","관악",true))
        studentList.add(User("이규현","도봉",false))
        studentList.add(User("이수정","고양",true))
        studentList.add(User("차순혁","구로",false))
        studentList.add(User("황연하","성남",true))
        studentList.add(User("조경진","은평",false))
    }
}




