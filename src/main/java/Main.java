import org.apache.commons.io.IOUtils;

import javax.swing.text.html.parser.Parser;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        ParsingThrough parser = new ParsingThrough();
        String output = (new Main()).readRawDataToString();
        String[] outputArray = output.split("##");
        parser.arrayToString(outputArray);

        for(String items : outputArray){
            String[] singleArray = items.split("A - Za - z0 - 9./");
        }

    }

}
