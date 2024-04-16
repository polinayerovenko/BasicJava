package lab3.controller;

import lab3.Creator;
import lab3.model.Uni;

public class Start {
    public static void main(String[]args){
        Creator creator = new DefaultCompCreat();
        UniCreat uniCreat = new UniCreat(creator);
        Uni uni = uniCreat.createTypicalUni("NTU DP");
    }
}
