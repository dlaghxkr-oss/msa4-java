package com.msa4java.edu.enumeration;

public enum Week {
//    private week MONDAY = new Week("월요일");
//    private week TUESDAY = new Week("화요일");
//    private week WEDNESDAY = new Week("수요일");
//    private week THURSDAY = new Week("목요일");
//    private week FRIDAY = new Week("금요일");
//    private week SATURDAY = new Week("토요일");
//    private week SUNDAY = new Week("일요일");

    MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    private final String krDay;

    private Week(String day) {
        this.krDay = day;
    }

    // Getter
    public String getKrDay() {
        return this.krDay;
    }
}

