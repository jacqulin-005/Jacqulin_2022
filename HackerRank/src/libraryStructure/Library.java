package libraryStructure;

import java.util.Map;

class Library {
    private int numberOfBooks;
    private String name;
    private Map<String,Integer> bookGenres;
    
    public int getNumber_of_books() {
        return numberOfBooks;
    }
    
    public String getName() {
        return name;
    }
    
    public Map<String,Integer> getBookGenres() {
        return bookGenres;
    }
    
    public void setNumber_of_books(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
    
    public void setName(String name) {
        this.name = name;
    }
     
    public void setBookGenres(Map<String,Integer>bookGenres) {
        this.bookGenres = bookGenres;
    }
}