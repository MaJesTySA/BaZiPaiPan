package paipan.enums;

public enum TianGan {
    JIA("甲", 0),
    YI("乙", 1),
    BING("丙", 2),
    DING("丁", 3),
    WU("戊", 4),
    JI("己", 5),
    GENG("庚", 6),
    XIN("辛", 7),
    REN("壬", 8),
    GUI("癸", 9);

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
}
