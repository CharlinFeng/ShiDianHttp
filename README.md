# ShiDianHttp
基于Volley的网络请求框架 （浓郁的iOS风格）

<br/><br/>
一、基本说明：
========
IDE：Mac Android Studio 2.2.3 <br/>
Android：支持4.0及以上版本

<br/><br/>
二、集成步骤：
========
1.下载加框并导入 shidian.com.shidianhttp 这个 package<br/>
2.内部使用了自定义的Application，需要在androidmanifest.xml中定义默认实例化的Application名字为：APPApplication<br/>
3.在build.gradle中添加依赖：compile 'com.mcxiaoke.volley:library:1.0.19'<br/>

<br/><br/>

三、快速使用：
========
<br/>

#### 1. GET请求（url链接，map参数, delegatel回调）：
    
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

<br/>


#### 2. POST请求（url链接，map参数, delegatel回调）：
    
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
  

