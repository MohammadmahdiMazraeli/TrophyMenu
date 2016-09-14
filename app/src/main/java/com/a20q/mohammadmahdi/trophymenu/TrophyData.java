package com.a20q.mohammadmahdi.trophymenu;

public class TrophyData {

    String text;
    int id;

    private TrophyData(String text, int id){
        this.text = text;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public static final TrophyData[] datas = {
            new TrophyData("first trophy", R.drawable.minions),
            new TrophyData("second trophy", R.drawable.minions),
            new TrophyData("third trophy", R.drawable.minions),
            new TrophyData("4th trophy", R.drawable.minions),
            new TrophyData("5th trophy", R.drawable.minions),
            new TrophyData("6th trophy", R.drawable.minions),
            new TrophyData("7th trophy", R.drawable.minions),
    };
}
