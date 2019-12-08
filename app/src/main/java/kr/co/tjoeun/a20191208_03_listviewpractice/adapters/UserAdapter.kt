package kr.co.tjoeun.a20191208_03_listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.a20191208_03_listviewpractice.R
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class UserAdapter(context:Context, resid:Int, list:ArrayList<User>) : ArrayAdapter<User>(context, resid, list){
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if ( tempRow == null ){
            tempRow = inf.inflate(R.layout.user_list_item, null)
        }
        val row = tempRow !!

//        상황에 맞는 데이터를 user_list_item에 뿌려주기

        return row
    }
}