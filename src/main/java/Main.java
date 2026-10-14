import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("reverse(\"Maven\") = " + StringUtils.reverse("Maven"));

        System.out.println("isBlank(\"null\") = " + StringUtils.isBlank("null"));
        System.out.println("isBlank(\"\") = " + StringUtils.isBlank(""));
        System.out.println("isBlank(\" \") = " + StringUtils.isBlank(" "));
        System.out.println("isBlank(null) = " + StringUtils.isBlank(null));
    }
}