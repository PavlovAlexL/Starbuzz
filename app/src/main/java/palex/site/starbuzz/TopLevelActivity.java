package palex.site.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
    }

    AdapterView.OnItemClickListener itemClickListener =     //создаем слушателя для текстового представления
            new AdapterView.OnItemClickListener(){
                public void onItemClick(AdapterView<?> listView,
                                        View itemView,
                                        int position,
                                        long id) {
                    if (position == 0) {    //если пользователь щелкнул на первом варианте, запустить соответствующую Активити
                        Intent intent = new Intent(TopLevelActivity.this,
                                DrinkCategoryActivity.class);
                        startActivity(intent);
                    }
                }
            };
    //Добавить слушателя к списковому представлению
    ListView listView = (ListView) findViewById(R.id.list_options);
    listView.setOnItemClickListener(itemClickListener); //добавляем слушателя к списковому представлению
    listView
}
