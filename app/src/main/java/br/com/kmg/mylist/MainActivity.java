package br.com.kmg.mylist;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.kmg.mylist.adapter.ContactsAdapter;
import br.com.kmg.mylist.model.Contact;

public class MainActivity extends AppCompatActivity {

    ListView mListContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mListContacts = findViewById(R.id.lvContacts);

        List<Contact> contactList = new ArrayList<Contact>();
        contactList.add(new Contact("Klinsman", "Olá", "07:12", null));
        contactList.add(new Contact("Arley", "Olá", "07:12", null));
        contactList.add(new Contact("Kirk", "Olá", "07:12", null));
        contactList.add(new Contact("Adam", "Olá", "07:12", null));
        contactList.add(new Contact("Tiago", "Olá", "07:12", null));
        contactList.add(new Contact("Gabriel Silva", "Olá", "07:12", null));
        contactList.add(new Contact("José", "Tudo bem?", "09:50", null));


        ContactsAdapter adapter = new ContactsAdapter(contactList, this);

        mListContacts.setAdapter(adapter);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
