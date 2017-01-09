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

    public Crime() {
        mId = UUID.randomUUID();
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
}