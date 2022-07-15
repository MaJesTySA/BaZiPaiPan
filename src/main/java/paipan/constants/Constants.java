package paipan.constants;

import paipan.enums.DiZhi;
import paipan.enums.TianGan;

import java.util.*;

public class Constants {
    public static Date BASE_DATETIME = new Date();
    public static Map<DiZhi, List<TianGan>> DIZHI_CANGGAN_MAP = new HashMap<DiZhi, List<TianGan>>() {{
        put(DiZhi.ZI, Arrays.asList(TianGan.GUI));
        put(DiZhi.CHOU, Arrays.asList(TianGan.GUI, TianGan.XIN, TianGan.JI));
        put(DiZhi.YIN, Arrays.asList(TianGan.JIA, TianGan.BING, TianGan.WU));
        put(DiZhi.MAO, Arrays.asList(TianGan.YI));
        put(DiZhi.CHEN, Arrays.asList(TianGan.YI, TianGan.GUI, TianGan.WU));
        put(DiZhi.SI, Arrays.asList(TianGan.BING, TianGan.GENG, TianGan.WU));
        put(DiZhi.WU, Arrays.asList(TianGan.DING, TianGan.JI));
        put(DiZhi.WEI, Arrays.asList(TianGan.DING, TianGan.YI, TianGan.JI));
        put(DiZhi.SHEN, Arrays.asList(TianGan.GENG, TianGan.REN, TianGan.WU));
        put(DiZhi.YOU, Arrays.asList(TianGan.XIN));
        put(DiZhi.XU, Arrays.asList(TianGan.XIN, TianGan.DING, TianGan.WU));
        put(DiZhi.HAI, Arrays.asList(TianGan.REN, TianGan.JIA));
    }};
    public static Map<String, Map<String, String>> SOLAR_TERMS_MAP;
    public static String LICHUN = "立春";
}
