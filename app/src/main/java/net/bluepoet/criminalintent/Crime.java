package net.bluepoet.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by bluepoet on 2017. 1. 7..
 */

public class Crime {
    private UUID mId;
    private String mTitie;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime() {
        this(UUID.randomUUID());
//        mId = UUID.randomUUID();
//        mDate = new Date();
    }

    public Crime(UUID uuid) {
        mId = uuid;
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setTitie(String titie) {
        mTitie = titie;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getTitie() {
        return mTitie;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }
}
