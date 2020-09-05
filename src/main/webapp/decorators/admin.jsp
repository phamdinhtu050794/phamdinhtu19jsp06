<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>

<title><dec:title default="Trang Chủ " /></title>


<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="<c:url value='/template/admin/assets/css/bootstrap.min.css'/> " />
<link rel="stylesheet"
	href="<c:url value='/template/adminassets/font-awesome/4.5.0/css/font-awesome.min.css'/> " />
<link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type='text/javascript'
	src='<c:url vlaue="/template/admin/js/jquery-2.2.3.min.js" /> '></script>
<script
	src="<c:url value='/template/admin/assets/js/jquery.2.1.1.min.js'/> "></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet" href="assets/css/fonts.googleapis.com.css" />

<!-- ace styles -->
<link rel="stylesheet"
	href="<c:url value='/template/admin/assets/css/ace.min.css'/> "
	class="ace-main-stylesheet" id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script
	src="<c:url value='/template/admin/assets/js/ace-extra.min.js'/> "></script>

</head>
<body class="no-skin">
	<%@include file="/common/admin/header.jsp" %>
	<div class="main-container"  id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>
			<%@include file="/common/admin/menu.jsp" %>
			
			
			<dec:body/>
			
			
			<%@include file="/common/admin/footer.jsp" %>
			
			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse display">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
			
			
			


	<script src="<c:url value='/template/admin/assets/js/bootstrap.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery-ui.custom.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery.ui.touch-punch.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery.easypiechart.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery.sparkline.index.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery.flot.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery.flot.pie.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/jquery.flot.resize.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/ace-elements.min.js'/> "></script>
	<script src="<c:url value='/template/admin/assets/js/ace.min.js'/> "></script>
	
	<script src="<c:url value='/template/admin/assets/js/jquery-ui.min.js'/> "></script>

</div>
</body>
</html>