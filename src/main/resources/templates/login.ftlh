<#import "parts/common.ftlh" as c>
<#import "parts/log_reg.ftlh" as l>

<@c.page>
    <h3><strong>Вход в аккаунт</strong></h3>
    <@l.login "/login" />
    <h4><a href="/registration">Регистрация</a></h4>
</@c.page>