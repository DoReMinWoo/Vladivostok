import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vladivostok.DataModel.EnjoyData
import com.example.vladivostok.R
import kotlinx.android.synthetic.main.item_enjoy.view.*

class EnjoyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val img1 = v.img1_enjoy
    val img2 = v.img2_enjoy
    val img3 = v.img3_enjoy
    val title = v.title_enjoy
    val content = v.content_enjoy
}

class EnjoyAdapter(val DataList: ArrayList<EnjoyData>) : RecyclerView.Adapter<EnjoyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnjoyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_enjoy, parent, false)
        return EnjoyViewHolder(view)
    }

    override fun getItemCount() = DataList.size

    override fun onBindViewHolder(holder: EnjoyViewHolder, position: Int) {
        holder.img1.setImageResource(DataList[position].img1)
        holder.img2.setImageResource(DataList[position].img2)
        holder.img3.setImageResource(DataList[position].img3)
        holder.title.text = DataList[position].title
        holder.content.text = DataList[position].content
    }


}


