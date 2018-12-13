package fr.wildcodeschool.recylerviewjsonexample;

public class ExempleItem {
    private String mImageUrl;
    private String mCreator;

    public ExempleItem(String imageUrl, String creator) {
        mImageUrl = imageUrl;
        mCreator = creator;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

}
