<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="static/framework/css/bootstrap.min.css" rel="stylesheet">
<link href="static/framework/css/custom-theme/jquery-ui-1.10.0.custom.css" rel="stylesheet">
<link href="static/css/login.css" rel="stylesheet">
<title>登录界面</title>
</head>
<body>
	 <!-- <div id="main" class="container">		
		<form action="index.do" method="post">		
		<form action="" method="post">
			<h2 class="form-signin-heading text-center">欢迎登录</h2>
			<div class="input-group" id="signin_username">
				<span class="input-group-addon glyphicon glyphicon-user" id="span_username"></span>
				<input type="text" id="username" name ="username" class="form-control" placeholder="Email address" 
					aria-describedby="span_username" required autofocus/>
				
			</div>
			<div class="input-group" id="signin_password">
				<span class="input-group-addon glyphicon glyphicon-lock" id="span_password"></span>
				<input type="password" id="password" name ="password" class="form-control" 
					placeholder="Password" aria-describedby="span_password" required/>
				
			</div>
			<label class ="checkbox">
				<input type="checkbox" id="rememberpassword" value="remember-me" />记住密码
			</label>
			<button class="btn btn-lg btn-primary btn-block" id="login">登录</button> 
			<input type="submit" id="login" class="btn btn-lg btn-primary btn-block" value="登录" /> 
		</form>
		<div id="validate">
			<span></span>
		</div>
	</div> -->
	
	
	 <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">欢迎登录</h3>
                    </div>
                    <div class="panel-body">
                        <form action= "index.do" method="post">
                            <fieldset>
                                <div class="form-group input-group" id="signin_username">
                                	<span class="input-group-addon glyphicon glyphicon-user" id="span_username"></span>
                                    <input type="text" id="username" name ="f_username" class="form-control" placeholder="Email address" 
											aria-describedby="span_username" required autofocus/>
                                </div>
                                <div class="form-group input-group" id="signin_password">
									<span class="input-group-addon glyphicon glyphicon-lock" id="span_password"></span>
                                    <input type="password" id="password" name ="f_password" class="form-control" 
										placeholder="Password" aria-describedby="span_password" required/>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">记住密码
                                    </label>
                                </div>
                                <div class="row ">
	                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
	                                	<input type="submit" id="login" class="btn btn-lg btn-primary btn-block" value="登录" /> 
	                                </div>
                                	 <div class="col-lg-6 col-md-6  col-sm-6  col-xs-6">
	                                	<a href="index.do">
	                                		<input type="button" id="reg" class="btn btn-lg btn-primary btn-block" value="注册" />
	                                	</a> 
                                	</div>
                            	</div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
	<script src="static/framework/js/jquery-1.12.3.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/framework/js/bootstrap.min.js"></script>
    <script src="static/framework/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script type="text/javascript">
    	path='<%=basePath%>';

    </script>
    
    <script src="static/js/login.js"></script>
    
</body>
</html>