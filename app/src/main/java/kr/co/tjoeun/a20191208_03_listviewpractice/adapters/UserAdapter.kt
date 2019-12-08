package kr.co.tjoeun.a20191208_03_listviewpractice.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.a20191208_03_listviewpractice.R
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class UserAdapter(context:Context, resid:Int, list:ArrayList<User>) : ArrayAdapter<User>(context, resid, list){
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        Log.d("getview실행","${position}번 줄 그리기")

        var tempRow = convertView
        if ( tempRow == null ){
            tempRow = inf.inflate(R.layout.user_list_item, null)
        }
        val row = tempRow !!

//        상황에 맞는 데이터를 user_list_item에 뿌려주기
//        리스트에서 각 줄에 맞는 근거 데이터 뽑아오기
//        position변수가 매번 몇번째 줄을 출력하려 하는지 알려주는 역할
        val data = mList.get(position)

//        각 줄에서 데이터를 부려줄 뷰를 찾아다 연결.

        val userNameTxt = row.findViewById<TextView>(R.id.userNameTxt)
        val userAddressTxt = row.findViewById<TextView>(R.id.userAddressTxt)
        val genderTxt = row.findViewById<TextView>(R.id.userGenderTxt)

        userNameTxt.text = data.name
        userAddressTxt.text = "(${data.address})"

        if(data.isWomen) {
            genderTxt.text = "여성"
        }
        else{
            genderTxt.text = "남성"
        }

        return row
    }
}