package dorothy.dorothy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CallActivity extends AppCompatActivity {

    ArrayList<MyItem> arItem;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        arItem = new ArrayList<MyItem>();
        MyItem mi;
        mi = new MyItem("대표전화");
        arItem.add(mi);
        mi = new MyItem("국제교류팀");
        arItem.add(mi);
        mi = new MyItem("대외협력팀");
        arItem.add(mi);
        mi = new MyItem("미래인재개발센터");
        arItem.add(mi);
        mi = new MyItem("생활관");
        arItem.add(mi);
        mi = new MyItem("입학관리팀");
        arItem.add(mi);
        mi = new MyItem("예비군대대");
        arItem.add(mi);
        mi = new MyItem("전산지원과");
        arItem.add(mi);
        mi = new MyItem("창업지원센터");
        arItem.add(mi);
        mi = new MyItem("총무처");
        arItem.add(mi);
        mi = new MyItem("학군단");
        arItem.add(mi);
        mi = new MyItem("학생복지팀");
        arItem.add(mi);
        mi = new MyItem("학생생활상담소");
        arItem.add(mi);


        MyListAdapter MyAdapter = new MyListAdapter(this, R.layout.activity_call_sub,arItem);

        ListView MyList;
        MyList=(ListView)findViewById(R.id.list_call);
        MyList.setAdapter(MyAdapter);
    }
}
class MyItem {
    String Name;

    MyItem(String aName) {
        Name = aName;
    }
}
class MyListAdapter extends BaseAdapter{
    Context maincon;
    LayoutInflater Inflater;
    ArrayList<MyItem> arSrc;
    int layout;
    Intent intent;

    public MyListAdapter(Context context, int alayout, ArrayList<MyItem> aarSrc){
        maincon = context;
        Inflater = (LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        arSrc = aarSrc;
        layout = alayout;
    }

    @Override
    public int getCount() {
        return arSrc.size();
    }

    @Override
    public Object getItem(int position) {
        return arSrc.get(position).Name;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos=position;
        if(convertView == null){
            convertView=Inflater.inflate(layout,parent,false);
        }
        TextView txt=(TextView)convertView.findViewById(R.id.text_sub_call);
        txt.setText(arSrc.get(position).Name);

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(arSrc.get(pos).Name.equals("대표전화")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8114"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("국제교류팀")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8462"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("교수학습지원센터")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8720"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("대외협력팀")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8460"));
                    maincon.startActivity(intent);
                }else if(arSrc.get(pos).Name.equals("미래인재개발센터")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8481"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("생활관")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8566"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("입학관리팀")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8000"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("예비군대대")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8428"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("전산지원과")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8475"));
                    maincon.startActivity(intent);
                }else if(arSrc.get(pos).Name.equals("창업지원센터")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8671"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("총무처")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8407"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("학군단")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8455"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("학생복지팀")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8429"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("학생생활상담소")){
                    intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:031-659-8029"));
                    maincon.startActivity(intent);
                }

            }
        });

        Button btn=(Button)convertView.findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(arSrc.get(pos).Name.equals("대표전화")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8114"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("국제교류팀")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8462"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("교수학습지원센터")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8720"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("대외협력팀")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8460"));
                    maincon.startActivity(intent);
                }else if(arSrc.get(pos).Name.equals("미래인재개발센터")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8481"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("생활관")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8566"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("입학관리팀")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8000"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("예비군대대")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8428"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("전산지원과")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8475"));
                    maincon.startActivity(intent);
                }else if(arSrc.get(pos).Name.equals("창업지원센터")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8671"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("총무처")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8407"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("학군단")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8455"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("학생복지팀")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8429"));
                    maincon.startActivity(intent);
                }
                else if(arSrc.get(pos).Name.equals("학생생활상담소")){
                    intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:031-659-8029"));
                    maincon.startActivity(intent);
                }

            }

        });

        return convertView;
    }
}
