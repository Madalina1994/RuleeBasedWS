package ruleBaseWS;

import java.util.ArrayList;
import model.Bank;

public class RuleBaseResponse {
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
