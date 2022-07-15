package paipan.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import paipan.constants.Constants;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Utils {

    public static void getSolarTermsMap() {
        String dataFile = System.getProperty("user.dir") + File.separator + "data.json";
        File jsonFile = new File(dataFile);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), StandardCharsets.UTF_8);
            int ch = 0;
            StringBuilder sb = new StringBuilder();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            Constants.SOLAR_TERMS_MAP = JSON.parseObject(sb.toString(), new TypeReference<>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
