package com.webapptest;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OpenbankController {

    /**
     * this are the restful apis that i should be exposed
     */

    public List<Backbase> transactions(){
    return null;
    }
    public List<Backbase> transactionsBasedOnFilters(){
        return null;
    }
    public int totalAmountForTransactionType(){
        return -1;
    }

}
