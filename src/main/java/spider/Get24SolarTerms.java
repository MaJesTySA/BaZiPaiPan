package spider;

import com.alibaba.fastjson.JSON;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Get24SolarTerms {

    private static final String BASE_URL = "http://jieqi.xuenb.com/?nian=";
    private static final String USER_DIR = System.getProperty("user.dir");

    private boolean useProxy = false;
    private String proxyIp = "127.0.0.1";
    private int proxyPort = 7890;


    public Get24SolarTerms() {
    }

    public Get24SolarTerms(boolean useProxy, String proxyIp, int proxyPort) {
        this.useProxy = useProxy;
        this.proxyIp = proxyIp;
        this.proxyPort = proxyPort;
    }

    public static Get24SolarTerms getInstance() {
        return new Get24SolarTerms();
    }

    public static Get24SolarTerms getInstance(String proxyIp, int proxyPort) {
        return new Get24SolarTerms(true, proxyIp, proxyPort);
    }

    public Map<String, String> getYearFullData(int year) {
        Map<String, String> thisYearData = new HashMap<>();
        try {
            Thread.sleep(1000);
            String url = BASE_URL + year;
            Document document;
            if (this.useProxy) {
                document = Jsoup.connect(url).proxy(this.proxyIp, this.proxyPort).get();
            } else {
                document = Jsoup.connect(url).get();
            }
            Elements elements = document.getElementsByClass("dnumber");
            for (int j = 1; j <= elements.size() - 5; j += 5) {
                thisYearData.put(elements.get(j).text(), elements.get(j + 1).text());
            }
        } catch (Exception e) {
            System.out.println("=====获取" + year + "数据失败！");
        }
        return thisYearData;
    }

    public void writeRangedYearData(int startYear, int endYear) {
        Map<String, Map<String, String>> yearData = new HashMap<>();
        for (int i = startYear; i <= endYear; i++) {
            Map<String, String> yearFullData = this.getYearFullData(i);
            if (yearFullData.keySet().size() > 0) {
                yearData.put(String.valueOf(i), yearFullData);
            }
        }
        File file = new File(USER_DIR + File.separator + "data-" + System.currentTimeMillis() + ".json");
        try {
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8);
                JSON.writeJSONString(fw, yearData);
            }
        } catch (IOException e) {
            System.out.println("=====文件写入失败！");
        }
    }
}
