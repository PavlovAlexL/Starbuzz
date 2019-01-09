package palex.site.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
    }

    ArrayAdapter<Drink> listAdapter = new ArrayAdapter<>(
            this,   //текущая активность, класс Activity является субклассом класса Context
            android.R.layout.simple_list_item_1,    //Ресурс макета, указывает что нужно отображать каждый элемент массива.
            Drink.drinks);

    ListView listDrinks = (ListView) findViewById(R.id.list_drinks);
    listDrinks.setAdapter(listAdapter);
}
