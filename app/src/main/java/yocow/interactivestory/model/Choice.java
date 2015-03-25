package yocow.interactivestory.model;

/**
 * Created by yocow on 3/8/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
