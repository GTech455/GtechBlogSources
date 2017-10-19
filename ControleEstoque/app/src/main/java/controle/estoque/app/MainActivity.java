package controle.estoque.app;

import android.app.*;
import android.os.*;
import android.view.*;
import controle.estoque.app.databases.*;
import java.util.*;
import android.widget.*;
import controle.estoque.app.adapters.*;
import android.widget.AdapterView.*;
import android.content.*;

public class MainActivity extends Activity 
{
	SQLiteOpenDatabaseHelper db;
	List<String> lt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastros);
		setTitle("Produtos Cadastrados!!");
		db = new SQLiteOpenDatabaseHelper(this);
		lt = db.getDatabase();
		ListView l = (ListView) findViewById(R.id.lt);
		l.setAdapter(new ListViewAdapter(this, lt));
		l.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> a, View v, int position, long id){
				Object o = lt.get(position);
				Intent it = new Intent(getApplicationContext(), EstoqueManager.class);
				Bundle b = new Bundle();
				b.putInt("id", position + 1);
				it.putExtras(b);
				try{
					startActivity(it);
				} catch(Exception e){
					msg("Erro ao abrir tela!!");
				}
			}
		});
    }
private String msg(String ms){
	Toast.makeText(getApplicationContext(), ms, Toast.LENGTH_LONG).show();
	return ms;
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		getMenuInflater().inflate(R.menu.util_main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		switch(item.getItemId()){
			case R.id.add:
				Intent it = new Intent(getApplicationContext(), EstoqueManager.class);
				Bundle b = new Bundle();
				b.putInt("id",0);
				it.putExtras(b);
				try{
					startActivity(it);
				}catch(Exception e){
					msg("Erro ao carregar tela!!");
				}
				return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
