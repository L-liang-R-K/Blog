<#include "../import/top.ftl">
<div class="panel">
    <div class="panel-body">
        <form class="form-horizontal" action="/blog/user/list" method="posts">
            <div class="form-group">
                <label for="userName" class="col-sm-2">用户名</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" name="userName" id="userName" placeholder="用户名">
                </div>
                <div class="col-sm-1">
                    <button type="submit">查询</button>
                </div>
            </div>
        </form>
    </div>
</div>
<#if userPage?? && userPage.list?size gt 0 >
    <h4><i class="i icon-info-sign"></i> 提示：被冻结的用户无法登录</h4>
    <div class="panel">
        <div class="panel-body">
            <table class="table">
                <thead>
                <tr>
                    <th>注册时间</th>
                    <th>用户名</th>
                    <th>是否冻结</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <#list userPage.list as user>
                    <tr>
                        <td>${(user.userRegisterTime)?string("yyyy-MM-dd HH:mm:ss")}</td>
                        <td>${(user.userName)!}</td>
                        <td>
                            <#if (user.userFrozen)?? && (user.userFrozen)==1>
                                <span class="label label-danger">冻结</span>
                            <#else >
                                <span class="label label-success">正常</span>
                            </#if>
                        </td>
                        <td>
                            <button type="button" class="btn btn-mini"><i class="icon icon-cog"></i> 修改</button>
                            <button type="button" class="btn btn-mini"><i class="icon icon-remove"></i>删除</button>
                        </td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
<#else >
    <div style="text-align: center;">
        <h3><i class="icon-coffee"></i></h3>
        <h3>暂无数据</h3>
    </div>
</#if>
<#include "../import/bottom.ftl">