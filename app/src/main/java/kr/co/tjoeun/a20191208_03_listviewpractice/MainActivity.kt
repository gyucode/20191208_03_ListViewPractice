package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.a20191208_03_listviewpractice.adapters.StudentAdapter
import kr.co.tjoeun.a20191208_03_listviewpractice.adapters.UserAdapter
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    val studentList = ArrayList<User>()
    val secondStudentList = ArrayList<User>()
    var userAdapter:UserAdapter? = null
    var studentAdapter:StudentAdapter? = null

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
        userAdapter = UserAdapter( this, R.layout.user_list_item, studentList)
        userListView.adapter = userAdapter


        addSeccondStudents()
        studentAdapter = StudentAdapter( this,R.layout.student_list_item,secondStudentList)
        secondListView.adapter = studentAdapter

    }
    fun addSeccondStudents(){
        secondStudentList.add(User("차순혁","구로",false))
        secondStudentList.add(User("황연하","성남",true))
        secondStudentList.add(User("조경진","은평",false))
        secondStudentList.add(User("계석준","도봉",false))
        secondStudentList.add(User("김미현","군포",true))
        secondStudentList.add(User("김영호","은평",false))
        secondStudentList.add(User("노혜진","강동",true))
        secondStudentList.add(User("류찬울","어딘",false))
        secondStudentList.add(User("양성심","관악",true))
        secondStudentList.add(User("이규현","도봉",false))
        secondStudentList.add(User("이수정","고양",true))
        secondStudentList.add(User("레드","강동",true))
        secondStudentList.add(User("옐로","어딘",false))
        secondStudentList.add(User("그린","관악",true))
        secondStudentList.add(User("블루","도봉",false))
        secondStudentList.add(User("핑크","고양",true))
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




