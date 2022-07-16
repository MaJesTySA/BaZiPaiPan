package paipan.enums;

import java.util.Map;

public enum TianGan {
    JIA("甲", 1),
    YI("乙", 2),
    BING("丙", 3),
    DING("丁", 4),
    WU("戊", 5),
    JI("己", 6),
    GENG("庚", 7),
    XIN("辛", 8),
    REN("壬", 9),
    GUI("癸", 10);


    TianGan(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    private String name;
    private Integer index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public static TianGan getFromIndex(int index) {
        if (index < 1 || index > 11) throw new RuntimeException("天干索引出错！");
        for (TianGan value : values()) {
            if (value.getIndex() == index) return value;
        }
        return null;
    }
}
