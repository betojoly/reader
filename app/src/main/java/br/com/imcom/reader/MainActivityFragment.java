package br.com.imcom.reader;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Criando uma array falsa de strings com os títulos das nossas Aulas
        String[] data = {
                "Aula 1: Getting Start!",
                "Aula 2: Como instalar o Android Studio?",
                "Aula 3: Como criar um projeto no Android Studio?",
                "Aula 4: O que é Activity e Fragment?",
                "Aula 5: Como criar a User Interface (UI) do meu Aplicativo Android?"
        };

        // Criando uma lista (ArrayList) com os dados criados acima
        List<String> listOfLastPosts = new ArrayList<String>(Arrays.asList(data));

        // Agora que já temos os dados, vamos criar um Adapter, no caso um ArrayAdapter
        ArrayAdapter<String> listOfLastPostsAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_last_posts,
                R.id.list_item_post_title_textview,
                listOfLastPosts
        );

        // Inflamos o layout principal
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Cria uma referência para a ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_last_posts);
        listView.setAdapter(listOfLastPostsAdapter);

        // Retornamos tudo
        return rootView;
    }
}
