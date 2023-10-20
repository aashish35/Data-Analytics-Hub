 
package DataAnalyticsHub;

/**
 *
 * @author Varun
 */
public class Post {  
    private int id;
    private int userid;
    private String content;
    private String author;
    private String plike;
    private String pshare;
    private String pdate;
    private String image;

//    WE WILL USE THIS CONSTRACTOR
    public Post(int id, int  userid, String content, String author, String image) {
//        MAKE SURE THAT THEY ARE SAME POSITION HAH
        this.id = id;
        this.userid = userid;
        this.content = content;
        this.author = author;
        this.image = image;

    }
    
public Post(int id,  String content, String author, String image) {
//        MAKE SURE THAT THEY ARE SAME POSITION HAH
        this.id = id;      
        this.content = content;
        this.author = author;
        this.image = image;

    }
    //    MAKE SURE THAT YOU DIDN'T USED THE STATIC HERE!
    public Post(int id, int userid, String content, String author, String plike, String pshare, String pdate, String image) {
        this.id = id;
        this.userid = userid;
        this.content = content;
        this.author = author;
        this.plike = plike;
        this.pshare = pshare;
        this.pdate = pdate;
        this.image = image;
    }

    Post(int id, String content, String author, String plike, String pshare, String image) {
         this.id = id;       
        this.content = content;
        this.author = author;
        this.plike = plike;
        this.pshare = pshare;        
        this.image = image;
    }
  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPlike() {
        return plike;
    }

    public void setPlike(String plike) {
        this.plike = plike;
    }

    public String getPshare() {
        return pshare;
    }

    public void setPshare(String pshare) {
        this.pshare = pshare;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
