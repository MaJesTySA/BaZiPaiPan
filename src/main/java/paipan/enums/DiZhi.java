package paipan.enums;

public enum DiZhi {
    ZI("子", 1),
    CHOU("丑", 2),
    YIN("寅", 3),
    MAO("卯", 4),
    CHEN("辰", 5),
    SI("巳", 6),
    WU("午", 7),
    WEI("未", 8),
    SHEN("申", 9),
    YOU("酉", 10),
    XU("戌", 11),
    HAI("亥", 12);

    DiZhi(String name, Integer index) {
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

    public static DiZhi getFromIndex(int index) {
        if (index < 1 || index > 13) throw new RuntimeException("地支索引出错！");
        for (DiZhi value : values()) {
            if (value.getIndex() == index) return value;
        }
        return null;
    }
}
