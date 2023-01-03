package filteringStrings;

class ItemSeparator {
    String name;
    Double price;
    Integer quantity;
    String rawinput;

    ItemSeparator(String rawinput) {
    
        String[] str = rawinput.split("\\$\\$##");
        name = str[0];  
        price = Double.valueOf(str[1]);
        quantity = Integer.valueOf(str[2]);               
    }
        
    String getName() {              
        return name;
    }
    
    Double getPrice() {
        return price;
    }
    
    Integer getQuantity() {
        return quantity;
    }
    
}
