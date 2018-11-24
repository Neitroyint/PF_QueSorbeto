package classes;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.List;

public class Preference {
    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public Preference(Context context) {
        this.context = context;
        UpdatePreferences();
    }
    public boolean PutPreference(List<Pref> prefs){
        for (Pref o : prefs) {
            if(o.getValue().getClass() == int.class){
                String value = Integer.toString((int) o.getValue());
                editor.putString(o.getName(), value);
            }
            else if(o.getValue().getClass() == String.class){
                String value = (String) o.getValue();
                editor.putString(o.getName(), value);
            }
            else{
                //Do the thing
            }
        }
        boolean res = editor.commit();
        UpdatePreferences();
        return  res;
    }
    public String GetPreference(String name){
        String o = preferences.getString(name, "");
        return o;
    }
    private void UpdatePreferences(){
        preferences = context.getSharedPreferences("com.sorbeto.que.pf_quesorbeto", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }
}
