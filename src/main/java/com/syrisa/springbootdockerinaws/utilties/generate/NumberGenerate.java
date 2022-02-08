package com.syrisa.springbootdockerinaws.utilties.generate;

import java.util.Random;
import java.util.function.Function;


public class NumberGenerate {

    public static Function<Integer,Long> numberGenerate = (size)->{
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1+new Random().nextInt(9));
        for (int i=0;i<size;i++){
            stringBuilder.append(new Random().nextInt(10));
        }
        return Long.parseLong(stringBuilder.toString());
    };

}
