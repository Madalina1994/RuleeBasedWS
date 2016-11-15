package ruleBaseWS;

import java.util.ArrayList;

public class RuleBaseResponse {
//    private ArrayList<String> relevantBanks;
//
//    public RuleBaseResponse( ArrayList<String> relevantBanks ) {
//        this.relevantBanks = relevantBanks;
//    }
//
//    public ArrayList<String> getRelevantBanks() {
//        return relevantBanks;
//    }
//
//    public void setRelevantBanks( ArrayList<String> relevantBanks ) {
//        this.relevantBanks = relevantBanks;
//    }

    private ArrayList<Bank> relevantBanks;

    public RuleBaseResponse( ArrayList<Bank> relevantBanks ) {
        this.relevantBanks = relevantBanks;
    }

    public ArrayList<Bank> getRelevantBanks() {
        return relevantBanks;
    }

    public void setRelevantBanks( ArrayList<Bank> relevantBanks ) {
        this.relevantBanks = relevantBanks;
    }
}
