package xyz.yuu8583.hitokoto4j;

import xyz.yuu8583.hitokoto4j.utils.TypeUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @packageName: xyz.yuu8583.hitokoto4j
 * @className: HitokotoBuilder
 * @author: GerryYuu
 * @date: 7/11/2022 2:46 PM
 */

public class HitokotoBuilder {
    String url = "https://v1.hitokoto.cn/?encode=json&charset=utf-8";

    Set<HitokotoType> types;

    int minLength;
    int maxLength;

    String callback;

    String select;

    public HitokotoBuilder() {
        types = new HashSet<>();
        minLength = 0;
        maxLength = 30;
        select = ".hitokoto";
    }


    public HitokotoBuilder addType(HitokotoType hitokotoType) {
        this.types.add(hitokotoType);
        return this;
    }

    public HitokotoBuilder removeType(HitokotoType hitokotoType) {
        this.types.remove(hitokotoType);
        return this;
    }

    public HitokotoBuilder setMinLength(int minLength) {
        this.minLength = minLength;
        return this;
    }

    public HitokotoBuilder setMaxLength(int maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public HitokotoBuilder setCallback(String callback) {
        this.callback = callback;
        return this;
    }

    public HitokotoBuilder setSelect(String select) {
        this.select = select;
        return this;
    }

    public Hitokoto build() {
        StringBuilder stringBuilder = new StringBuilder().append(url);

        types.forEach(type -> stringBuilder.append("&c=").append(TypeUtils.getTypeWord(type)));

        stringBuilder.append("&min_length=").append(minLength);
        stringBuilder.append("&max_length=").append(maxLength);

        if (select != null) {
            stringBuilder.append("&select=").append(select);
        }

        if (callback != null) {
            stringBuilder.append("&callback=").append(callback);
        }

        return new Hitokoto(stringBuilder.toString());
    }
}
