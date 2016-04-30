<!-- top navbar-->
<header class="topnavbar-wrapper">
	<%@ include file="/WEB-INF/views/partials/top-navbar.jsp"%>
</header>
<!-- sidebar-->
<aside data-ng-controller="SidebarController" class="aside">
	<%@ include file="/WEB-INF/views/partials/sidebar.jsp"%>
</aside>
<!-- offsidebar-->
<aside class="offsidebar">
	<%@ include file="/WEB-INF/views/partials/offsidebar.jsp"%>
</aside>
<!-- Main section-->
<section>
	<!-- Page content-->
	<div data-ui-view="" data-autoscroll="false" data-ng-class="app.viewAnimation" class="content-wrapper"></div>
</section>
<!-- Page footer-->
<footer>
	<%@ include file="/WEB-INF/views/partials/footer.jsp"%>
</footer>