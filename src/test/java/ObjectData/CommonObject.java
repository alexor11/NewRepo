package ObjectData;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonObject {

    public List<String> getValueAsList(String value){
        String[]splitValue = value.split(",");
        return Arrays.stream(splitValue).collect(Collectors.toList());
    }

    public String StringConcat(String text1, String text2){
        return text1 + " " + text2;
    }

    public String StringConcat(String text1, String text2, String text3){
        return text1 + " " + text2 + " " + text3;
    }
}
