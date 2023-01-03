package accountComparisons;

class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfRegularMovies and noOfExclusiveMovies.
    
    Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies) {
        this.ownerName = ownerName;
        this.noOfRegularMovies = noOfRegularMovies;
        this.noOfExclusiveMovies = noOfExclusiveMovies;
    }

    // 2. This method returns the monthly cost for the account.
    int monthlyCost() {
        int cost = basePrice + (noOfRegularMovies * regularMoviePrice) + (noOfExclusiveMovies * exclusiveMoviePrice);
        return cost;     
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
    
    @Override
    public int compareTo(Account acc) {
        Account objAccount = new Account(ownerName, noOfRegularMovies, noOfExclusiveMovies);
    
        if (objAccount.monthlyCost() == acc.monthlyCost()) 
            return 0;
        else
        if (objAccount.monthlyCost() > acc.monthlyCost())
            return 1; 
        else 
            return -1;
        
    }
    
    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    
    @Override
    public String toString() {    
        return "Owner is " + this.ownerName +  " and monthly cost is " + monthlyCost() + " USD.";
    }
}
