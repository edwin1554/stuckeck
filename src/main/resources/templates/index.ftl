
<!DOCTYPE html>
<head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.css">
    <title>照片获取页面</title>
</head>
<body>
<br>
<br>
<br>
<br>
<div class="m-container m-padded-tb-big doubling">
    <div class="ui container doubling">
        <div class="ui row">
            <div class="seven wide column doubling">
                <div class="ui top attached segment">
                    <div class="ui header">校验照片</div>
                </div>
                <div class="ui attached segment ">
                    <form id="webDataForm" name="webDataForm" method="post" action="/getRecord" target="_blank">
                        <div class="ui labeled left icon input" style="width: 100%">
                            <i class="computer icon"></i>
                            <input id="userName"  type="text" name="userName" placeholder="请输入学号或者身份证号" value=${userName}>
                            <a class="ui tag label">
                                学号或者身份证号
                            </a>
                        </div>
                        <br>
                        <br>
                        <br>
                            <div class="two column row">
                                <div class="white column">
                                    <button class="fluid ui teal button" type="submit">点击获取照片</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>