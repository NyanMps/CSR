JWT 的简单使用

推荐使用 SpringSecurity 或者 SpringSecurityOAuth

## 使用
在 JwtProperties 中配置好必要的信息，然后调用 JwtTokenUtil 中的方法即可；

其余的两个 Filter 是 SC 中 Zuul 的自定义过滤器参考，负责跨域和认证，简单示例。

跨域的处理可以交给 Nginx 来做，这样会更好。

PS：并不推荐使用 JWT，有很多问题。
