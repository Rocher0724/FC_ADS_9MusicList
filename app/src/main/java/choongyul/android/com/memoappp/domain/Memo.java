package choongyul.android.com.memoappp.domain;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by myPC on 2017-02-14.
 */
@DatabaseTable(tableName = "memo")
public class Memo {

    @DatabaseField(generatedId = true)
    int id;

    @DatabaseField
    String memo;

    @DatabaseField
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Memo() {
        //default
    }

    public Memo(String memo, Date date) {
        this.memo = memo;
        this.date = date;
    }
}
