
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
public class StoreItem {
    static int itemCount;
    String title;
    String author;
   // Date dateAquired;
    int purchasePrice;
    int askingPrice;
    
    //constructor
    public StoreItem(String title, String author, 
                    int purchasePrice, int askingPrice )
    {
        this.title = title;
        this.author = author;
        //this.dateAquired = dateAquired;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
        itemCount++;
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
//    
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
    
    public Boolean deal(int custOffer)
    {
        return true;
    }
    
    public void remove()
    {
        if(itemCount > 0)
        {
            itemCount --;
        }
    }
    
    public int calculateCommission(int custOffer)
    {
        int commission = 0;
        return commission;
    }
    

    
    
}
