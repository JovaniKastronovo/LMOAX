<!-- START Off Sidebar (right)-->
<nav>
   <uib-tabset justified="true">
      <uib-tab>
         <uib-tab-heading>
            <em class="icon-equalizer fa-lg"></em>
         </uib-tab-heading>
         <div>
         	<%@ include file="/WEB-INF/views/partials/settings.jsp" %>
         </div>
      </uib-tab>
      <uib-tab>
         <uib-tab-heading>
            <em class="icon-user fa-lg"></em>
         </uib-tab-heading>
         <div>
            <div>
            	<%@ include file="/WEB-INF/views/partials/chat.jsp" %>
            </div>
         </div>
      </uib-tab>
   </uib-tabset>
</nav>
<!-- END Off Sidebar (right)-->