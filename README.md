# hitokoto4j

A simple Java API for [一言 Hitokoto](https://hitokoto.cn/).

### Usage

```java
///Do fast request without any arguments.
FastHitokoto.request();
FastHitokoto.requestAndGetJson();

//Do request with arguments.
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
