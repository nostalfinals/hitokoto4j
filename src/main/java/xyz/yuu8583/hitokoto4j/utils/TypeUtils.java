package xyz.yuu8583.hitokoto4j.utils;

import xyz.yuu8583.hitokoto4j.HitokotoType;

/**
 * @packageName: xyz.yuu8583.hitokoto4j.utils
 * @className: TypeUtils
 * @author: GerryYuu
 * @date: 7/11/2022 4:30 PM
 */

public final class TypeUtils {
    public TypeUtils() {
    }

    public static String getTypeWord(HitokotoType type) {
        switch (type) {
            case GAME -> {
                return "c";
            }
            case ANIME -> {
                return "a";
            }
            case MOVIE -> {
                return "h";
            }
            case OTHER -> {
                return "g";
            }
            case POETRY -> {
                return "i";
            }
            case SNARKY -> {
                return "l";
            }
            case CARTOON -> {
                return "b";
            }
            case INTERNET -> {
                return "f";
            }
            case ORIGINAL -> {
                return "e";
            }
            case LITERATURE -> {
                return "d";
            }
            case PHILOSOPHY -> {
                return "k";
            }
            case NETEASE_MUSIC -> {
                return "j";
            }
            default -> {
                return null;
            }
        }
    }

    public static HitokotoType getType(String typeWord) {
        switch (typeWord) {
            case "c" -> {
                return HitokotoType.GAME;
            }
            case "a" -> {
                return HitokotoType.ANIME;
            }
            case "h" -> {
                return HitokotoType.MOVIE;
            }
            case "g" -> {
                return HitokotoType.OTHER;
            }
            case "i" -> {
                return HitokotoType.POETRY;
            }
            case "l" -> {
                return HitokotoType.SNARKY;
            }
            case "b" -> {
                return HitokotoType.CARTOON;
            }
            case "f" -> {
                return HitokotoType.INTERNET;
            }
            case "e" -> {
                return HitokotoType.ORIGINAL;
            }
            case "d" -> {
                return HitokotoType.LITERATURE;
            }
            case "k" -> {
                return HitokotoType.PHILOSOPHY;
            }
            case "j" -> {
                return HitokotoType.NETEASE_MUSIC;
            }
            default -> {
                return null;
            }
        }
    }
}