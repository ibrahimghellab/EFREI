package exo2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListeProgrammeurs {
    private final List<Programmeur> data = new ArrayList<>();

    public void add(Programmeur p) { data.add(p); }

    public List<Programmeur> getData() { return data; }

    public ListeProgrammeurs filtrerNomDifferentDe(String nomExclu) {
        ListeProgrammeurs res = new ListeProgrammeurs();
        for (Programmeur p : data) {
            if (!p.getNom().equalsIgnoreCase(nomExclu)) {
                res.add(p);
            }
        }
        return res;
    }
}
