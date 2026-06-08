import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public String encode(String[] strings) {

        if (strings.length == 0) {
            return Character.toString((char)258); //saftey if length is 0
        }

        String seprator = Character.toString((char)257); //choose the character at 257th place as seprator
        StringBuilder sb = new StringBuilder();

        for (String string : strings) {
            sb.append(string);
            sb.append(seprator);
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }

    public List<String> decode(String encoded) {
        String seprator = Character.toString((char)257);

        if (encoded.equals(Character.toString((char)258))){
            return new ArrayList<>();
        }
        return Arrays.asList(encoded.split(seprator, -1));
    }
}