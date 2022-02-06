package com.example.learnspringboot.converter;

import com.example.learnspringboot.bean.Pet2;
import org.springframework.core.convert.converter.Converter;

/**
 * @author Frankie
 * @since 2022-02-05 3:58 PM
 */
public class StringToPet2Converter implements Converter<String, Pet2> {
    @Override
    public Pet2 convert(String source) {
        String[] ans = source.split(",");
        Pet2 pet2 = new Pet2();
        pet2.setName(ans[0]);
        pet2.setWeight(Double.parseDouble(ans[1]));
        return pet2;
    }
}
