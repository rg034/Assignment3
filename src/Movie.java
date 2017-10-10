

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rg034
 */
public class Movie extends StoreItem{
    static int movieCount;
    String title; // if comment this out
    String actor;
    String actress;
    String director;
    
    public Movie(String title, String author, 
                    int purchasePrice, int askingPrice, String actor, 
                    String actress, String director)
    {
        super(title, author, purchasePrice, askingPrice);
        this.title = title;  // if comment this out
        this.actor = actor;
        this.actress = actress;
        this.director = director;
        movieCount++;
    }
    
    public String getTitle() // if comment this out
    {
        return title;
    }
    
    public void setTitle(String title) // if comment this out
    {
        this.title = title;
    }
    
    public String getDirector()
    {
        return director;
    }
    
    public void setDirector(String director)
    {
        this.director = director;
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
    
    public String getActor()
    {
        return actor;
    }
    
    public void setActor(String actor)
    {
        this.actor = actor;
    }
    
    public String getActress()
    {
        return actress;
    }
    
    public void setActress(String actress)
    {
        this.actress = actress;
    }
    
    public String printableString()
    {
        String string = (super.printableString() + "\nDirector: " + 
            getDirector() + "\nActor: " +
            getActor() +"\nActress: " + getActress());
        return string;
    }
    
}
