
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
public class Book extends StoreItem{
    static int bookCount;
    String title;
    String genre;
    
    //constructor
    public Book(String title, String author, 
                    int purchasePrice, int askingPrice, String genre)
    {
        super(title, author, purchasePrice, askingPrice);
        this.title = title;
        this.genre = genre;
        bookCount++;
    }
    @Override
    public String printableString()
    {
        String string = (super.printableString() + "\nGenre: " + getGenre());
        
        return string;
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
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenry(String genre)
    {
        this.genre = genre;
    }
    
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
    
    public void remove()
    {
        if(bookCount > 0)
        {
            bookCount --;
        }
    }
}
