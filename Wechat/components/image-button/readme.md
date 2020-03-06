## 使用方法

导入模块：

``` json
{
  "component": true,
  "usingComponents": {
    "x-button": "/components/image-button/index"
  }
}
```

布局中使用：

``` html
<x-button wx:if="{{!authorized}}" open-type="getUserInfo" class="avatar-position" bind:getuserinfo="onGetUserInfo">
  <image slot="img" class="avatar" src="/images/my/my.png" />
</x-button>

<image src="{{userInfo.avatarUrl}}" class="avatar" />
<text>{{userInfo.nickName}}</text>
```

通过 `wx:if` 来控制显示隐藏。

相关样式：

``` css
.avatar {
  width: 120rpx;
  height: 120rpx;
  overflow: hidden;
  border-radius: 50%;
}

.avatar-position {
  position: absolute;
  top: 255rpx;
}
```

做一个圆形的样式。

