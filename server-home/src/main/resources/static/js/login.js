const obj = {
    init: () => {
        obj.loginPage();
    },
    //校验
    loginPage: (input) => {
        //成为焦点  
        $(".login_form input").on('focus', (e) => {
            $(e.target).parent().next(".errorText").slideUp(); 
        });
        //失去焦点
        $(".login_form input").blur((e) => {
            let name, filter;
            switch ($(e.target).attr('class')) {
                case "account":
                    name = "帐号";
                    filter = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/ || /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
                    break;
                case "password":
                    name = "密码";
                    filter = /^[a-zA-Z]\w{5,17}$/;
                    break;
            };
            obj.checkTip($(e.target), $(e.target).val(), filter, name);
        })
    },
    //校验封装
    checkTip: (cur, value, filter, name) => {
        if (value == '') {
            cur.css("border","1px solid #EF5B00");
            cur.parent().next(".errorText").slideDown().find("span").text("请输入" + name);
        } else if (!filter.test(value)) { //正则匹配
            cur.parent().next(".errorText").slideDown().find("span").text(name + "输入错误");
            cur.css("border","1px solid #EF5B00");
        } else {
            cur.css("border","1px solid #ccc");
            cur.parent().next(".errorText").slideUp();
        };
    }
}
$(function () {
    obj.init();
})