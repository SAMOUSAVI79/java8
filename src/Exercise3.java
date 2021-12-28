import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise3 {
    enum Country {
        China(1),
        Iran(2),
        Russia(3),
        Others(4);
        private int type;

        Country(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }

    }


    public static Object witchCountry(List<String> countries) {
//        Arrays.stream(Country.values()).filter(country -> countries.contains(country.name())).findAny().orElse(null);
        // اگه مقایسه ای بو د می تونیم از .max. .min  هم استفده کنیم
        String c = countries.stream().filter(cun -> (cun.equals(Country.China.name())
                        || cun.equals(Country.Iran.name())))
                .max(Comparator.comparing(String::valueOf)).get();
        return c;
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("China");
        list1.add("afganestatn");
        list1.add("iran");
        String[] array = {"China", "afganestatn"};
//                new String["China", "afganestatn"];
        Object cus = witchCountry(list1);
        System.out.println(cus);
    }
}
