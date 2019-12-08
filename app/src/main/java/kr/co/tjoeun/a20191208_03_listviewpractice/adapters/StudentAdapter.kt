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

class StudentAdapter(context: Context,resid:Int,list:ArrayList<User>) : ArrayAdapter<User>(context,resid,list){
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        Log.d("getview실행","${position}번 줄 그리기")
        var tempRow = convertView
        if(tempRow == null){

            Log.d("새로운 뷰 그리기","${position}번 줄 그리기")
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val data = mList.get(position)

        val studentNameTxt = row.findViewById<TextView>(R.id.studentNameTxt)
        val studentAddressTxt = row.findViewById<TextView>(R.id.studentAddressTxt)

        studentNameTxt.text = data.name
        studentAddressTxt.text = data.address

        return row
    }
}