package kr.co.tjoeun.a20191208_03_listviewpractice.datas

import android.util.Log

class User(inputName:String, inputAddress:String, isWomenOK:Boolean) {

    var name = inputName
    var address = inputAddress
    var isWomen = isWomenOK

    constructor() : this("미정","거주지불명",false)

    constructor(name:String) : this(name,"거주지만 모름",true)

    init {
         Log.d("생성자 호출",inputName)
    }
    fun printUserInfo(){
        Log.d("사용자정보","이름 : ${name}, 거주지 :${address}, 여성 ${isWomen}")
    }

}