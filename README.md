# BuglyHotFix
Bugly HotFix 初识


# [官网](https://bugly.qq.com/docs/user-guide/instruction-manual-android-hotfix/)

# run step

1.配置keys<br>
[build.gradle](https://github.com/yuanbinbinbin/BuglyHotFix/blob/master/app/build.gradle) line 21行  配置自己的打包属性

2.配置在Bugly平台申请的appId<br>
[FixApplicationLike](https://github.com/yuanbinbinbin/BuglyHotFix/blob/master/app/src/main/java/com/yb/buglyhotfix/application/FixApplicationLike.java) line 32 


# [打包URL](https://bugly.qq.com/docs/user-guide/instruction-manual-android-hotfix-demo/)
gradlew assembleRelease<br>
gradlew buildTinkerPatchRelease
