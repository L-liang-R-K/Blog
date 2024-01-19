<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="//cdn.bootcdn.net/ajax/libs/zui/1.10.0/css/zui.min.css">
  <script src="//cdn.bootcdn.net/ajax/libs/zui/1.10.0/lib/jquery/jquery.js"></script>
  <script src="//cdn.bootcdn.net/ajax/libs/zui/1.10.0/js/zui.min.js"></script>
  <link rel="shortcut icon" href="/static.img/favicon.ico" type="image/x-icon">
  <link rel="icon" href="/static.img/favicon.ico" type="image/x-icon">
  <title>Blog</title>
</head>
<body>
<div class="container">
  <nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
                data-target=".navbar-collapse-example">
          <span class="sr-only">切换导航</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/">首页</a>
      </div>
      <div class="collapse navbar-collapse navbar-collapse-example">
        <ul class="nav navbar-nav">
          <li><a href="/blog/">基础数据</a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">用户管理 <b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="/blog/user/list">用户列表</a></li>
            </ul>
          </li>
          <li class="dropdown">
            <a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">文章管理 <b class="caret"></b></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="/blog/article/list">文章列表</a></li>
            </ul>
          </li>
          <li><a href="/blog/link">友情链接</a></li>
          <li><a href="/blog/ad">广告管理</a></li>
        </ul>
      </div>
    </div>
  </nav>