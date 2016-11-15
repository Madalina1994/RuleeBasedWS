package ruleBaseWS;

public class Bank {
    private int id;
    private String name;
    private String exchangeName;
    private int minCreditScore;

    public Bank( int id, String name, String exchangeName, int minCreditScore ) {
        this.id = id;
        this.name = name;
        this.exchangeName = exchangeName;
        this.minCreditScore = minCreditScore;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName( String exchangeName ) {
        this.exchangeName = exchangeName;
    }

    public int getMinCreditScore() {
        return minCreditScore;
    }

    public void setMinCreditScore( int minCreditScore ) {
        this.minCreditScore = minCreditScore;
    }    
}
