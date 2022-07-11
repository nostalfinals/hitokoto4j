package xyz.yuu8583.hitokoto4j;

/**
 * @packageName: xyz.yuu8583.hitokoto4j.utils
 * @className: FastHitokoto
 * @author: GerryYuu
 * @date: 7/11/2022 4:23 PM
 */

public final class FastHitokoto {
    private FastHitokoto() {
    }

    public static HitokotoResponse request() {
        return new HitokotoBuilder().build().request();
    }

    public static String requestAndGetJson() {
        return new HitokotoBuilder().build().requestAndGetJson();
    }
}
