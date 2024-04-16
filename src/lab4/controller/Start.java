package lab4.controller;

import lab4.Creator;
import lab4.controller.DefaultCompCreat;
import lab4.controller.UniCreat;
import lab4.model.Uni;

public class Start {
    public static void main(String[]args){
        Creator creator = new DefaultCompCreat();
        UniCreat uniCreat = new UniCreat(creator);
        Uni uni = uniCreat.createTypicalUni("NTU DP");
    }
}
