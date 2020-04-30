package br.com.kmg.mylist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.kmg.mylist.R;
import br.com.kmg.mylist.model.Contact;

public class ContactsAdapter extends BaseAdapter {

    List<Contact> contactList;
    Context context;

    public ContactsAdapter(List<Contact> contactList, Context context) {
        this.contactList = contactList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Contact getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.contact_item_list, parent, false);

        TextView tvName = view.findViewById(R.id.tvNome);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        TextView tvLastSeen = view.findViewById(R.id.tvLastSeen);
        ImageView photo = view.findViewById(R.id.ivPhoto);

        Contact contact = contactList.get(position);

        tvName.setText(contact.getName());
        tvDescription.setText(contact.getDescription());
        tvLastSeen.setText(contact.getLastSeen());

        return view;
    }
}
