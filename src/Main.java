import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Aline", "Bruno", "Carlos", "Daniela", "Igor"};
        String[] names1 = {"Eduardo", "Fernanda", "Bruno", "Gabriel", "Igor", "Aline"};

        List<String> common = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names1.length; j++) {
                if (names[i] == names1[j]) {
                    common.add(names[i]);
                }
            }
        }

        for (int i = 0; i < common.size(); i++) {
            System.out.println(common.get(i));
        }
    }
}