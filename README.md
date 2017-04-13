# ShiDianHttp
基于Volley的网络请求框架 （浓郁的iOS风格）

一、基本说明：
========
IDE：Mac Android Studio 2.2.3
系统：Android 4.0及以上

二、集成步骤：
========
1.下载加框并导入 shidian.com.shidianhttp 这个 package
2.内部使用了自定义的Application，需要在androidmanifest.xml中定义默认实例化的Application名字为：APPApplication
3.在build.gradle中添加依赖：compile 'com.mcxiaoke.volley:library:1.0.19'


三、快速使用：
========

#### 1.GET请求（url链接，map参数, delegatel回调）：
    
    ShiDianHttp.GET(url, map, new ShiDianHttpDelegate() {

       @Override
          public void successBlock(String dataString) {
          Log.d("charlin", "====请求成功:" + dataString);
        }

        @Override
          public void errorBlock(String dataString) {
          Log.d("charlin", "=====请求失败:" + dataString);
      }
    });


#### 2.POST请求（url链接，map参数, delegatel回调）：
    
    ShiDianHttp.POST(url, map, new ShiDianHttpDelegate() {
        @Override
        public void successBlock(String dataString) {
           Log.d("charlin","=====POST成功："+dataString);
        }

        @Override
        public void errorBlock(String dataString) {
            Log.d("charlin","=====POST失败："+dataString);
        }
    });
  

