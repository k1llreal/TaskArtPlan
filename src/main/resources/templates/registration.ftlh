<#import "parts/common.ftlh" as c>
<#import "parts/log_reg.ftlh" as l>

<@c.page>
    <h3><strong>Регистрация нового пользователя</strong></h3>
    ${message!}
    <@l.reg "/registration" />
    <h4><a href="/login">Уже зарегистрирован</a></h4>
</@c.page>