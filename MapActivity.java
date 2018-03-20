package dorothy.dorothy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.Serializable;
import java.util.HashMap;

public class MapActivity extends AppCompatActivity {

    HashMap<Integer, StrNameImage> mBtnInfo = new HashMap<Integer, StrNameImage>();

    {
        mBtnInfo.put(R.id.btn1, new StrNameImage(" 대학원동\n\n B1 : 기계실\n 1F : 인터넷카페,교수지원학습센터,대학원교학과\n 2F : 강의실\n 3F : 강의실\n 4F : 교수연구실\n ",R.mipmap.mapimg_1));
        mBtnInfo.put(R.id.btn2, new StrNameImage(" 90주년 기념관\n\n 1F : 경건실천\n 2F : 경건실천\n",R.mipmap.mapimg_2));
        mBtnInfo.put(R.id.btn3, new StrNameImage(" 교수연구동\n\n 1F : 보건실\n 2F : 교수연구실\n 3F : 연구실\n",R.mipmap.mapimg_3));
        mBtnInfo.put(R.id.btn4, new StrNameImage(" 정보과학관\n\n B1 : 기계실\n 1F : 미래인재 개발과,학생종합 민원센터\n 2F : 컴퓨터 유지보수실\n 3F : 강의실\n",R.mipmap.mapimg_4));
        mBtnInfo.put(R.id.btn5, new StrNameImage(" 인문사회관\n\n 1F : 복사실,강의실\n 2F : 강의실\n 3F : 강의실\n 4F : PTU Simulation Center\n",R.mipmap.mapimg_5));
        mBtnInfo.put(R.id.btn6, new StrNameImage(" 예술관\n\n 1F : 강의실\n 2F : 강의실\n 3F : 강의실\n 4F : 강의실\n 5F : 강의실\n",R.mipmap.mapimg_6));
        mBtnInfo.put(R.id.btn7, new StrNameImage(" 100주년 기념탑\n\n 1F : 100주년기념 사진관\n 2F : 도서관\n 3F : 평택대학교회\n",R.mipmap.mapimg_7));
        mBtnInfo.put(R.id.btn8, new StrNameImage(" 피어선홀\n\n 1F : 신학도서관\n 2F : 성경연구,기념 전시관\n 3F : 채플\n",R.mipmap.mapimg_8));
        mBtnInfo.put(R.id.btn9, new StrNameImage(" 대학광장\n\n",R.mipmap.mapimg_9));
        mBtnInfo.put(R.id.btn10,new StrNameImage(" 중앙도서관\n\n B1 : 보존서고\n 1F : 참고열람실,\n 2F : 제1열람실\n 3F : 제2열람실\n",R.mipmap.mapimg_10));
        mBtnInfo.put(R.id.btn11,new StrNameImage(" 대학본관\n\n 1F : 총무과,홍보과,입학관리과\n 2F : 강의실\n 3F : 강의실\n 4F : 강의실\n",R.mipmap.mapimg_11));
        mBtnInfo.put(R.id.btn12,new StrNameImage(" 제1국제관\n\n 1F : 기숙사,기도실\n 2F : 당구장,탁구장\n 3F : 기숙사\n 4F : 기숙사,기도실\n 5F : 기숙사\n 6F : 기숙사\n",R.mipmap.mapimg_12));
        mBtnInfo.put(R.id.btn13,new StrNameImage(" 학생관\n\n B1 : 강의실\n 1F : 마트,학식\n 2F : 조정실\n 3F : 강의실\n 4F : 예비군대대,학생과\n 5F : 동아리방\n",R.mipmap.mapimg_13));
        mBtnInfo.put(R.id.btn14,new StrNameImage(" 문무관\n\n",R.mipmap.mapimg_14));
        mBtnInfo.put(R.id.btn15,new StrNameImage(" 운동장\n\n",R.mipmap.mapimg_15));
        mBtnInfo.put(R.id.btn16,new StrNameImage(" 행정관(건축예정)\n\n",R.mipmap.mapimg_16));
        mBtnInfo.put(R.id.btn17,new StrNameImage(" 이공관\n\n B1 : 강의실\n 1F : 우체국,서제/문구,인터넷카페\n 2F : 강의실,TAICO cafe\n 3F : 강의실\n 4F : 강의실\n 5F : 강의실\n",R.mipmap.mapimg_17));
        mBtnInfo.put(R.id.btn18,new StrNameImage(" 제2피어선빌딩\n\n 1F : 음식점,다문화가족센터\n 2F : 국민은행,평생/국제교육원\n 3F : 법인사무국,학생 생활삼담소\n 4F : 강의실,미술치료실\n 5F : 강의실\n 6F : 연회장\n 7F : 국제회의장\n",R.mipmap.mapimg_18));
        mBtnInfo.put(R.id.btn19,new StrNameImage(" 제2국제관\n\n B1 : 체력단련실,세탁실\n 1F : 매점,행정실\n 2F : 기숙사\n 3F : 기숙사,화장실\n 4F : 기숙사\n 5F : 기숙사,화장실\n 6F : 기숙사\n 7F : 기숙사\n 8F : 기숙사\n 9F : 외국인교수 숙소\n 옥탑 : 세탁실\n",R.mipmap.mapimg_19));
        mBtnInfo.put(R.id.btn20,new StrNameImage(" 제3국제관\n\n B1 : 기계실로비\n 1F : 행정실,Cafeteria\n 2F : 강당/게스트룸,E컨번전스홀\n 3F : 기숙사,세탁실\n 4F : 기숙사\n 5F : 기숙사\n 6F : 기숙사\n 7F : 기숙사,세탁실\n",R.mipmap.mapimg_20));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }



    public void mOnClick(View v) {
        StrNameImage strNameImage = mBtnInfo.get(v.getId());

        Intent intent = new Intent(MapActivity.this, MapPopup.class);

        intent.putExtra("strNameImage",strNameImage);

        startActivity(intent);
    }

    public static class StrNameImage implements Serializable {//직렬화 (예: 텍스트 형식으로 바꿔줌)
        public String name;
        public int image;
        public StrNameImage(String name, int image) {
            this.name = name;
            this.image = image;
        }

        //getter, setter 를 이용해서 직렬화 대상 선택
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }
    }

}
