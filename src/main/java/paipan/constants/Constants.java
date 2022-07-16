package paipan.constants;

import paipan.enums.DiZhi;
import paipan.enums.TianGan;

import java.util.*;

public class Constants {
    public static Date BASE_DATETIME = new Date();
    public static TianGan BASE_NIANGAN = TianGan.JIA;
    public static DiZhi BASE_DIZHI = DiZhi.ZI;
    public static Integer BASE_YEAR = 1984;
    public static Integer BASE_TIANGAN_CIRCLE = 10;
    public static Integer BASE_DIZHI_CIRCLE = 12;

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
    public static String YUSHUI = "雨水";
    public static String JINGZHE = "惊蛰";
    public static String CHUNFEN = "春分";
    public static String QINGMING = "清明";
    public static String GUYU = "谷雨";
    public static String LIXIA = "立夏";
    public static String XIAOMAN = "小满";
    public static String MANGZHONG = "芒种";
    public static String XIAZHI = "夏至";
    public static String XIAOSHU = "小暑";
    public static String DASHU = "大暑";
    public static String LIQIU = "立秋";
    public static String CHUSHU = "出数";
    public static String BAILU = "白露";
    public static String QIUFEN = "秋分";
    public static String HANLU = "寒露";
    public static String SHUANGJIANG = "霜降";
    public static String LIDONG = "立冬";
    public static String XIAOXUE = "小雪";
    public static String DAXUE = "大雪";
    public static String DONGZHI = "冬至";
    public static String XIAOHAN = "小寒";
    public static String DAHAN = "大寒";

}
