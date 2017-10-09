
import java.util.Date;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rg034
 */
public class Painting extends StoreItem{
    static int paintCount;
    String title;
    int height;
    int width;
    String media;
    
    public Painting(String title, String author, 
        int purchasePrice, int askingPrice, int height, int width, String media)
    {
        super(title, author, purchasePrice, askingPrice);
        this.height = height;
        this.width = width;
        this.media = media;
        paintCount++;
    }
    
    public String printableString()
    {
        String string = ("Title: " + getTitle() + "\nAuthor: " + 
            getAuthor() + "\nPurchase Price: " + 
            getPurchasePrice() + "\nAsking Price: " + 
            getAskingPrice() + "\nMedia: " +
            getMedia() + "\nHeight: " + getHeight() + "\nWidth: " +
            getWidth());
        return string;
    }
    
    public void remove()
    {
        if(paintCount > 0)
        {
            paintCount --;
        }
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
//    public Date getDate()
//    {
//        return dateAquired;
//    }
//    
//    public void setDate(Date date)
//    {
//        this.dateAquired = date;
//    }
    
    public int getAskingPrice()
    {
        return askingPrice;
    }
    
    public void setAskingPrice(int askingPrice)
    {
        this.askingPrice = askingPrice;
    }
    
     public int getPurchasePrice()
    {
        return purchasePrice;
    }
    
    public void setPurchasePrice(int purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public String getMedia()
    {
        return media;
    }
    
    public void setMedia(String media)
    {
        this.media = media;
    }
    
}
