<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>风云员注册页面</title>
<%@include file="../common/head.jsp"%>
<script type="text/javascript">
//页面加载完成之后
	$(function () {
		//给验证码绑定一个点击事件
		$("#code_img").click(function () {
				this.src = "${basePath}/kaptcha.jpg?id="+new Date();
		})
		//给注册绑定一个点击事件
		$("#sub_btn").click(function () {
			//验证用户名,必须由字母,数字下划线组成,并且长度5-12位
			//获取用户名输入框内容
			var userNameText = $("#username").val();
			//创建正则表达式
			var usernameRege = /^\w{5,12}$/;
			//使用test方法验证
			if (!usernameRege.test(userNameText)){
				//4提示用户结果
				$("span.errorMsg").text("用户名不合法!")

				return false;
			}

			//验证密码,必须由字母,数字下划线组成,并且长度5-12位
			//获取用户名输入框内容
			var passwordText = $("#password").val();
			//创建正则表达式
			var passwordRege = /^\w{5,12}$/;
			//使用test验证
			if (!passwordRege.test(passwordText)){
				//提示用户结果
				$("span.errorMsg").text("密码不合法!")

				return false;
			}

			//验证确认密码:和密码相同
			var repwdText = $("#repwd").val();
			//和密码进行比较
			if (repwdText != passwordText){
				//提示用户
				$("span.errorMsg").text("密码输入不一致!")

				return false;
			}

			//验证邮箱 xxxx@xxx.com
			//1.获取邮箱里的内容
			var emailText = $("#email").val();
			var emailRege = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
			//使用test校验是否合法
			if (!emailRege.test(emailText)){
				//提示用户
				$("span.errorMsg").text("邮箱格式不合法!")

				return false;
			}

			//验证码校验现在只需要验证用户已经输入
			var codeText = $("#code").val();

			if (codeText == null || codeText == ""){
				$("span.errorMsg").text("验证码不能为空!")
				return false;
			}

			//去掉错误信息
			$("span.errorMsg").text("")
		})
	})
</script>
<style type="text/css">
	.login_form{
		height:420px;
		margin-top: 25px;
	}
	
</style>
</head>
<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
		</div>
		
			<div class="login_banner">
			
				<div id="l_content">
					<span class="login_word">欢迎注册</span>
				</div>
				
				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>注册风云会员</h1>
								<span class="errorMsg"></span>
							</div>
							<div class="form">
								<form action="/userServlet" method="post">
									<input type="hidden" name="action" value="regist"/>
									<label>用户名称：</label>
									<!--表单设计，当我们在浏览器中输入表单信息的时候，往往input文本输入框会记录下之前提交表单的信息，
									很容易暴露数据,autocomplete="off"属性可以完美的解决这个问题-->
									<input class="itxt" type="text" placeholder="请输入用户名" autocomplete="off" tabindex="1" name="username" id="username" />
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码" autocomplete="off" tabindex="1" name="password" id="password" />
									<br />
									<br />
									<label>确认密码：</label>
									<input class="itxt" type="password" placeholder="确认密码" autocomplete="off" tabindex="1" name="repwd" id="repwd" />
									<br />
									<br />
									<label>电子邮件：</label>
									<input class="itxt" type="text" placeholder="请输入邮箱地址" autocomplete="off" tabindex="1" name="email" id="email" />
									<br />
									<br />
									<label>验证码：</label>
									<input class="itxt" type="text" name="code" style="width: 50px;" id="code"/>
									<img alt="" src="/kaptcha.jpg" style="float: right; margin-right: 20px" id="code_img">
									<br />
									<br />
									<input type="submit" value="注册" id="sub_btn" />
									
								</form>
							</div>
							
						</div>
					</div>
				</div>
			</div>

		<%@include file="/pages/common/footer.jsp"%>
</body>
</html>