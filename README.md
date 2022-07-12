# hitokoto4j

[![CodeFactor](https://www.codefactor.io/repository/github/gerryyuu/hitokoto4j/badge)](https://www.codefactor.io/repository/github/gerryyuu/hitokoto4j)<br>
A simple Java API for [一言 Hitokoto](https://hitokoto.cn/).

### Usage

Add repository & dependence:
```groovy
repositories {
    maven {
        url "https://raw.githubusercontent.com/GerryYuu/repository/master/"
    }
}

dependencies {
    implementation('xyz.yuu8583:hitokoto4j:1.0.1')
}
```
Some examples:
```java
///Do some fast requests without any arguments.
FastHitokoto.request();
FastHitokoto.requestAndGetJson();

//Do some requests with arguments.
HitokotoBuilder hitokotoBuilder = new HitokotoBuilder()
        .addType(HitokotoType.LITERATURE)
        .addType(HitokotoType.ANIME)
        .setMinLength(1)
        .setMaxLength(15);
Hitokoto hitokoto = hitokotoBuilder.build();
HitokotoResponse hitokotoResponse = hitokoto.request();
hitokotoResponse.getHitokoto();
//...
```
