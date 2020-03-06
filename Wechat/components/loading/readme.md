## 使用方法

导入模块：

``` json
{
  "component": true,
  "usingComponents": {
    "v-loading":"/components/loading/index"
  }
}
```

布局中使用：

``` html
<v-loading class="loading-center" wx:if="{{loadingCenter}}"/>
<v-loading class="loading" wx:if="{{loading}}"/>
```

通过 `wx:if` 来控制显示隐藏。

相关样式：

``` css
.loading {
    margin: 50rpx 0 50rpx 0;
}

.loading-center {
    position: absolute;
    top: 50%;
    left: 50%;
}
```

分为居中和顺序。