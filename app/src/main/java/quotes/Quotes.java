package quotes;

import java.util.ArrayList;

public class Quotes {

    /*
     "tags": [
      "attributed-no-source"
    ],
    "author": "Marilyn Monroe",
    "likes": "18651 likes",
    "text": " “I am good, but not an angel...."
     */
   private ArrayList<String> tags;
   private String author;
   private String likes;
   private String text;

    public Quotes(ArrayList<String> tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "{author: "+ getAuthor()+" , text: "+ getText()+ "}";
    }
}
