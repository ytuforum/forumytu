$(function(){

	$('#kayitForm').on('click',function() {

		$.ajax({
			url:'/user/signup',
			data:$('#kayitForm').serialize(),
			dataType:'json',
			success:function(){
				console.log('verigeldi');
			}

		});

	});

});