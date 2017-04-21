$(function(){
	//限制只能输入数字和字母
	$('#username').blur(function(){
		var val = $('#username').val();
		//var reg = /^[\u4e00-\u9Fa5]+$/;
		var reg =/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if(reg.test(val)){
			$("#validate").css('display','none');
        	$("#validate span").html('');
        }else{
        	$("#validate").css('display','block');
			$("#validate span").html('请输入正确的邮箱！');
            return false;
        }
	});
	
	/*$('#username').autocomplete({
		autoFocus : true,
		delay : 0,
		source : function (request, response) {
			var hosts = ['qq.com','163.com', '263.com', 'gmail.com', 'hotmail.com'], //起始
			term = request.term, //获取输入值
			ix = term.indexOf('@'), //@
			name = term, //用户名
			host = '', //域名
			result = []; //结果
			//结果第一条是自己输入
			result.push(term);
			if (ix > -1) { //如果有@的时候
				name = term.slice(0, ix); //得到用户名
				host = term.slice(ix + 1); //得到域名
			}
			if (name) {
				//得到找到的域名
				var findedHosts = (host ? $.grep(hosts, function (value, index) {
					return value.indexOf(host) > -1;
				}) : hosts),
				//最终列表的邮箱
				findedResults = $.map(findedHosts, function (value, index) {
					return name + '@' + value;
				});
				//增加一个自我输入
				result = result.concat(findedResults);
			}
			response(result);
		},
	});*/
	
	$('#login').click(function(){
		
		/*var data = {
			username:$('#username').val(),
			password:$('#password').val()	
		};
		$.ajax({
			type:'POST',
			url:'toindex.do',
			data:data,
			dataType:'json',
			success:function(data){

				if(data.count == 0){
					alert('用户名不存在或者密码错误！');
					$('#username').attr('value','');
					$('#password').attr('value','');
				}else{
					window.location.href='index.do';
				}
			},
			error:function(data){
				alert('error');
			}
		})*/
		
		
		
	});
});